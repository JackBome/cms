package com.fzj.cms.module.service.service.impl;


import com.fzj.cms.module.mapper.AdminMapper;
import com.fzj.cms.module.pojo.Admin;
import com.fzj.cms.module.service.AdminService;
import org.apache.ibatis.annotations.Param;
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
    public int inserAdmin(Admin admin) {
        if(admin!=null){
            int i=adminMapper.insert(admin);
            if (i ==1 ){
                return  1;
            }
        }
        return 0;
    }

    @Override
    public int deleteAdmin(Integer id) {
        int i=adminMapper.deleteByPrimaryKey(id);
        if(i==1){
            return 1;
        }
        return 0;
    }

    @Override
    public int updateAdmin(Admin admin) {
        if(admin!=null){
            int i =adminMapper.updateByPrimaryKey(admin);
            if(i==1){
                return 1;
            }
        }
        return 0;
    }

    @Override
    public List<Admin> queryAllAdmin() {
        return adminMapper.selectByExample(null);
    }


}
