package pl.piterpti.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.piterpti.dao.UserRepository;
import pl.piterpti.model.User;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public User save(User user) {
		return userRepository.save(user);
	}
	
	public User update(User user) {
		return userRepository.save(user);
	}
	
	public User find(String userName) {
		return userRepository.findOneByUsername(userName);
	}

	public User find(Long id) {
		
		 Optional<User> user = userRepository.findById(id);
		 if (user.isPresent()) {
			 return user.get();
		 }
		 return null;
	}

}
