package ml.ytooo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * //TODO 添加类/接口功能描述 *
 * Created by Youdmeng on 2020/8/26 0026.
 */
@Service
@FeignClient(value = "cloudalibaba-nacos-provider-payment")
public interface FenclientService {

    @GetMapping("/provide")
    public String provide();
}
