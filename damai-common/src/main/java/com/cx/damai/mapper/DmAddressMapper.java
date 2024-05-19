package com.cx.damai.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cx.damai.entity.DmAddress;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 大麦商城-地址表-1 Mapper 接口
 * </p>
 *
 * @author 廖老师
 * @since 2024-05-15
 */
@Mapper
@Component
public interface DmAddressMapper extends BaseMapper<DmAddress> {

}
