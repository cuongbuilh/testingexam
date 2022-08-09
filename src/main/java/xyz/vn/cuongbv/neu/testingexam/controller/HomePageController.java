package xyz.vn.cuongbv.neu.testingexam.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.vn.cuongbv.neu.testingexam.client.homepage.HomePageInfoResponse;
import xyz.vn.cuongbv.neu.testingexam.lib.client.BaseDataResponse;
import xyz.vn.cuongbv.neu.testingexam.lib.util.ResponseUtil;
import xyz.vn.cuongbv.neu.testingexam.service.HomePageService;

@RestController("{$prefixUrl}/home")
@CrossOrigin("*")
@RequiredArgsConstructor
@Log4j
public class HomePageController {
    private final HomePageService homePageService;

    @PostMapping("/information")
    public ResponseEntity<BaseDataResponse<HomePageInfoResponse>> getHomeInformation() {
        log.info("call getHomeInformation");
        try {
            return ResponseUtil.wrap(homePageService.getHomePageInformation());
        } catch (Exception exception) {
            log.error(exception.getMessage(), exception);
            return ResponseUtil.generateErrorResponse(exception);
        }
    }
}
