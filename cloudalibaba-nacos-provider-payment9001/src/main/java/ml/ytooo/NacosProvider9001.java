package ml.ytooo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * //TODO 添加类/接口功能描述 *
 * Created by Youdmeng on 2020/8/26 0026.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosProvider9001 {
    public static void main(String[] args) {
        SpringApplication.run(NacosProvider9001.class);
    }
}
