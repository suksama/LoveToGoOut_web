package com.ltgo.model;

public class Notes {

	private String title;
	private String content;
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
	public Notes(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}
	
}
