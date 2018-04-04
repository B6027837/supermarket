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

	Shift shift
	Manager manager
	TeamLeader teamleader

	static belongsTo=[Team]

	


    static constraints = {

	fullName blank:false, nullable:false
	dateOfBirth blank:false, nullable:false
	residence blank:false, nullable:false
	hourlyRate blank:false, nullable:false
	dateEmployed blank: false, nullable:false
	employeeID blank:false, nullable:false
	taxCode blank:false, nullable:false
	contract blank:false, nullable:false
	
	shift nullable:true , blank:true
	manager nullable:true, blank:true
	teamleader nullable:true, blank:true

    }
}
