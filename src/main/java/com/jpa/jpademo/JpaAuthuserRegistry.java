package com.jpa.jpademo;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import com.jpa.jpademo.bean.AuthUser;
/**
 *    CrudRepository
 * -> PagingAndSortingRepository<T, ID>, QueryByExampleExecutor<T>
 * -> JpaRepository
 * ->
 * @author Administrator
 *
 */
public interface JpaAuthuserRegistry extends JpaRepository<AuthUser, Serializable>  {
    @Override
	public List<AuthUser> findAll() ;
    public List<AuthUser> findByAuthName(@Value("a") String auth_name);
    public List<AuthUser> findByAuthNameLike(String authName);
}
