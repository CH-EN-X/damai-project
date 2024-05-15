package com.cx.damai.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cx.damai.service.DmOrderitemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 大麦商城-订单明细表-77 前端控制器
 * </p>
 *
 * @author cx
 */
@Slf4j
@RestController
@RequestMapping("dmOrderitem")
public class DmOrderitemController {

    @Autowired
    private DmOrderitemService  dmOrderitemService;
}
