/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Db_package;

/**
 *
 * @author Zafrul Hasan Nasim
 */
public class user {

    @Override
    public String toString() {
        return "user{" + "name=" + name + ", dept=" + dept + ", email=" + email + ", mobile=" + mobile + '}';
    }
    
    private String name;
    private String dept;
    private String email;
    private String mobile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    
    
    
    
}
