package com.cx.other.web;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cx.damai.entity.DmProduct;
import com.cx.damai.mapper.DmProductMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("product")
public class ProductDao {

    @Resource
    DmProductMapper productMapper;

    @RequestMapping("queryNewAndHot")
    Map<String, Object> queryNewAndHot(){
        //最新商品
        IPage<DmProduct> page = new Page<>(1,10);
        // 排序
        page.orders().add(OrderItem.desc("id"));
        IPage<DmProduct> iPage = productMapper.selectPage(page, null);
        List<DmProduct> news = iPage.getRecords();

        // 最热
        page = new Page<>(1,10);
        LambdaQueryWrapper<DmProduct> lqw = new LambdaQueryWrapper<>();
        lqw.eq(DmProduct::getIsHot,1);
        iPage = productMapper.selectPage(page, lqw);
        List<DmProduct> hots = iPage.getRecords();

        Map<String,Object> ret = new HashMap<>();
        ret.put("news",news);
        ret.put("hots",hots);

        return ret;

    }

}
