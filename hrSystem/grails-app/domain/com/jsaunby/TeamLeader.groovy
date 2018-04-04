package com.jsaunby

class TeamLeader {

	String fullName
	String department
	String employeeID
	String sectionName
	String officePhone
	String leaderemail
	String password
	
	Manager manager
	Team team
	static hasMany=[employees:Employee]



    static constraints = {

	fullName blank:false, nullable:false
	department blank:false, nullable:false
	employeeID blank:false, nullable:false
	sectionName blank:false, nullable:false
	officePhone blank:false, nullable:false
	leaderemail blank:false, nullable:false
	password blank:false, nullable:false

	manager nullable:true, blank:true
	team nullable:true, blank:true
	employees nullable:true , blank:true  


    }
}
