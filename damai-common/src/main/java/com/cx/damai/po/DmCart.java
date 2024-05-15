package com.cx.damai.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * <p>
 * 大麦商城-购物车-2
 * </p>
 *
 * @author cx
 */
@Data
@TableName("dm_cart")
public class DmCart implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号, 自增列
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户编号
     */
    private Integer uid;

    /**
     * 商品编号
     */
    private Integer pid;

    /**
     * 商品数量
     */
    private Integer count;


}
