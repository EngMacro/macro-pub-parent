package macro.test.consumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 测试用的Service
 *
 * @author: Macro
 * @mail liqh@txtws.com
 * @date: 2019-06-06 14:23
 */
@Service
public class TestService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "testFallback")
    public String testService(){
        return restTemplate.getForEntity("http://macro-test-provider:7000/test/hello", String.class).getBody();
    }

    public String testFallback(){
        return "error";
    }
}
