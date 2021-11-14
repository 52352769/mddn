package net.mddn.auth;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@EnableDiscoveryClient
public class MddnAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(MddnAuthApplication.class, args);
    }

/*    @RefreshScope
    @RestController
    @RequestMapping("/auth")
    class AuthController{

        @Value("${mddn.auth}")
        public String aa;

        @GetMapping("/aa")
        public String aa(){
            return this.aa;
        }

    }*/



    @RestController
    @RequestMapping("/auth")
    class AuthController{

        @GetMapping("/aa")
        public String aa(){
            return "this.aa";
        }

    }

}
