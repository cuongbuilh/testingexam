package xyz.vn.cuongbv.neu.testingexam.lib.util;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import xyz.vn.cuongbv.neu.testingexam.lib.client.BaseDataResponse;

public class ResponseUtil {
    private ResponseUtil(){}

    public static <X> ResponseEntity<X> wrap(Object o){
        return wrap(null, o);
    }

    public static <X> ResponseEntity<X> wrap(HttpHeaders header, Object o){
        BaseDataResponse<Object> res = new BaseDataResponse<>();
        BaseDataResponse.Status status = new BaseDataResponse.Status();
        res.setBody(o);
        res.setStatus(status);
        return new ResponseEntity<>((X)res, header, HttpStatus.OK);
    }

    public static <X> ResponseEntity<X> generateErrorResponse(Exception exception){
        return new ResponseEntity<>((X) new Object(), HttpStatus.OK);
    }
}
