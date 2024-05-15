package com.cx.damai.service.impl;

import com.cx.damai.po.DmCart;
import com.cx.damai.mapper.DmCartMapper;
import com.cx.damai.service.DmCartService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 大麦商城-购物车-2 服务实现类
 * </p>
 *
 * @author cx
 */
@Slf4j
@Service
public class DmCartServiceImpl extends ServiceImpl<DmCartMapper, DmCart> implements DmCartService {

}
