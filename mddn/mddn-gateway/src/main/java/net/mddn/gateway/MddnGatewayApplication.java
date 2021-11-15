package net.mddn.gateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
public class MddnGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MddnGatewayApplication.class, args);
    }


    @RefreshScope
    @RestController
    @RequestMapping("/gitAuth")
    class AuthController{

        @Value("${mddn.gateway}")
        public String aa;

        @GetMapping("/aa")
        public String aa(){
            return this.aa;
        }

    }

}
