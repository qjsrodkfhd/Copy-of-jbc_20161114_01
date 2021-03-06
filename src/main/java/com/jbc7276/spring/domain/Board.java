package com.jbc7276.spring.domain;

import java.util.Date;

public class Board {
	
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date regdate;
	private int viewcnt;
	
	public Board() {
		
	}
	
	public Board(int bno, String title, String content, String writer){
		
		this.bno = bno;
		this.title = title;
		this.content = content;
		this.writer = writer;
		 
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
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

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public int getViewcnt() {
		return viewcnt;
	}

	public void setViewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
	}
	
	
}
