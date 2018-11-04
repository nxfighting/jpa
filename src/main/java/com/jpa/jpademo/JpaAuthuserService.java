package com.jpa.jpademo;

import com.jpa.jpademo.bean.AuthUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Service
public class JpaAuthuserService  {
    @Autowired
    private JpaAuthuserRegistry jpaAuthUserRegistry;


    public List<AuthUser> findAll() {
        return this.jpaAuthUserRegistry.findAll();
    }
}
