package com.wl.eb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wl.eb.module.EbProductCategory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EbProductCategoryMapper extends BaseMapper<EbProductCategory> {
    List<EbProductCategory> selectBigsCategory();//生成大类
    List<EbProductCategory> selectSmallsCategory();//生成小类
}
