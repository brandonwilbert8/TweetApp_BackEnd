package com.tweetapp.beans;

import lombok.Data;

@Data
public class UserResponse {
	boolean isSuccess;
	
	String errorMessage;
	
	public UserResponse(boolean isSuccess, String errorMessage) {
		this.isSuccess = isSuccess;
		this.errorMessage = errorMessage;
	}

}