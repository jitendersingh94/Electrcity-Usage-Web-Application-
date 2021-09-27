package edu.csus.csc131.project.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	
	// instance variables----------------------------
	private @Id@GeneratedValue long id;
	private String firstName;
	private String lastName;
	private String streetAddress;
	private String city;
	private String state;
	private int zip;
	
	// data above here
	//===============================================
	// methods below here
	
	// constructors----------------------------------
	
	// default constructor
	User () {}
	
	// overloaded constructor	
	User(String firstName, String lastName, String streetAddress, 
		 String city, String state, int zip) {
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.streetAddress = streetAddress;
	    this.city = city;
	    this.state = state;
	    this.zip = zip;		
	}

	// accessors/mutators----------------------------
	
	// ID 
	public long getID() {
		return id;
	}

	public void setID(long id) {
		this.id = id;
	}

	// fisrtName
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
    
	
	// lastName
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
    
	
	// streetAddress
	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
    
	
	// city
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
    
	
	// state
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
    
	// zip
	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}	
	
	@Override
	  public String toString() {
	    return "User{" + "id=" + this.id
	    		+ ", firstname ='" + this.firstName + '\''
	    		+ ", lastname ='" + this.lastName + '\''
	    		+ ", street address ='" + this.streetAddress+'\''
	    		+ ", city ='" + this.city +'\''
	    		+ ", state ='" + this.state +'\''
	    		+ ", zip ='" + this.zip+'}';
	  }
	  

}
