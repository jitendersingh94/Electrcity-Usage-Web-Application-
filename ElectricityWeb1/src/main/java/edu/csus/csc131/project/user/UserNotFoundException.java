package edu.csus.csc131.project.user;

public class UserNotFoundException extends RuntimeException {

	UserNotFoundException(Long ID) {
	    super("Could not find user " + ID);
	  }
}
