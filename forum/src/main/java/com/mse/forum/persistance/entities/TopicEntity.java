package com.mse.forum.persistance.entities;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import com.mse.forum.dto.ReplyDTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="topics")
@Getter
@Setter
@NoArgsConstructor
public class TopicEntity {

	
	
	@Id
	@GeneratedValue
	private Long id;

	@Column(unique=true)
	private String title;
	
	@Column(name="user_id")
	private String userID;

	@Column(name="created_on")
	private Date createdOn;
	
	@Column(name="modified_on")
	private Date modifiedOn;
	
	@Column(name="views_count")
	private long viewsCount;
	
	
	
	@OneToMany(mappedBy = "topic", fetch =FetchType.LAZY)
	private List<ReplyEntity> replies;
	
	@PrePersist
	public void setDate (){
		this.modifiedOn = new Date();
		this.createdOn =new Date();
	}
	
	@PreUpdate
	public void updateDates() {
		this.modifiedOn = new Date();
	}

	public Collection<ReplyDTO> getReplies() {
		// TODO Auto-generated method stub
		return null;
	}
		
	}

