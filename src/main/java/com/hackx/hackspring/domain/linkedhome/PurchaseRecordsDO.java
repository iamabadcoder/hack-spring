package com.hackx.hackspring.domain.linkedhome;

import com.google.common.base.MoreObjects;

import java.io.Serializable;

/**
 * Created by hackx on 9/25/16.
 */
public class PurchaseRecordsDO implements Serializable {

    private static final long serialVersionUID = 7660621147501102579L;

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 创建时间
     */
    private Long gmtCreate;

    /**
     * 修改时间
     */
    private Long gmtModified;

    /**
     * 产品ID
     */
    private Long productId;

    /**
     * 投资用户
     */
    private String touZiYongHu;

    /**
     * 投资资金
     */
    private String touZiZiJin;

    /**
     * 投资时间
     */
    private String touziShiJian;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Long getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getTouZiYongHu() {
        return touZiYongHu;
    }

    public void setTouZiYongHu(String touZiYongHu) {
        this.touZiYongHu = touZiYongHu;
    }

    public String getTouZiZiJin() {
        return touZiZiJin;
    }

    public void setTouZiZiJin(String touZiZiJin) {
        this.touZiZiJin = touZiZiJin;
    }

    public String getTouziShiJian() {
        return touziShiJian;
    }

    public void setTouziShiJian(String touziShiJian) {
        this.touziShiJian = touziShiJian;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("gmtCreate", gmtCreate)
                .add("gmtModified", gmtModified)
                .add("productId", productId)
                .add("touZiYongHu", touZiYongHu)
                .add("touZiZiJin", touZiZiJin)
                .add("touziShiJian", touziShiJian)
                .toString();
    }
}
