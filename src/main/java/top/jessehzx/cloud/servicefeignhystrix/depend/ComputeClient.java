package top.jessehzx.cloud.servicefeignhystrix.depend;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import top.jessehzx.cloud.servicefeignhystrix.ComputeClientFallback;

/**
 * @author jessehzx
 * @date 2018/4/16
 */
@FeignClient(value = "COMPUTE-SERVICE", fallback = ComputeClientFallback.class)
public interface ComputeClient {

    @RequestMapping(method = RequestMethod.GET, value = "/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);

}
