package xyz.vn.cuongbv.neu.testingexam.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController("{$prefixUrl}/subject")
@CrossOrigin("*")
@RequiredArgsConstructor
@Log4j
public class SubjectController {
}
