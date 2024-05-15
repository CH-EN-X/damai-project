package com.cx.damai.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * <p>
 * 大麦商城-管理员表-1
 * </p>
 *
 * @author cx
 */
@Data
@TableName("dm_adminuser")
public class DmAdminuser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号, 自增列
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;


}
