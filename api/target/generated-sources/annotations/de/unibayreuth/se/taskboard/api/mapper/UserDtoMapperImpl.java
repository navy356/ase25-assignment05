package de.unibayreuth.se.taskboard.api.mapper;

import de.unibayreuth.se.taskboard.api.dtos.UserDto;
import de.unibayreuth.se.taskboard.business.domain.User;
import java.time.LocalDateTime;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-16T17:10:59+0000",
    comments = "version: 1.6.2, compiler: javac, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class UserDtoMapperImpl extends UserDtoMapper {

    @Override
    public UserDto fromBusiness(User source) {
        if ( source == null ) {
            return null;
        }

        UUID id = null;
        LocalDateTime createdAt = null;
        String name = null;

        id = source.getId();
        createdAt = mapTimestamp( source.getCreatedAt() );
        name = source.getName();

        UserDto userDto = new UserDto( id, createdAt, name );

        return userDto;
    }

    @Override
    public User toBusiness(UserDto source) {
        if ( source == null ) {
            return null;
        }

        String name = null;

        name = source.getName();

        User user = new User( name );

        user.setId( source.getId() );

        user.setCreatedAt( mapTimestamp(source.getCreatedAt()) );

        return user;
    }
}
