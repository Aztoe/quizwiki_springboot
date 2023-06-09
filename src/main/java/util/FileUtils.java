package util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.multi.quizwiki.qboard.dto.FileRequest;

@Component
public class FileUtils {
	 private final String uploadPath = Paths.get("C:", "quizwiki", "upload-files").toString();

	    /**
	     * 다중 파일 업로드
	     * @param multipartFiles - 파일 객체 List
	     * @return DB에 저장할 파일 정보 List
	     */
	    public List<FileRequest> uploadFiles(final List<MultipartFile> multipartFiles) {
	        List<FileRequest> files = new ArrayList<>();
	        for (MultipartFile multipartFile : multipartFiles) {
	            if (multipartFile.isEmpty()) {
	                continue;
	            }
	            files.add(uploadFile(multipartFile));
	        }
	        return files;
	    }

	    /**
	     * 단일 파일 업로드
	     * @param multipartFile - 파일 객체
	     * @return DB에 저장할 파일 정보
	     */
	    public FileRequest uploadFile(final MultipartFile multipartFile) {

	        if (multipartFile.isEmpty()) {
	            return null;
	        }

	        String save_Name = generateSaveFilename(multipartFile.getOriginalFilename());
	        String today = LocalDate.now().format(DateTimeFormatter.ofPattern("yyMMdd")).toString();
	        String uploadPath = getUploadPath(today) + File.separator + save_Name;
	        File uploadFile = new File(uploadPath);

	        try {
	            multipartFile.transferTo(uploadFile);
	        } catch (IOException e) {
	            throw new RuntimeException(e);
	        }

	      return FileRequest.builder()
	    		  .original_Name(multipartFile.getOriginalFilename())
	      			.save_Name(save_Name)
	      			.size(multipartFile.getSize())
	      			.build();
	    }

	    /**
	     * 저장 파일명 생성
	     * @param filename 원본 파일명
	     * @return 디스크에 저장할 파일명
	     * uuid를 사용하는 이유는 유저가 업로드한 파일명을 그대로 올리게 되면 다른 유저와 파일명이 같을경우 
	     * 충돌이 날 수도 있기 때문
	     */
	    private String generateSaveFilename(final String filename) {
	        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
	        //확장자 명
	        String extension = StringUtils.getFilenameExtension(filename);
	        return uuid + "." + extension;
	    }

	    /**
	     * 업로드 경로 반환
	     * @return 업로드 경로
	     */
	    private String getUploadPath() {
	        return makeDirectories(uploadPath);
	    }

	    /**
	     * 업로드 경로 반환
	     * @param addPath - 추가 경로
	     * @return 업로드 경로
	     */
	    private String getUploadPath(final String addPath) {
	        return makeDirectories(uploadPath + File.separator + addPath);
	    }

	    /**
	     * 업로드 폴더(디렉터리) 생성
	     * @param path - 업로드 경로
	     * @return 업로드 경로
	     */
	    private String makeDirectories(final String path) {
	        File dir = new File(path);
	        if (dir.exists() == false) {
	            dir.mkdirs();
	        }
	        return dir.getPath();
	    }	

	}

