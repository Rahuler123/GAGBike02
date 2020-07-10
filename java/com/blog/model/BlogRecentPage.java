package com.blog.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.user.model.UserMaster;

@Entity
@Table(name = "blog_post")
public class BlogRecentPage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name="blogId")
	private long blogId;

	 @Column(name="userId")              
	 private  long    userId;            
	                                     
	 @Column(name="parentId")	           
	 private  long    parentId;          
	                                     
	 @Column(name="title")               
	 private  String  title;             
	                                     
	 @Column(name="metaTitle")	         
	 private  String  metaTitle;         
	                                     
	 @Column(name="slug")                
	 private  String  slug;              
	                                     
	 @Column(name="summary")	           
	 private  String  summary;           
	                                     
	 @Column(name="published")           
	 private  byte    published;         
	                                     
	 @Column(name="createdAt")           
	 private  Date    createdAt;         
	                                     
	 @Column(name="updatedAt")           
	 private  Date    updatedAt;         
	                                     
	 @Column(name="publishedAt")         
	 private  Date    publishedAt;       
	                                     
	 @Column(name="replyCount")          
	 private  long    replyCount;        
	                                     
	 @Column(name="likeCount")           
	 private  long    likeCount;         
	                                     
	 @Column(name="viewCount")	         
	 private  long    viewCount;         
	                                     
	 @Column(name="status")	             
	 private  String  status;            
	                                     
	 @Column(name="authFlag")            
	 private  String  authFlag;          
	                                     
	 @Column(name="authUser")            
	 private  String  authUser;          
	                                     
	                                     
	 @Column(name="authDate")            
	 private  Date    authDate;
	 
	 
	 @Column(name="content")            
	 private  String    content;
	 

//	 @OneToOne(cascade = CascadeType.ALL)
//	// @JoinColumn(name = "firstName_fk", referencedColumnName = "firstName")
//	 private UserMaster userMaster;

	 
	 
	 
	 
//	public BlogRecentPage(UserMaster userMaster) {
//		super();
//		this.userMaster = userMaster;
	//}

	public long getBlogId() {
		return blogId;
	}

	public void setBlogId(long blogId) {
		this.blogId = blogId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getParentId() {
		return parentId;
	}

	public void setParentId(long parentId) {
		this.parentId = parentId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMetaTitle() {
		return metaTitle;
	}

	public void setMetaTitle(String metaTitle) {
		this.metaTitle = metaTitle;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public byte getPublished() {
		return published;
	}

	public void setPublished(byte published) {
		this.published = published;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Date getPublishedAt() {
		return publishedAt;
	}

	public void setPublishedAt(Date publishedAt) {
		this.publishedAt = publishedAt;
	}

	public long getReplyCount() {
		return replyCount;
	}

	public void setReplyCount(long replyCount) {
		this.replyCount = replyCount;
	}

	public long getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(long likeCount) {
		this.likeCount = likeCount;
	}

	public long getViewCount() {
		return viewCount;
	}

	public void setViewCount(long viewCount) {
		this.viewCount = viewCount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAuthFlag() {
		return authFlag;
	}

	public void setAuthFlag(String authFlag) {
		this.authFlag = authFlag;
	}

	public String getAuthUser() {
		return authUser;
	}

	public void setAuthUser(String authUser) {
		this.authUser = authUser;
	}

	public Date getAuthDate() {
		return authDate;
	}

	public void setAuthDate(Date authDate) {
		this.authDate = authDate;
	}

	public BlogRecentPage( long userId, long parentId, String title, String metaTitle, String slug,
			String summary, byte published, Date createdAt, Date updatedAt, Date publishedAt, long replyCount,
			long likeCount, long viewCount, String status, String authFlag, String authUser, Date authDate,
			String content) {
		this.userId = userId;
		this.parentId = parentId;
		this.title = title;
		this.metaTitle = metaTitle;
		this.slug = slug;
		this.summary = summary;
		this.published = published;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.publishedAt = publishedAt;
		this.replyCount = replyCount;
		this.likeCount = likeCount;
		this.viewCount = viewCount;
		this.status = status;
		this.authFlag = authFlag;
		this.authUser = authUser;
		this.authDate = authDate;
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "BlogRecentPage [blogId=" + blogId + ", userId=" + userId + ", parentId=" + parentId + ", title=" + title
				+ ", metaTitle=" + metaTitle + ", slug=" + slug + ", summary=" + summary + ", published=" + published
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", publishedAt=" + publishedAt
				+ ", replyCount=" + replyCount + ", likeCount=" + likeCount + ", viewCount=" + viewCount + ", status="
				+ status + ", authFlag=" + authFlag + ", authUser=" + authUser + ", authDate=" + authDate + ", content="
				+ content + "]";
	}
	

	public BlogRecentPage() {
		
	}
	
}
