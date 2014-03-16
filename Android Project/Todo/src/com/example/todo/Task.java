package com.example.todo;

//parse imports
import com.parse.ParseClassName;
import com.parse.ParseObject;
import com.parse.ParseUser;

//tells parse what table our obj is from
@ParseClassName("Task")
public class Task extends ParseObject{
	public Task(){
		
	}
	
	//check and set completed
	public boolean isCompleted(){
		return getBoolean("completed");
	}
	
	public void setCompleted(boolean complete){
		put("completed", complete);
	}

	//get set desc
	public String getDescription(){
		return getString("description");
	}

	public void setDescription(String description){
		put("description", description);
	}
	
	//adds user's key
	public void setUser(ParseUser currentUser) {
		put("user", currentUser);
	}
}
