package com.wl.eb.module;

import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

/**
 * @Description: 用一句话描述
 * @Auther: 新梦想*陈超
 * @Date: 2019-10-27 15:41
 */
public class EbProductCategory implements Serializable {
    @TableId
    private Integer epcId;
    private String epcName;
    private Integer epcParentId;

    public Integer getEpcId() {
        return epcId;
    }

    public void setEpcId(Integer epcId) {
        this.epcId = epcId;
    }

    public String getEpcName() {
        return epcName;
    }

    public void setEpcName(String epcName) {
        this.epcName = epcName;
    }

    public Integer getEpcParentId() {
        return epcParentId;
    }

    public void setEpcParentId(Integer epcParentId) {
        this.epcParentId = epcParentId;
    }

    @Override
    public String toString() {
        return "EbProductCategory{" +
                "epcId=" + epcId +
                ", epcName='" + epcName + '\'' +
                ", epcParentId=" + epcParentId +
                "}\n";
    }
}
