package kr.co.remote_hub.service;

import kr.co.remote_hub.dto.MqttPublishDto;
import lombok.RequiredArgsConstructor;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MqttPublishService {
    private final MqttClient client;

    public void sendMessage(MqttPublishDto publishDto) {
        try {
            client.publish(publishDto.getTopic(), new MqttMessage(publishDto.getMessage().getBytes()));
        } catch (MqttException e) {
            throw new RuntimeException(e);
        }
    }
}
