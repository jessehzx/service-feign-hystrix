package top.jessehzx.cloud.servicefeignhystrix;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import top.jessehzx.cloud.servicefeignhystrix.depend.ComputeClient;

/**
 * @author jessehzx
 * @date 2018/4/16
 */
@Component
public class ComputeClientFallback implements ComputeClient{

    @Override
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -1;
    }
}
