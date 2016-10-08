package com.fzj.cms;

import com.fzj.cms.module.pojo.Admin;
import com.fzj.cms.module.service.AdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Test
    public void test2(){
        int i =adminService.deleteAdmin(20);
        System.out.print(i);
    }

    @Test
    public void test3(){
        Admin a =new Admin();
        a.setId(20);
        a.setAdminname("le");
        a.setAdminpass("123");
        int i =adminService.inserAdmin(a);
        System.out.print(i);

    }
    @Test
    public void test4(){
        Admin a =new Admin();
        a.setId(2);
        a.setAdminname("fan");
        a.setAdminpass("123456");
        int i =adminService.updateAdmin(a);
    }
}
