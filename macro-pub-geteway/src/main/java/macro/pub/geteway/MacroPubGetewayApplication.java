package macro.pub.geteway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class MacroPubGetewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MacroPubGetewayApplication.class, args);
    }

}
