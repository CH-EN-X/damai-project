package com.cx.damai.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * <p>
 * 大麦商城-订单明细表-77
 * </p>
 *
 * @author 廖老师
 * @since 2024-05-15
 */
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


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    @Override
    public String toString() {
        return "DmOrderitem{" +
        "id=" + id +
        ", count=" + count +
        ", total=" + total +
        ", pid=" + pid +
        ", oid=" + oid +
        "}";
    }
}
