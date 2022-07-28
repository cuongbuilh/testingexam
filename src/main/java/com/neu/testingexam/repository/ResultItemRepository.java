package com.neu.testingexam.repository;

import com.neu.testingexam.domain.ResultItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultItemRepository extends JpaRepository<ResultItem, Integer> {}
