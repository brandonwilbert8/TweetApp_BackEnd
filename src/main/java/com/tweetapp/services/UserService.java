package com.tweetapp.services;

import com.tweetapp.dao.TweetRepository;
import com.tweetapp.dao.UserRepository;
import com.tweetapp.entities.Tweet;
import com.tweetapp.entities.User;
import com.tweetapp.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	TweetRepository tweetRepository;
	
	public User createUser(User user) {
		return userRepository.save(user);
	}
	
	public User getUserById(String userId) {
		return userRepository.findById(userId).get();
	}
	
	public User getUserByUsername(String username) {
		return userRepository.findById(username).get();
	}
	
	public User getUserByPassword(String password) {
		return userRepository.findById(password).get();
	}
	
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
	
	public User saveTweet(Tweet tweet, String username){
        User user = userRepository.findByUsername(username).orElseThrow(() -> new UserNotFoundException("User not found"));
        user.getTweets().add(tweet);
        return userRepository.save(user);
    }

	public User findByUsername(String username) {
		return userRepository.findByUsername(username).orElseThrow(() -> new UserNotFoundException("User not found"));
	}
	
	public User findByUsernameAndPassword(String username,String password) {
		return userRepository.findByUsernameAndPassword(username, password).orElseThrow(() -> new UserNotFoundException("User not found"));
	}

//	public List<User> findByUsernameAutocomplete(String username) {
//		return userRepository.findByUsernameAuto(username);
//	}
}

