package kr.co.remote_hub.controller;

import kr.co.remote_hub.dto.MqttPublishDto;
import kr.co.remote_hub.service.MqttPublishService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/mqtt-publish")
public class MqttPublishController {
    private final MqttPublishService mqttPublishService;

    @PostMapping
    public void sendMessage(@RequestBody MqttPublishDto publishDto) {
        mqttPublishService.sendMessage(publishDto);
    }
}
