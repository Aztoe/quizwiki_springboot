package util;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CalcUtil {
	public static List<Integer> makePagingSeq(int n, int size , int max){
		List<Integer> seq = new ArrayList<Integer>();
		int pageIndex = (n-1)/size;
		int start = pageIndex*size;
		for(int i= start+1; i<= start+size; i++) {
			if(i> max) break;
			seq.add(i);
		}
		
		return seq;
	}
	
	public static boolean loginCheck(HttpServletRequest req) {
//		HttpSession session = req.getSession(false);
//		Object user = null;
//		
//		if(session != null) {
//			user = session.getAttribute("user");
//		}
//		
//		return (user!=null);
		
		return true;
	}
	
	
	public static <T> JsonNode getJsonStringAsResForm(T obj, String msg) {
		ObjectMapper mapper = new ObjectMapper();
		String data = "error";
	    try {
	    	data = mapper.writeValueAsString(obj);
	    }catch(JsonProcessingException e){
	    	e.printStackTrace();
	    }
	    
	    JsonNode jnode = mapper.createObjectNode()
                .put("data", data)
                .put("msg", msg);
	    return jnode;
	}
}
