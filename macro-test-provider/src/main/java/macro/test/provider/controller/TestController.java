package macro.test.provider.controller;

import com.alibaba.fastjson.JSONObject;
import macro.test.api.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.ValidationEvent;

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


    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello() {
        System.out.println("hello host:");
        return "test";
    }

    @RequestMapping(value = "/json")
    @ResponseBody
    public String hello(@RequestBody JSONObject jsonObject) {
        return jsonObject.toJSONString();
    }

    @RequestMapping(value = "/user")
    @ResponseBody
    public String hello(@RequestBody User user) {
        return JSONObject.toJSONString(user);
    }
}
