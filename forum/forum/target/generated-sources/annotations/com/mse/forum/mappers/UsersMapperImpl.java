package com.mse.forum.mappers;

import com.mse.forum.dto.UserDTO;
import com.mse.forum.dto.UserDTO.UserDTOBuilder;
import com.mse.forum.persistance.entities.UserEntity;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-06-22T01:39:20+0300",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_201 (Oracle Corporation)"
)
@Component
public class UsersMapperImpl implements UsersMapper {

    @Override
    public UserDTO toDto(UserEntity entity) {
        if ( entity == null ) {
            return null;
        }

        UserDTOBuilder userDTO = UserDTO.builder();

        userDTO.username( entity.getUsername() );
        userDTO.password( entity.getPassword() );
        userDTO.email( entity.getEmail() );
        userDTO.theme( entity.getTheme() );

        return userDTO.build();
    }

    @Override
    public UserEntity toEntity(UserDTO dto) {
        if ( dto == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setUsername( dto.getUsername() );
        userEntity.setPassword( dto.getPassword() );
        userEntity.setEmail( dto.getEmail() );
        userEntity.setTheme( dto.getTheme() );

        return userEntity;
    }
}
