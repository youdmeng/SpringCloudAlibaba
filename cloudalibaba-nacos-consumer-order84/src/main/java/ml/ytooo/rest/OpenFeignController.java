package ml.ytooo.rest;

import ml.ytooo.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * //TODO 添加类/接口功能描述 *
 * Created by Youdmeng on 2020/8/27 0027.
 */
@RestController
public class OpenFeignController {

    @Autowired
    private FeignService feignService;

    @GetMapping(value = "/feign")
    public String feign(Integer id) {
        return feignService.query(id);
    }



}
