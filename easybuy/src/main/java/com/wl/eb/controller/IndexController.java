package com.wl.eb.controller;


import com.wl.eb.service.IndexService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Map;

@Controller
@RequestMapping("/index")//决定网页地址第一级
public class IndexController {
    @Resource
    private IndexService indexService;

    @GetMapping("/index")//决定网页地址第二级
    public String index(Model model){
        System.out.println("====IndexController方法index====");
        //查询首页需要的数据
        Map<String,Object> result = indexService.index();
        System.out.println("====result:==="+result);
        //数据装入model
        model.addAttribute("result",result);
        //返回view
        return "index";
    }
}
