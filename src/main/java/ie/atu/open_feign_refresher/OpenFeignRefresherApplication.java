package ie.atu.open_feign_refresher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class OpenFeignRefresherApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenFeignRefresherApplication.class, args);
    }

}
