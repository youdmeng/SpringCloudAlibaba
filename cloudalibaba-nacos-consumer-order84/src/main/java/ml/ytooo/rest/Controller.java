package ml.ytooo.rest;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * //TODO 添加类/接口功能描述 *
 * Created by Youdmeng on 2020/8/27 0027.
 */
@RestController
public class Controller {

    private final static String URI = "http://cloudalibaba-nacos-provider-payment";

    @Autowired
    private RestTemplate template;

    @GetMapping("/query")
    @SentinelResource(value = "query",fallback = "handlerquery")
    public String query(Integer id) {
        if (id > 3) {
            throw new RuntimeException();
        }
        return template.getForObject(URI + "/query?id=" + id, String.class);
    }

    public String handlerquery(Integer id, Throwable throwable) {
        return "================= handlerquery ===================";
    }

}
