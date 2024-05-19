package com.cx.damai.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 大麦商城-地址表-1
 * </p>
 *
 * @author 廖老师
 * @since 2024-05-15
 */
@TableName("dm_address")
public class DmAddress implements Serializable {

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
     * 详细地址
     */
    private String addr;

    /**
     * 收货人电话
     */
    private String phone;

    /**
     * 收货人姓名
     */
    private String name;

    /**
     * 默认地址 1默认
     */
    private Boolean dft;

    /**
     * 创建时间, 默认当前时间
     */
    private LocalDateTime createtime;


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

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getDft() {
        return dft;
    }

    public void setDft(Boolean dft) {
        this.dft = dft;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "DmAddress{" +
        "id=" + id +
        ", uid=" + uid +
        ", addr=" + addr +
        ", phone=" + phone +
        ", name=" + name +
        ", dft=" + dft +
        ", createtime=" + createtime +
        "}";
    }
}
