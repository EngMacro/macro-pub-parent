package macro.feign.consumer.fallbacks;

import com.alibaba.fastjson.JSONObject;
import macro.feign.consumer.interfaces.FeignService;
import org.springframework.context.annotation.Configuration;

/**
 * 描述
 *
 * @author: Macro
 * @mail liqh@txtws.com
 * @date: 2019-06-11 14:26
 */
@Configuration
public class FeignFallback implements FeignService {


    @Override
    public String hello() {
        return "error hello";
    }

    @Override
    public String hello(JSONObject jsonObject) {
        return "error hello json";
    }
}
