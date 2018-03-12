package com.jsaunby

class Employee {

	String fullName
	Date dateOfBirth
	String residence
	String hourlyRate
	String employeeID
	Date dateEmployed
	String taxCode
	String contract
	String manager
	String teamLeader
	String leader
	String team
	String task
	String shift


    static constraints = {

	fullName blank:false, nullable:false
	dateOfBirth blank:false, nullable:false
	residence blank:false, nullable:false
	hourlyRate blank:false, nullable:false
	employeeID blank:false, nullable:false
	taxCode blank:false, nullable:false
	contract blank:false, nullable:false
	manager blank:false, nullable:false
	teamLeader blank:false, nullable:false
	leader blank:false, nullable:false
	team blank:false, nullable:false
	task blank:false, nullable:false
	shift blank:false, nullable:false

    }
}
