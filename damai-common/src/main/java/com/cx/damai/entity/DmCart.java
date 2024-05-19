package com.cx.damai.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * <p>
 * 大麦商城-购物车-2
 * </p>
 *
 * @author 廖老师
 * @since 2024-05-15
 */
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


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "DmCart{" +
        "id=" + id +
        ", uid=" + uid +
        ", pid=" + pid +
        ", count=" + count +
        "}";
    }
}
