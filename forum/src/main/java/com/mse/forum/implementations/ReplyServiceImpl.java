package com.mse.forum.implementations;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.mse.forum.dto.ReplyDTO;
import com.mse.forum.mappers.ReplyMapper;
import com.mse.forum.persistance.ReplyRepository;
import com.mse.forum.persistance.TopicRepository;
import com.mse.forum.persistance.entities.ReplyEntity;
import com.mse.forum.persistance.entities.TopicEntity;
import com.mse.forum.services.ReplyService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ReplyServiceImpl implements ReplyService {
	
	private ReplyRepository replyRepository;
	private TopicRepository topicRepository;
	private ReplyMapper mapper;
	
	@Override
	public boolean save(ReplyDTO dto) {
	Optional<TopicEntity>findById =	topicRepository.findById(dto.getTopicId());
	if (!findById.isPresent()) {
		throw new IllegalArgumentException("Tryed to add a reply for a nonexisting topic");
	}
	ReplyEntity entity = mapper.toEntity(dto);
	entity.setTopic(findById.get());
	
		replyRepository.save(entity);
		return true;
	}
		@Override
		public List<ReplyDTO> getByTopicId(Long id){
			Optional<TopicEntity>topic =	topicRepository.findById(id);
			if (!topic.isPresent()) {
				throw new IllegalArgumentException("Tryed to add a reply for a nonexisting topic");
			}
			
			//TopicEntity entity = topic.get();
			//List<ReplyEntity>replies = entity.getReplies();
				return topic.get()
						.getReplies()
						.stream()
					//	.map(mapper::toDto)
						.collect(Collectors.toList());

	}
}
