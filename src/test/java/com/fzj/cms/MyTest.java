package com.fzj.cms;

import com.fzj.cms.module.pojo.Admin;
import com.fzj.cms.module.service.AdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by j on 2016/9/27.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/applicationContext*.xml"})
public class MyTest {

    @Resource
    private AdminService adminService;

    @Test
    public void test1(){
        Admin admin =adminService.getById(1);
        System.out.print(admin.toString());
    }
}
