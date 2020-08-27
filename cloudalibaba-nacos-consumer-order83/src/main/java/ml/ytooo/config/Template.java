package ml.ytooo.config;

import com.netflix.ribbon.http.HttpRequestTemplate;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * //TODO 添加类/接口功能描述 *
 * Created by Youdmeng on 2020/8/26 0026.
 */
@Configuration
public class Template {


    @Bean
    @LoadBalanced
    public RestTemplate getTemp() {
        return new RestTemplate();
    }

}
