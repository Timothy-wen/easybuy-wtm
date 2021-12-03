package com.wl.eb.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wl.eb.mapper.EbProductMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class IndexService {
    @Resource
    private EbProductMapper ebProductMapper;

    public Map<String,Object> index(int psize){
        System.out.println("====IndexService方法index====");
        Map<String,Object> result=new HashMap();
        //分页查询1，8条数据
        Page page = new Page(psize,8);
        Page ebProductPage = ebProductMapper.selectPage(page,null);
        //装入result返回Controller
        result.put("ebProductPage",ebProductPage);
        return result;
    }
}
