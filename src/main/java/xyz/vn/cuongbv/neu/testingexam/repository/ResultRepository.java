package xyz.vn.cuongbv.neu.testingexam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.vn.cuongbv.neu.testingexam.entity.Result;

@Repository
public interface ResultRepository extends JpaRepository<Result, Integer> {
}