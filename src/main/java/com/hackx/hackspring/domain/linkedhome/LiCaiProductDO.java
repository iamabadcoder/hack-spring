package com.hackx.hackspring.domain.linkedhome;

import com.google.common.base.MoreObjects;

import java.io.Serializable;

/**
 * Created by hackx on 9/25/16.
 */
public class LiCaiProductDO implements Serializable {

    private static final long serialVersionUID = -2347417767687421312L;

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
    private Integer productId;

    /**
     * 产品名称
     */
    private String name;

    /**
     * 开售时间
     */
    private String kaiShouShiJian;

    /**
     * 年化预期收益率
     */
    private String yuQiNianHuaShouYiLv;

    /**
     * 项目期限
     */
    private String xiangMuQiXian;

    /**
     * 项目规模
     */
    private String xiangMuGuiMo;

    /**
     * 项目售完历时
     */
    private String xiangMuShouWanLiShi;

    /**
     * 投标笔数
     */
    private Integer touBiaoBiShu;

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

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKaiShouShiJian() {
        return kaiShouShiJian;
    }

    public void setKaiShouShiJian(String kaiShouShiJian) {
        this.kaiShouShiJian = kaiShouShiJian;
    }

    public String getYuQiNianHuaShouYiLv() {
        return yuQiNianHuaShouYiLv;
    }

    public void setYuQiNianHuaShouYiLv(String yuQiNianHuaShouYiLv) {
        this.yuQiNianHuaShouYiLv = yuQiNianHuaShouYiLv;
    }

    public String getXiangMuQiXian() {
        return xiangMuQiXian;
    }

    public void setXiangMuQiXian(String xiangMuQiXian) {
        this.xiangMuQiXian = xiangMuQiXian;
    }

    public String getXiangMuGuiMo() {
        return xiangMuGuiMo;
    }

    public void setXiangMuGuiMo(String xiangMuGuiMo) {
        this.xiangMuGuiMo = xiangMuGuiMo;
    }

    public String getXiangMuShouWanLiShi() {
        return xiangMuShouWanLiShi;
    }

    public void setXiangMuShouWanLiShi(String xiangMuShouWanLiShi) {
        this.xiangMuShouWanLiShi = xiangMuShouWanLiShi;
    }

    public Integer getTouBiaoBiShu() {
        return touBiaoBiShu;
    }

    public void setTouBiaoBiShu(Integer touBiaoBiShu) {
        this.touBiaoBiShu = touBiaoBiShu;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("gmtCreate", gmtCreate)
                .add("gmtModified", gmtModified)
                .add("productId", productId)
                .add("name", name)
                .add("kaiShouShiJian", kaiShouShiJian)
                .add("yuQiNianHuaShouYiLv", yuQiNianHuaShouYiLv)
                .add("xiangMuQiXian", xiangMuQiXian)
                .add("xiangMuGuiMo", xiangMuGuiMo)
                .add("xiangMuShouWanLiShi", xiangMuShouWanLiShi)
                .add("touBiaoBiShu", touBiaoBiShu)
                .toString();
    }
}
