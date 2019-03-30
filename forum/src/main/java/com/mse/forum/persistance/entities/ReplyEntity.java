package com.mse.forum.persistance.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity(name="replies")
@Getter
@Setter
@NoArgsConstructor
public class ReplyEntity {

	@Id
	@GeneratedValue
	@Column(unique=true)
	private Long id;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "topic_id", nullable=false)
	private TopicEntity topic;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id", nullable=false)
	private UserEntity userId;
	
	@OneToMany(mappedBy = "replyId", fetch =FetchType.LAZY)
	private List<ScoreEntity> scores;
	
	@Column(name="created_On")
	private Date createdOn;
	
	@Column(name="modified_On")
	private Date modifiedOn;
			
	@Column(name="reply_content")
	private String replyContent;
	

	public void setTopic(TopicEntity topicEntity) {
		// TODO Auto-generated method stub
		
	}
}
