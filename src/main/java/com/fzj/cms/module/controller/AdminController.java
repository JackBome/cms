package com.fzj.cms.module.controller;


import com.fzj.cms.module.pojo.Admin;
import com.fzj.cms.module.pojo.Title;
import com.fzj.cms.module.service.AdminService;
import com.fzj.cms.module.service.TitleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * Created by j on 2016/9/26.
 */
@Controller
@RequestMapping("/adminController")
public class AdminController {

    private static final Logger LOG = LoggerFactory.getLogger(AdminController.class);

    @Autowired
    private AdminService adminService;


    @RequestMapping("/showAdminToJspById/{adminId}")
    public String showAdmin(Model model, @PathVariable("adminId") Integer adminId){
        Admin admin =this.adminService.getById(adminId);
        model.addAttribute("admin",admin);
        return "showAdmin";
    }

    @RequestMapping("/showAdminToJsonById/{adminId}")
    @ResponseBody
    public Admin showAdmin(@PathVariable("adminId") Integer adminId){
        Admin admin =adminService.getById(adminId);
        return admin;
    }

    @RequestMapping("/findAllAdmin")
    public String findAllAdmin(Model model)throws Exception{
        List<Admin> admins =this.adminService.findAllAdmin();
        model.addAttribute("admins",admins);
        return "showAllAdmin";
    }
    @RequestMapping("/find")
    @ResponseBody
    public List<Admin> findAllAdminToJson() throws Exception{
        List<Admin> admins =adminService.findAllAdmin();
        return admins;
    }





    @RequestMapping("/test-logback")
    @ResponseBody
    public Date testLogback(){
        LOG.trace("-----------------------------------trace");
        LOG.debug("-----------------------------------debug");
        LOG.info("-----------------------------------info");
        LOG.warn("-----------------------------------warn");
        LOG.error("-----------------------------------error");
        return new Date();
    }
}
