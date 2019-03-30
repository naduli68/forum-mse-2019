package com.mse.forum.services;

import java.util.List;
import com.mse.forum.dto.TopicDTO;

public interface TopicService {
	
	boolean saveTopic(TopicDTO dto);

	TopicDTO findByTitle(String title);
	List<TopicDTO> getAll();
	TopicDTO findById(Long id);
}
