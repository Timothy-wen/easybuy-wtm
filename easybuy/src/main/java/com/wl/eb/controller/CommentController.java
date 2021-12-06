package com.wl.eb.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wl.eb.service.CommentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
@RequestMapping("/comment")
public class CommentController {
    @Resource
    private CommentService commentService;

    @RequestMapping("/list")
    public String list(Model model,
                       @RequestParam(value = "page",defaultValue = "1") int page){
        System.out.println("进入CommentController的list方法，page:"+page);
        //1.调用service分页查询留言列表
        Page commentPage = commentService.list(page);
        //2.绑定数据到model
        model.addAttribute("commentPage",commentPage);
        //3.返回view
        return "guestbook";//templates/guestbook.html
    }
}
