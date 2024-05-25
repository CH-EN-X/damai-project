package com.cx.index.web;

import com.cx.index.web.feign.OtherFeign;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class IndexDo {

    @Resource
    OtherFeign otherFeign;

    @RequestMapping("queryNewAndHot")
    Object queryNewAndHot(){
        return otherFeign.queryNewAndHot();
    }

}
