package pl.piterpti.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.piterpti.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	/**
	 * Finds user in DB by passed user name
	 * @param username
	 * @return found user or null
	 */
	public User findOneByUsername(String username);
	
}
