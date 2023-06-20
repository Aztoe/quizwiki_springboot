package com.multi.quizwiki.qboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multi.quizwiki.qboard.entity.QboardEntity;

public interface QboardRepository extends JpaRepository<QboardEntity, Long> {

}
