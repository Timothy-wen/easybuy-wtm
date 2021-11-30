package com.wl.eb.module;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.math.BigDecimal;

public class EbProduct implements Serializable {

    @TableId
    private Integer epId;
    private String epName;
    private String epDescription;
    private BigDecimal epPrice;
    private Integer epStock;
    private Integer epcId;//商品的一级分类id
    private Integer epcChildId;//商品的二级分类的id
    private String epFileName;

    @TableField(exist = false)
    private int count =1;//表示购买数量

    public Integer getEpId() {
        return epId;
    }

    public void setEpId(Integer epId) {
        this.epId = epId;
    }

    public String getEpName() {
        return epName;
    }

    public void setEpName(String epName) {
        this.epName = epName;
    }

    public String getEpDescription() {
        return epDescription;
    }

    public void setEpDescription(String epDescription) {
        this.epDescription = epDescription;
    }

    public BigDecimal getEpPrice() {
        return epPrice;
    }

    public void setEpPrice(BigDecimal epPrice) {
        this.epPrice = epPrice;
    }

    public Integer getEpStock() {
        return epStock;
    }

    public void setEpStock(Integer epStock) {
        this.epStock = epStock;
    }

    public Integer getEpcId() {
        return epcId;
    }

    public void setEpcId(Integer epcId) {
        this.epcId = epcId;
    }

    public Integer getEpcChildId() {
        return epcChildId;
    }

    public void setEpcChildId(Integer epcChildId) {
        this.epcChildId = epcChildId;
    }

    public String getEpFileName() {
        return epFileName;
    }

    public void setEpFileName(String epFileName) {
        this.epFileName = epFileName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EbProduct ebProduct = (EbProduct) o;
        return  epId.equals(ebProduct.epId);
    }

    @Override
    public int hashCode() {
        return 100;
    }

    @Override
    public String toString() {
        return "EbProduct{" +
                "epId=" + epId +
                ", epName='" + epName + '\'' +
                ", epDescription='" + epDescription + '\'' +
                ", epPrice=" + epPrice +
                ", epStock=" + epStock +
                ", epcId=" + epcId +
                ", epcChildId=" + epcChildId +
                ", epFileName='" + epFileName + '\'' +
                ", count=" + count +
                "}\n";
    }
}