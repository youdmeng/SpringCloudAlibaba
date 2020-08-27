package ml.ytooo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * //TODO 添加类/接口功能描述 *
 * Created by Youdmeng on 2020/8/26 0026.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class NacosConsumer83 {
    public static void main(String[] args) {
        SpringApplication.run(NacosConsumer83.class, args);
    }
}
