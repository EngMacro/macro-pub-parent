package macro.test.consumer.contronller;

import macro.test.consumer.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试用的Controller
 *
 * @author: Macro
 * @mail liqh@txtws.com
 * @date: 2019-06-04 10:06
 */
@RestController
public class TestController {
    @Autowired
    TestService service;

    @RequestMapping(value = "/test-consumer", method = RequestMethod.GET)
    public String testController() {
        return service.testService();
    }
}
