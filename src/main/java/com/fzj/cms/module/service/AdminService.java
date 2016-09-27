package com.fzj.cms.module.service;


import com.fzj.cms.module.pojo.Admin;

import java.util.List;

/**
 * Created by j on 2016/9/26.
 */
public interface AdminService {
    public Admin getById(Integer id);

    public List<Admin> findAllAdmin()throws Exception;


}
