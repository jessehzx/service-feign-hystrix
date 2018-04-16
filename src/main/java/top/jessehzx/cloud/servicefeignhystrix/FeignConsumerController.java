package top.jessehzx.cloud.servicefeignhystrix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import top.jessehzx.cloud.servicefeignhystrix.depend.ComputeClient;

/**
 * @author jessehzx
 * @Date 2018/4/10
 */
@RestController
public class FeignConsumerController {

    // 注入服务提供者,远程的Http服务
    @Autowired
    private ComputeClient computeClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
        return computeClient.add(2, 3);
    }

}
