package macro.test.consumer.Contronller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 描述
 *
 * @author: Macro
 * @mail liqh@txtws.com
 * @date: 2019-06-04 10:06
 */
@RestController
public class TestController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/test-consumer", method = RequestMethod.GET)
    public String testController() {
        return restTemplate.getForEntity("http://macro-test-provider:7000/test/hello", String.class).getBody();
    }
}
