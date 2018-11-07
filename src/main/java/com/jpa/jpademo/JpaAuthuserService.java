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
    public List<AuthUser> find(String auth_name) {
        return this.jpaAuthUserRegistry.findByAuthName(auth_name);
    }
    public List<AuthUser> findByLike(String auth_name) {
        return this.jpaAuthUserRegistry.findByAuthNameLike(auth_name);
    }
}
