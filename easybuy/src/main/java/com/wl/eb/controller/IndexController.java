package com.wl.eb.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wl.eb.service.IndexService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.Map;

@Controller
@RequestMapping("/index")//决定网页地址第一级
public class IndexController {
    @Resource
    private IndexService indexService;

    @GetMapping("/index")//决定网页地址第二级
    public String index(Model model,
                        @RequestParam(value = "page",defaultValue = "1") int page){
        System.out.println("====IndexController方法index,page:"+page+"====");
        //查询首页需要的数据
        Map<String,Object> result = indexService.index(page);
        System.out.println("====result:==="+result);
        //数据装入model
        model.addAttribute("productPage", (Page)result.get("ebProductPage"));

        //返回view
        return "index";
    }
}
