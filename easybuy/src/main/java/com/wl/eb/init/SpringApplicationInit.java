package com.wl.eb.init;

import com.wl.eb.mapper.EbProductCategoryMapper;
import com.wl.eb.module.EbProductCategory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import java.util.List;


@Component//发暖宝宝的类
public class SpringApplicationInit implements CommandLineRunner {
    @Resource
    private ServletContext application;
    @Resource
    private EbProductCategoryMapper ebProductCategoryMapper;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("服务器启动就查询所有的分类...");
        //1.查出大类和小类集合
        //TODO 3.查询分类的数据
        List<EbProductCategory> bigs = ebProductCategoryMapper.selectBigsCategory();
        List<EbProductCategory> smalls = ebProductCategoryMapper.selectSmallsCategory();
        //2.将大类小类 集合放到仓库
        application.setAttribute("bigs",bigs);
        application.setAttribute("smalls",smalls);
        System.out.println("加载商品分类成功....");
    }
}
