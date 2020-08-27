package ml.ytooo.service;

import ml.ytooo.service.impl.FeignServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * //TODO 添加类/接口功能描述 *
 * Created by Youdmeng on 2020/8/27 0027.
 */
@FeignClient(value = "cloudalibaba-nacos-provider-payment",fallback = FeignServiceImpl.class)
public interface FeignService {
    @GetMapping(value = "/query")
    public String query(@RequestParam(value = "id",required = false) Integer id);
}
