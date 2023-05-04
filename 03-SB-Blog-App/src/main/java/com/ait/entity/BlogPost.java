package com.ait.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Blog_tbl")
@Setter
@Getter
public class BlogPost {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer blogId;
	
	private String title;
	
	@CreationTimestamp
	private LocalDate createdOn;
	
	@Lob
	private String shortDescription;
	
	@Lob
	private String blogContent;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "userId")
	private User userObj;
	
	@OneToMany(mappedBy = "post",cascade = CascadeType.REMOVE)
	private List<Comments> comments;
	

}
