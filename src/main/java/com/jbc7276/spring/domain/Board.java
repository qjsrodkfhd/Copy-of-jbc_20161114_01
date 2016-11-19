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
}
