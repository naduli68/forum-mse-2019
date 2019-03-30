package com.mse.forum.dto;


import com.mse.forum.persistance.entities.Roles;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
	
	private Long id;
	private String userName;
	private String userPass;
	private Roles userRole;

}
