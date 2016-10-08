package com.fzj.cms.module.controller;


import com.fzj.cms.module.pojo.Admin;
import com.fzj.cms.module.service.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;

/**
 * Created by j on 2016/9/26.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    private static final Logger LOG = LoggerFactory.getLogger(AdminController.class);

    @Autowired
    private AdminService adminService;

    @RequestMapping(value="list",method = RequestMethod.GET)
    public String list(Model model){
        List<Admin> adminList =adminService.queryAllAdmin();
        model.addAttribute("adminList",adminList);
        return "list";
    }

    @RequestMapping("/showAdminToJspById/{adminId}")
    public String showAdmin(Model model, @PathVariable("adminId") Integer adminId){
        Admin admin =this.adminService.getById(adminId);
        model.addAttribute("admin",admin);
        return "/admin/showAdmin";
    }

    @RequestMapping("/showAdminToJsonById/{adminId}")
    @ResponseBody
    public Admin showAdmin(@PathVariable("adminId") Integer adminId){
        Admin admin =adminService.getById(adminId);
        return admin;
    }

    @RequestMapping("/delete/{adminId}")
    public String delete(@PathVariable("adminId") Integer adminId){
        this.adminService.deleteAdmin(adminId);
        //redirect跳转的时候加上命名空间
        return "redirect:/admin/list";
    }

    @RequestMapping("/updateUI/{adminId}")
    public String updateUI(@PathVariable("adminId") Integer adminId, HttpServletRequest request){
        request.setAttribute("adminId",adminId);
        return "updateUI";
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public String update(Admin admin){
        System.out.print(admin);
        adminService.updateAdmin(admin);
        return "redirect:/admin/list";
    }

    @RequestMapping("addUI")
    public String addUI(){
        return "addUI";
    }


    @RequestMapping(value = "add",method = RequestMethod.POST)
    public String add(Admin admin){
        adminService.inserAdmin(admin);
        return "redirect:/admin/list";
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
