package kr.co.remote_hub.config;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MqttConfig {

    @Value("${mqtt.serverUrl}")
    private String serverUrl;

    @Value("${mqtt.clientId}")
    private String clientId;

    @Bean
    public MqttConnectOptions mqttConnectOptions() {
        MqttConnectOptions options = new MqttConnectOptions();
        options.setServerURIs(new String[]{serverUrl});
        options.setCleanSession(true);

        return options;
    }

    @Bean
    public MqttClient mqttClient() {
        try {
            MqttClient client = new MqttClient(serverUrl, clientId, new MemoryPersistence());
            client.connect(mqttConnectOptions());

            return client;
        } catch (MqttException e) {
            throw new RuntimeException(e);
        }
    }
}
