package com.fzj.cms.module.pojo;

public class Admin {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.adminName
     *
     * @mbggenerated
     */
    private String adminname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.adminPass
     *
     * @mbggenerated
     */
    private String adminpass;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.id
     *
     * @return the value of admin.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.id
     *
     * @param id the value for admin.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.adminName
     *
     * @return the value of admin.adminName
     *
     * @mbggenerated
     */
    public String getAdminname() {
        return adminname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.adminName
     *
     * @param adminname the value for admin.adminName
     *
     * @mbggenerated
     */
    public void setAdminname(String adminname) {
        this.adminname = adminname == null ? null : adminname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.adminPass
     *
     * @return the value of admin.adminPass
     *
     * @mbggenerated
     */
    public String getAdminpass() {
        return adminpass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.adminPass
     *
     * @param adminpass the value for admin.adminPass
     *
     * @mbggenerated
     */
    public void setAdminpass(String adminpass) {
        this.adminpass = adminpass == null ? null : adminpass.trim();
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", adminname='" + adminname + '\'' +
                ", adminpass='" + adminpass + '\'' +
                '}';
    }
}