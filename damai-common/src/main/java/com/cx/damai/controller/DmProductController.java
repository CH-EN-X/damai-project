package com.cx.damai.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cx.damai.service.DmProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 大麦商城-商品表-73 前端控制器
 * </p>
 *
 * @author cx
 */
@Slf4j
@RestController
@RequestMapping("dmProduct")
public class DmProductController {

    @Autowired
    private DmProductService  dmProductService;
}
