package com.wl.eb.service;
import com.wl.eb.mapper.EbProductMapper;
import com.wl.eb.module.EbProduct;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service//证
public class ProductService {
    @Resource
    private EbProductMapper ebProductMapper;
    public EbProduct detail(int productId){
        return ebProductMapper.selectById(productId);
    }

}
