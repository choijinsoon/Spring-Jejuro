package com.jejuro.web.entity;

public class Post {
	private int postId;
	
	private String title;
	private String content;
	
	public Post() {
		// TODO Auto-generated constructor stub
	}

	public Post(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Post [postId=" + postId + ", title=" + title + ", content=" + content + "]";
	}
	
	
	
}
