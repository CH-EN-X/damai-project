package com.cx.damai.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * <p>
 * 大麦商城-用户表-4
 * </p>
 *
 * @author cx
 */
@Data
@TableName("dm_user")
public class DmUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号, 自增列
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 英文名(账号)
     */
    private String ename;

    /**
     * 中文名(昵称)
     */
    private String cname;

    /**
     * 密码
     */
    private String password;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 电话
     */
    private String phone;

    /**
     * 性别
     */
    private String sex;

    /**
     * 状态: 1正常, 0注销
     */
    private Integer state;

    /**
     * 注册时间
     */
    private LocalDateTime createtime;


}
