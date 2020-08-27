package ml.ytooo.rest;

import ml.ytooo.service.FenclientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * //TODO 添加类/接口功能描述 *
 * Created by Youdmeng on 2020/8/26 0026.
 */
@RestController
public class Controller {

    @Autowired
    private FenclientService service;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/provide")
    public String provide() {
//        return restTemplate.getForObject("http://cloudalibaba-nacos-provider-payment/provide", String.class);
        return service.provide();
    }


}
