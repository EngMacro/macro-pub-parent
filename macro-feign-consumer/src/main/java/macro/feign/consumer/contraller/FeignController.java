package macro.feign.consumer.contraller;

import com.alibaba.fastjson.JSONObject;
import macro.feign.consumer.interfaces.HelloService;
import org.bouncycastle.cert.ocsp.Req;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 描述
 *
 * @author: Macro
 * @mail liqh@txtws.com
 * @date: 2019-06-10 13:40
 */
@Controller
@RequestMapping(value = "/feign")
public class FeignController {
    @Autowired
    HelloService service;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ResponseBody
    public String test(){
        return service.hello();
    }

    @RequestMapping(value = "/json")
    @ResponseBody
    public String testJson(@RequestBody JSONObject object){
        return service.hello(object);
    }
}
