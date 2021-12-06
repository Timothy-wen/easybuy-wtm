package com.wl.eb.controller;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wl.eb.module.EbProduct;
import com.wl.eb.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller//证
@RequestMapping("/product")//工号
public class ProductController {
    @Resource
    private ProductService productService;

    @RequestMapping("/detail")
    public String detail(Model model,int productId) throws Exception{
        //1.调用service根据pruductId查询该商品的详情
        EbProduct productDetail = productService.detail(productId);
        if(productDetail==null){
            throw new  RuntimeException("查询的商品不存在！！");
        }
        //2.将详情数据绑定到Model中
        model.addAttribute("detail",productDetail);
        //3.返回view
        return "product-view";//templates/product-view.html
    }

    @RequestMapping("/list")
    public String productListRelativedCategory(Model model,
                                               Integer categoryId,
                                               @RequestParam(value = "page",defaultValue = "1") int page){
        System.out.println("====productListRelativedCategory方法id"+categoryId+"页数"+page+"====");
        //1调用service利用categoryId查询分页数据
        Page productPage = productService.list(page,categoryId);
        //2将详情数据绑定到Model中
        model.addAttribute("productPage",productPage);
        //3返回view
        return "product-list";
    }
}


