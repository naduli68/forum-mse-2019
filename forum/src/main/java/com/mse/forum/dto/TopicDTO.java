package com.mse.forum.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TopicDTO {
	private String title;
	private String userID;
	private Date createOn;
	private Date modifiedOn;
	private long viewsCount; //kolko pati e vidqn
	
}
