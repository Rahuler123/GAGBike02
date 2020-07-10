package com.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.user.service.profileUpdatingService;
import com.user.model.UniversalLogin;
import com.user.model.UserMaster;
import com.user.dao.profileUpdatingDao;


@Service
public class profileUpdatingService {
	
	private final profileUpdatingDao mobrepo;
	
	
	@Autowired
	public profileUpdatingService (profileUpdatingDao mobrepo ) {
		this.mobrepo = mobrepo;
		
	}
//	public List<MobileNumber> findAll(){
//		return mobrepo.findAll();
//	}
//	
	public Optional <UserMaster> findByUserId(Long userId){
		return mobrepo.findById(userId);
		
	}
	 
	public UserMaster save (UserMaster UserMaster) {
		return mobrepo.save(UserMaster);
	}
	public void deleteById(Long userId) {
		mobrepo.deleteById(userId);
		
	}

}
