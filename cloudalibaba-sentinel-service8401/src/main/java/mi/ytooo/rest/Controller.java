package mi.ytooo.rest;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created by Youdmeng on 2020/8/26 0026.
 */
@RestController
@Slf4j
public class Controller {

    private static int yo = 0;

    @GetMapping(value = "/a")
    @SentinelResource(value = "a", blockHandler = "hand_a")
    public String limitA() {
        return "=================== limit A ===================";
    }

    public String hand_a(BlockException e) {
        return "=================== limit A 降级 ===================";
    }


    @GetMapping(value = "/b")
    public String limitB() {
        return "=================== limit B ===================";
    }
    @GetMapping(value = "/d")
    public String limitD() throws InterruptedException {

        yo++;
        if (yo % 2 != 0) {
            throw new RuntimeException();
        }
        return "=================== limit D ===================";
    }

    @GetMapping(value = "/hot")
    @SentinelResource(value = "hot", blockHandler = "deal_hot")
    public String hot(String p1, String p2) {
        return "========================== 热点通过 ==========================";
    }

    public String deal_hot(String p1, String p2, BlockException e) {
        return "========================== 热点降级 ==========================";
    }
}
