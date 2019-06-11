package macro.feign.consumer.interfaces;

import com.alibaba.fastjson.JSONObject;
import macro.feign.consumer.fallbacks.FeignFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 描述
 *
 * @author: Macro
 * @mail liqh@txtws.com
 * @date: 2019-06-10 13:37
 */
@FeignClient(value = "macro-test-provider", fallback = FeignFallback.class)
public interface FeignService {
    @RequestMapping(value = "/test/hello")
    public String hello();

    @RequestMapping(value = "/test/json")
    public String hello(@RequestBody JSONObject jsonObject);
}
