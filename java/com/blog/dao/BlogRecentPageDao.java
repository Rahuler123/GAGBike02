package com.blog.dao;

import com.blog.model.*;

import java.lang.annotation.Native;
import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface BlogRecentPageDao extends JpaRepository<BlogPost,Long>{

	Page<BlogRecentPage> findByTitle(String title, Pageable pageable);
	
	@Query("SELECT c.blogId,c.metaTitle FROM BlogPost AS c")
    public List<String> findBlogId();


}
