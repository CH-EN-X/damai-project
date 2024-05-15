package com.cx.damai.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * <p>
 * 大麦商城-订单明细表-77
 * </p>
 *
 * @author cx
 */
@Data
@TableName("dm_orderitem")
public class DmOrderitem implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号, 自增列
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商品数量
     */
    private Integer count;

    /**
     * 商品金额
     */
    private Double total;

    /**
     * 商品编号:关联dm_product.id
     */
    private Integer pid;

    /**
     * 订单编号:关联dm_orders.id
     */
    private Integer oid;


}
