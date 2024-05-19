package com.cx.damai.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 大麦商城-商品表-73
 * </p>
 *
 * @author 廖老师
 * @since 2024-05-15
 */
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


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Double getShopPrice() {
        return shopPrice;
    }

    public void setShopPrice(Double shopPrice) {
        this.shopPrice = shopPrice;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPdesc() {
        return pdesc;
    }

    public void setPdesc(String pdesc) {
        this.pdesc = pdesc;
    }

    public Integer getStore() {
        return store;
    }

    public void setStore(Integer store) {
        this.store = store;
    }

    public Integer getIsHot() {
        return isHot;
    }

    public void setIsHot(Integer isHot) {
        this.isHot = isHot;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "DmProduct{" +
        "id=" + id +
        ", pname=" + pname +
        ", marketPrice=" + marketPrice +
        ", shopPrice=" + shopPrice +
        ", image=" + image +
        ", pdesc=" + pdesc +
        ", store=" + store +
        ", isHot=" + isHot +
        ", createtime=" + createtime +
        ", cid=" + cid +
        "}";
    }
}
