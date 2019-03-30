package com.mse.forum.persistance.entities;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="scores")
@Getter
@Setter
@NoArgsConstructor
public class ScoreEntity {

	
	@Id
	@GeneratedValue
	@Column(unique=true)
	private Long id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id", nullable=false)
	private UserEntity userId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "reply_id", nullable=false)
	private ReplyEntity replyId;
	
	@Column(name="score_count")
	private long scoreCount;
}
