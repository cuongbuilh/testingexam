package xyz.vn.cuongbv.neu.testingexam.lib.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseDataResponse<T> {
    @JsonProperty("status")
    private Status status;

    @JsonProperty("body")
    private T body;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Status{
        @JsonProperty("code")
        private String code;

        @JsonProperty("message")
        private String message;

        @JsonProperty("displayMessage")
        private String displayMessage;
    }
}
