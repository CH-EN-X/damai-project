package com.cx.damai.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 大麦商城-订单表-73
 * </p>
 *
 * @author 廖老师
 * @since 2024-05-15
 */
@TableName("dm_orders")
@Data
public class DmOrders implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号, 自增列
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 总金额
     */
    private Double total;

    /**
     * 订单时间
     */
    private LocalDateTime createtime;

    /**
     * 状态: 0未支付,1已支付,2已发货,3已收货,4已评价,5已退货
     */
    private Integer state;

    /**
     * 用户id
     */
    private Integer uid;

    /**
     * 收货地址id: 关联 dm_address.id
     */
    private Integer aid;

    @TableField(exist = false)
    private List<DmOrderitem> items;

}
