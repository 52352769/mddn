package net.mddn.visual.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MddnVisualMonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(MddnVisualMonitorApplication.class, args);
    }

}
