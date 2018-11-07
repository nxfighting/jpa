package com.jpa.jpademo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.jpademo.bean.AuthUser;
@RestController
@RequestMapping(value="/a")
public class JpaAuthuserController {
    @Autowired
    private JpaAuthuserService jpaAuthuserService;
    @RequestMapping(value="/b")
    public List<AuthUser> getList(){
        return this.jpaAuthuserService.findAll();
    }
    @RequestMapping(value="/c")
    public List<AuthUser> getList2(@RequestParam("p") String authName){
        return this.jpaAuthuserService.find(authName);
    }
    @RequestMapping(value="/d")
    public List<AuthUser> getList3(@RequestParam("p") String authName){
        return this.jpaAuthuserService.findByLike(authName);
    }
}
