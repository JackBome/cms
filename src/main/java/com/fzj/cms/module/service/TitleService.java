package com.fzj.cms.module.service;


import com.fzj.cms.module.pojo.Title;

import java.util.List;

/**
 * Created by j on 2016/9/27.
 */
public interface TitleService {

//      通过id查询文章
    public Title getTitleById(int titleId);

//      增加文章
    public int addTitle(Title title);

//        查询所有文章
    public List<Title> findAllTitle();

//        修改文章
    public int updateTitle(Title title);
}
