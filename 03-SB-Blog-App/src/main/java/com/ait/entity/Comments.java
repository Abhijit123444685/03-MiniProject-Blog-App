package com.ait.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="comments_tbl")
public class Comments {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer commentId;
	
	private String name;
	
	private String email;
	
	@CreationTimestamp
	private LocalDate commentAddedDate;
	
	@Lob
	private String commentContent;
	
	@ManyToOne
	@JoinColumn(name="blogId")
	private BlogPost post;

}
