package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.User;
import com.app.repo.UserRepo;

@Service
@Transactional
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private UserRepo userrepo; 

	@Override
	public User addOrEditUser(User user) {
		
		return userrepo.save(user) ;
	}

	@Override
	public List<User> getAllUserDetails() {
		
		return userrepo.findAll() ;
	}

	@Override
	public String deleteUserDetails(Integer userid) {
		
		if(userrepo.existsById(userid)) {
		
			userrepo.deleteById(userid);
		return "User details deleted" ;
		}
		return  "Deletion Failed : Invalid User Id !!!!!!!!!!!";
	}

	

}
