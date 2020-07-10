package com.user.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.user.service.profileUpdatingService;
import com.user.model.UserMaster;



@RestController
//@RequestMapping("/blog/details")
public class profileController {
	private final profileUpdatingService profileUpdatingService;
	
	@Autowired
	public profileController(profileUpdatingService profileUpdatingService) {
		this.profileUpdatingService = profileUpdatingService;
	}
	
//	@GetMapping
//	public ResponseEntity<List<MobileNumber>> findAll() {
//		return ResponseEntity.ok(MobileNumberService.findAll());
//	}
	
//	
//	@GetMapping("/{id}")
//	public ResponseEntity <UserMaster> findById(@PathVariable Long id){
//		java.util.Optional<UserMaster> mob = profileUpdatingService.findByUserId(id);
//		 return ResponseEntity.ok(profileUpdatingService.findByUserId(id).get());
//		 
//	}
	
	@PostMapping("/profile/saveProfile")
	 public ResponseEntity <UserMaster> create (@RequestBody UserMaster UserMaster){
		 return ResponseEntity.status(HttpStatus.CREATED).body(profileUpdatingService.save(UserMaster));
		 }
	
	@PutMapping("profile/updateProfile/{userId}")
	public ResponseEntity <UserMaster> update (@PathVariable Long userId, @RequestBody UserMaster UserMaster){
		return ResponseEntity.accepted().body(profileUpdatingService.save(UserMaster));
	}
	
	@DeleteMapping("profile/deleteProfile/{userId}")
	public ResponseEntity delete(@PathVariable Long userId) {
		profileUpdatingService.deleteById(userId);
		return ResponseEntity.accepted().build();
		
	}
	
	
}
