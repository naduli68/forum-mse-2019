package com.mse.forum.services;

import java.util.List;
import com.mse.forum.dto.ScoreDTO;

public interface ScoreService {
	boolean  save(ScoreDTO dto);
	List<ScoreDTO> getByReplyId (Long id);
}
