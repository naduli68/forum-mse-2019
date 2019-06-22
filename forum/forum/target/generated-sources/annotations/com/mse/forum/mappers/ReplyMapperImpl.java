package com.mse.forum.mappers;

import com.mse.forum.dto.ReplyDTO;
import com.mse.forum.dto.ReplyDTO.ReplyDTOBuilder;
import com.mse.forum.dto.ReplyWithTopicDTO;
import com.mse.forum.persistance.entities.ReplyEntity;
import com.mse.forum.persistance.entities.TopicEntity;
import com.mse.forum.persistance.entities.UserEntity;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-06-22T01:39:20+0300",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_201 (Oracle Corporation)"
)
@Component
public class ReplyMapperImpl implements ReplyMapper {

    @Override
    public ReplyEntity toEntity(ReplyDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ReplyEntity replyEntity = new ReplyEntity();

        replyEntity.setReplyContent( dto.getReplyContent() );
        replyEntity.setCreatedOn( dto.getCreatedOn() );
        replyEntity.setModifiedOn( dto.getModifiedOn() );

        return replyEntity;
    }

    @Override
    public ReplyDTO toDto(ReplyEntity entity) {
        if ( entity == null ) {
            return null;
        }

        ReplyDTOBuilder replyDTO = ReplyDTO.builder();

        replyDTO.userId( entityUserId( entity ) );
        replyDTO.topicId( entityTopicId( entity ) );
        replyDTO.replyContent( entity.getReplyContent() );
        replyDTO.createdOn( entity.getCreatedOn() );
        replyDTO.modifiedOn( entity.getModifiedOn() );

        return replyDTO.build();
    }

    @Override
    public ReplyEntity toReplyWithTopicEntity(ReplyWithTopicDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ReplyEntity replyEntity = new ReplyEntity();

        replyEntity.setReplyContent( dto.getReplyContent() );
        replyEntity.setCreatedOn( dto.getCreatedOn() );
        replyEntity.setModifiedOn( dto.getModifiedOn() );

        return replyEntity;
    }

    private Long entityUserId(ReplyEntity replyEntity) {
        if ( replyEntity == null ) {
            return null;
        }
        UserEntity user = replyEntity.getUser();
        if ( user == null ) {
            return null;
        }
        Long id = user.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityTopicId(ReplyEntity replyEntity) {
        if ( replyEntity == null ) {
            return null;
        }
        TopicEntity topic = replyEntity.getTopic();
        if ( topic == null ) {
            return null;
        }
        Long id = topic.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
