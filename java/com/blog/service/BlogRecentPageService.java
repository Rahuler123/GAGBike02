package com.blog.service;

import java.util.List;
import java.util.Optional;

import com.blog.dao.BlogRecentPageDao;
import com.blog.model.*;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

@Service
public class BlogRecentPageService {
	
	private  BlogRecentPageDao BlogRecentPageDao;
	
	
	
	@Autowired
	public BlogRecentPageService (BlogRecentPageDao BlogRecentPageDao ) {
		this.BlogRecentPageDao = BlogRecentPageDao;
		
}
//	public List<BlogRecentPage> findAll(){
//		return BlogRecentPageDao.findAll();
//	}
//	
//	public Optional <BlogRecentPage> findById(Long blogId){
//		return BlogRecentPageDao.findById(blogId);
//		
//	}
//	 
//	public BlogRecentPage save (BlogRecentPage RecentPg) {
//		return BlogRecentPageDao.save(RecentPg);
//	}
//	
	
	public void deleteById(Long blogId) {
		BlogRecentPageDao.deleteById(blogId);
		
	}

	
	public List<String> findBlogId(long Id){
		return  BlogRecentPageDao.findBlogId();
	}
	
	
	
	
//	
//	public List<BlogPage> getBlogDetail(long userId){
//		return BlogRecentPageDao.getBlogId(userId);
//	}
//	public List<BlogPage> getBlogId(long userId) {
//		return BlogPageDao.getBlogId(userId);
//	}
//	

}
