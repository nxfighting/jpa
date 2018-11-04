package com.jpa.jpademo;

import com.jpa.jpademo.bean.AuthUser;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;
import java.util.List;

public interface JpaAuthuserRegistry extends CrudRepository<AuthUser, Serializable> {
    public List<AuthUser> findAll() ;
}
