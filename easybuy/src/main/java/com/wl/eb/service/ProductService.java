package com.wl.eb.service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wl.eb.mapper.EbProductMapper;
import com.wl.eb.module.EbProduct;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service//证
public class ProductService {
    @Resource
    private EbProductMapper ebProductMapper;
    /**
     * 根据id查询商品信息
     * @param productId 商品id
     */
    public EbProduct detail(int productId){
        return ebProductMapper.selectById(productId);
    }

    /**
     * 根据分类id分页查询商品列表信息
     * @param psize 页数
     * @param categoryId    分类id
     */
    public Page list(int psize,int categoryId){
        Page page = new Page(psize,12);
        Page productList = ebProductMapper.selectPage(
                page,new QueryWrapper<EbProduct>().eq("epc_child_id",categoryId));
        return productList;
    }
}
