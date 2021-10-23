package co.com.user.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.user.model.User;

/**
 * 
 * @author Edsson Pabon
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User,UUID>{

}
