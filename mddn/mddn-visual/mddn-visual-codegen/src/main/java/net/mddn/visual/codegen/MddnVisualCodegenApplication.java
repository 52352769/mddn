package net.mddn.visual.codegen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MddnVisualCodegenApplication {

    public static void main(String[] args) {
        SpringApplication.run(MddnVisualCodegenApplication.class, args);
    }

}
