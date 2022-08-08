package xyz.vn.cuongbv.neu.testingexam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.vn.cuongbv.neu.testingexam.entity.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer> {
}