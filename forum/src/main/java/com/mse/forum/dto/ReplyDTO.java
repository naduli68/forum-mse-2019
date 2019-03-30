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
public class ReplyDTO {

	private Long topicId;
	private Date createdOn;
	private Date modifiedOn;
	private String replyContent;
//	public Long getTopicId() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
