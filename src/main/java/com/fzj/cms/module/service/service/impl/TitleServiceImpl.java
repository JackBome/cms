package com.fzj.cms.module.service.service.impl;


import com.fzj.cms.module.mapper.TitleMapper;
import com.fzj.cms.module.pojo.Title;
import com.fzj.cms.module.service.TitleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by j on 2016/9/27.
 */
public class TitleServiceImpl implements TitleService {

    @Autowired
    TitleMapper titleMapper;

    @Override
    public Title getTitleById(int titleId) {
        return titleMapper.selectByPrimaryKey(titleId);
    }

    @Override
    public int addTitle(Title title) {
        return titleMapper.insertSelective(title);
    }

    @Override
    public List<Title> findAllTitle() {
        return titleMapper.selectByExample(null);
    }

    @Override
    public int updateTitle(Title title) {
        return titleMapper.updateByPrimaryKey(title);
    }
}
