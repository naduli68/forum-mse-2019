package com.mse.forum.persistance.entities;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="users")
@Getter
@Setter
@NoArgsConstructor
public class UserEntity {

	
	@Id
	@GeneratedValue
	@Column(unique=true)
	private Long id;
	
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="user_pass")
	private String userPass;
	
	@Column(name="user_role")
	private Roles userRole;
	
	@OneToMany(mappedBy = "userId", fetch =FetchType.LAZY)
	private List<ReplyEntity> replies;
	
	
	@OneToMany(mappedBy = "userId", fetch =FetchType.LAZY)
	private List<ScoreEntity> scores;
}
