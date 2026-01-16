package de.unibayreuth.se.taskboard.business.ports;

import de.unibayreuth.se.taskboard.business.domain.User;
import de.unibayreuth.se.taskboard.business.exceptions.DuplicateNameException;
import de.unibayreuth.se.taskboard.business.exceptions.MalformedRequestException;
import de.unibayreuth.se.taskboard.business.exceptions.UserNotFoundException;
import org.springframework.lang.NonNull;
import java.util.List;
import java.util.UUID;

public interface UserService {
    //TODO: Add user service interface that the controller uses to interact with the business layer.
    //DONE: Added user service interface without delete for now as UserPersistenceService does not have it.
    //TODO: Implement the user service interface in the business layer, using the existing user persistence service.
    //DONE: Implemented user service interface.
    void clear();
    User create(@NonNull User user) throws MalformedRequestException, DuplicateNameException;
    @NonNull
    List<User> getAll();
    //getById has User return type and not Optional<User> for consistency
    //TaskService has Task return type for getById unlike TaskPersistenceService which has Optional<Task>
    @NonNull
    User getById(UUID id) throws UserNotFoundException;
    @NonNull
    User upsert(User user) throws UserNotFoundException, DuplicateNameException;
}
