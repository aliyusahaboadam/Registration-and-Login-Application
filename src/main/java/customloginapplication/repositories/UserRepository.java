package customloginapplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import customloginapplication.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByUsername (String username);

}
