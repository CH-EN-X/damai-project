package com.cx.damai.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * <p>
 * 大麦商城-商品表-73
 * </p>
 *
 * @author cx
 */
@Data
@TableName("dm_product")
public class DmProduct implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号, 自增列
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商品名称
     */
    private String pname;

    /**
     * 市场价
     */
    private Double marketPrice;

    /**
     * 商城价
     */
    private Double shopPrice;

    /**
     * 商品图片
     */
    private String image;

    /**
     * 商品描述
     */
    private String pdesc;

    /**
     * 库存数量
     */
    private Integer store;

    /**
     * 热销商品
     */
    private Integer isHot;

    /**
     * 创建时间
     */
    private LocalDateTime createtime;

    /**
     * 分类id 关联 dm_category.id
     */
    private Integer cid;


}
