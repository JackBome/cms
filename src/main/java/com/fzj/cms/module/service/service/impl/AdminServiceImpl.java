package com.fzj.cms.module.service.service.impl;


import com.fzj.cms.module.mapper.AdminMapper;
import com.fzj.cms.module.pojo.Admin;
import com.fzj.cms.module.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by j on 2016/9/26.
 */
@Service

public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin getById(Integer id) {
        return adminMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Admin> findAllAdmin() throws Exception {

        //调用mapper类中的selectByExample方法，如果传入类型为null，则表示无条件查找
        List<Admin> admins =adminMapper.selectByExample(null);
        return admins;
    }



}
