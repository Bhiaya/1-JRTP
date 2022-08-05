package com.mhn.beans;

import java.util.Date;

public class Voter {
private String name;
private int age;
private Date dov;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Date getDov() {
	return dov;
}
public void setDov(Date dov) {
	this.dov = dov;
}



//b. method 
public String checkVotingEligbilty() {
	if (age>=18 )  
		return"Me/miss/Mrs."+name +" you are  eligble for voting"; 
	else
		return"Me/miss/Mrs."+name +" you are not eligble for voting"; 
}

}
 