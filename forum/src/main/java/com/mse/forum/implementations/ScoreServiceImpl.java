package com.mse.forum.implementations;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mse.forum.dto.ScoreDTO;
import com.mse.forum.services.ScoreService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ScoreServiceImpl implements ScoreService{@Override
	public boolean save(ScoreDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<ScoreDTO> getByReplyId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
