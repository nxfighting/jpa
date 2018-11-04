package com.jpa.jpademo;

import com.jpa.jpademo.bean.AuthUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping(value="/a")
public class JpaAuthuserController {
    @Autowired
    private JpaAuthuserService jpaAuthuserService;
    @RequestMapping(value="/b")
    public List<AuthUser> getList(){
        return this.jpaAuthuserService.findAll();
    }
}
