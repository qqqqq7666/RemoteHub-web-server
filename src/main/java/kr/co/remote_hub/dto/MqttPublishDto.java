package kr.co.remote_hub.dto;

import lombok.Getter;

@Getter
public class MqttPublishDto {
    private String topic;
    private String message;
}
