package net.mddn.visual.sentinel.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MddnVisualSentinelDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(MddnVisualSentinelDashboardApplication.class, args);
    }

}
