package com.mse.forum.mappers;

import org.mapstruct.Mapper;

import com.mse.forum.dto.ScoreDTO;
import com.mse.forum.persistance.entities.ScoreEntity;


@Mapper(componentModel = "spring")
public interface ScoreMapper {

	ScoreEntity toEntity(ScoreDTO dto);

	ScoreDTO toDto(ScoreEntity entity);
}
