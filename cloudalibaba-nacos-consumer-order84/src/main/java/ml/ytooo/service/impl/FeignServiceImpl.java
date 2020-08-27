package ml.ytooo.service.impl;

import ml.ytooo.service.FeignService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * //TODO 添加类/接口功能描述 *
 * Created by Youdmeng on 2020/8/27 0027.
 */
@Service
public class FeignServiceImpl implements FeignService {

    @Override
    public String query(Integer id) {
        return "服务jaingji";
    }
}
