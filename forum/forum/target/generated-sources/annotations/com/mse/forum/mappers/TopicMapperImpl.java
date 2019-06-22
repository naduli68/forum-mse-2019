package com.mse.forum.mappers;

import com.mse.forum.dto.ReplyWithTopicDTO;
import com.mse.forum.dto.TopicDTO;
import com.mse.forum.dto.TopicDTO.TopicDTOBuilder;
import com.mse.forum.persistance.entities.TopicEntity;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-06-22T01:39:20+0300",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_201 (Oracle Corporation)"
)
@Component
public class TopicMapperImpl implements TopicMapper {

    @Override
    public TopicEntity toEntity(TopicDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TopicEntity topicEntity = new TopicEntity();

        topicEntity.setId( dto.getId() );
        topicEntity.setTitle( dto.getTitle() );
        topicEntity.setUserId( dto.getUserId() );
        topicEntity.setCreatedOn( dto.getCreatedOn() );
        topicEntity.setModifiedOn( dto.getModifiedOn() );
        topicEntity.setViewsCount( dto.getViewsCount() );

        return topicEntity;
    }

    @Override
    public TopicDTO toDto(TopicEntity entity) {
        if ( entity == null ) {
            return null;
        }

        TopicDTOBuilder topicDTO = TopicDTO.builder();

        topicDTO.id( entity.getId() );
        topicDTO.title( entity.getTitle() );
        topicDTO.userId( entity.getUserId() );
        topicDTO.createdOn( entity.getCreatedOn() );
        topicDTO.modifiedOn( entity.getModifiedOn() );
        if ( entity.getViewsCount() != null ) {
            topicDTO.viewsCount( entity.getViewsCount() );
        }

        return topicDTO.build();
    }

    @Override
    public TopicEntity toEntityFromReply(ReplyWithTopicDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TopicEntity topicEntity = new TopicEntity();

        topicEntity.setTitle( dto.getTitle() );
        if ( dto.getUserId() != null ) {
            topicEntity.setUserId( String.valueOf( dto.getUserId() ) );
        }
        topicEntity.setCreatedOn( dto.getCreatedOn() );
        topicEntity.setModifiedOn( dto.getModifiedOn() );

        return topicEntity;
    }
}
