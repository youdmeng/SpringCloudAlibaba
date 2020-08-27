package ml.ytooo.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * //TODO 添加类/接口功能描述 *
 * Created by Youdmeng on 2020/8/26 0026.
 */
@RestController
@Slf4j
public class Controller {

    @GetMapping("/provide")
    public String provide() {
        return "cloudalibaba-nacos-provider-payment9002";
    }

}
