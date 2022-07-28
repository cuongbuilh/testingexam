package com.neu.testingexam.repository;

import com.neu.testingexam.domain.ExamQuestionAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamQuestionAnswerRepository extends JpaRepository<ExamQuestionAnswer, Integer> {}
