package com.wl.eb.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wl.eb.mapper.EbNewsMapper;
import com.wl.eb.mapper.EbProductCategoryMapper;
import com.wl.eb.mapper.EbProductMapper;
import com.wl.eb.module.EbNews;
import com.wl.eb.module.EbProductCategory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class IndexService {
    @Resource
    private EbProductMapper ebProductMapper;
    @Resource
    private EbNewsMapper ebNewsMapper;
    @Resource
    private EbProductCategoryMapper ebProductCategoryMapper;

    public Map<String,Object> index(int psize){
        System.out.println("====IndexService方法index====");
        Map<String,Object> result=new HashMap();
        //分页查询1，8条数据
        Page page = new Page(psize,8);
        Page ebProductPage = ebProductMapper.selectPage(page,null);
        //分页查询新闻数据，7条数据
        page = new Page(1,7);
        Page ebNewsPage = ebNewsMapper.selectPage(
                page, new QueryWrapper<EbNews>().orderByDesc("en_create_time")
        );
        //查询分类的数据
        //List<EbProductCategory> bigs = ebProductCategoryMapper.selectBigsCategory();
        //List<EbProductCategory> smalls = ebProductCategoryMapper.selectSmallsCategory();
        //装入result返回Controller
        result.put("ebProductPage",ebProductPage);
        result.put("ebNewsPage",ebNewsPage);
        //result.put("bigs",bigs);
        //result.put("smalls",smalls);
        return result;
    }
}
