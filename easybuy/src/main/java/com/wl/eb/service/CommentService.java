package com.wl.eb.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wl.eb.mapper.EbCommentMapper;
import com.wl.eb.module.EbComment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CommentService {
    @Resource
    private EbCommentMapper ebCommentMapper;
    /**
     * 分页查询评论列表信息
     * @param psize 页数
     * @return
     */
    public Page list(int psize){
        Page page=new Page(psize,5);
        Page commentPage = ebCommentMapper.selectPage(page, new QueryWrapper<EbComment>()
                .orderByDesc("ec_create_time"));
        return commentPage;
    }
}
