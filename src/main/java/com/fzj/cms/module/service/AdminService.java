package com.fzj.cms.module.service;


import com.fzj.cms.module.pojo.Admin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by j on 2016/9/26.
 */
public interface AdminService {
    Admin getById(Integer id);
    int inserAdmin(Admin admin);
    int deleteAdmin(Integer id);
    int updateAdmin(Admin admin);

    List<Admin> queryAllAdmin();

}
