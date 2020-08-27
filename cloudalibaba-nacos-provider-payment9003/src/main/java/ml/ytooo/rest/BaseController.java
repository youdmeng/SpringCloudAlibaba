package ml.ytooo.rest;

import ml.ytooo.http.Response;
import ml.ytooo.http.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * //TODO 添加类/接口功能描述 *
 * Created by Youdmeng on 2020/8/27 0027.
 */
@RestController
public class BaseController {

    private static Map<Integer, String> map = new HashMap<>();


    static {
        map.put(1, "yo-28-男");
        map.put(2, "cat-4-女");
        map.put(3, "?-??-女");
    }

    @GetMapping(value = "/query")
    public String query(@RequestParam(required = false) Integer id) {
        return "[9003] " + map.get(id);
    }

}
