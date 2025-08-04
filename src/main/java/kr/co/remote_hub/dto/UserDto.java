package kr.co.remote_hub.dto;

import lombok.Builder;
import lombok.Getter;

public class UserDto {
    @Getter
    @Builder
    public static class CreateRequest {
        private String id;
    }

    public static class UpdateRequest {
        private String password;
    }

    @Getter
    @Builder
    public static class Response {
        private String id;
        private String message;
    }
}
