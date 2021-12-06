package com.wl.eb.controller;
import com.wl.eb.module.EbProduct;
import com.wl.eb.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
