package com.cx.damai.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * <p>
 * 大麦商城-地址表-1
 * </p>
 *
 * @author cx
 */
@Data
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


}
