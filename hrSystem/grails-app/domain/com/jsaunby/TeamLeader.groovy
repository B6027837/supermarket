package com.jsaunby

class TeamLeader {

	String fullName
	String department
	String employeeID
	String sectionName
	String officePhone
	String leaderEmail
	String password
	


    static constraints = {

	fullName blank:false, nullable:false
	department blank:false, nullable:false
	employeeID blank:false, nullable:false
	sectionName blank:false, nullable:false
	officePhone blank:false, nullable:false
	leaderEmail blank:false, nullable:false
	password blank:false, nullable:false




    }
}
