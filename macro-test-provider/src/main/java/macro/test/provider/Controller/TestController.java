package macro.test.provider.Controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 描述
 *
 * @author: Macro
 * @mail liqh@txtws.com
 * @date: 2019-06-03 17:30
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {


    @GetMapping(value = "/hello")
    @ResponseBody
    public String hello() {
        System.out.println("hello host:");
        return "test";
    }
}
