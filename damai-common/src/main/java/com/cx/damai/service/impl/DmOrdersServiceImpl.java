package com.cx.damai.service.impl;

import com.cx.damai.po.DmOrders;
import com.cx.damai.mapper.DmOrdersMapper;
import com.cx.damai.service.DmOrdersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 大麦商城-订单表-73 服务实现类
 * </p>
 *
 * @author cx
 */
@Slf4j
@Service
public class DmOrdersServiceImpl extends ServiceImpl<DmOrdersMapper, DmOrders> implements DmOrdersService {

}
