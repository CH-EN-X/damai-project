package com.cx.damai.service.impl;

import com.cx.damai.po.DmAddress;
import com.cx.damai.mapper.DmAddressMapper;
import com.cx.damai.service.DmAddressService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 大麦商城-地址表-1 服务实现类
 * </p>
 *
 * @author cx
 */
@Slf4j
@Service
public class DmAddressServiceImpl extends ServiceImpl<DmAddressMapper, DmAddress> implements DmAddressService {

}
