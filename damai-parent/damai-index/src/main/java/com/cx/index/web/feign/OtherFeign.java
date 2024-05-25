package com.cx.index.web.feign;

import com.cx.damai.entity.DmProduct;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@FeignClient("damai-other")
@Component
public interface OtherFeign {

    @RequestMapping("product/queryNewAndHot")
    Map<String, List<DmProduct>> queryNewAndHot();

}
