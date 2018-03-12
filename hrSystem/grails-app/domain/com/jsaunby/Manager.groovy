package com.jsaunby

class Manager {

	String fullName
	String userName
	String password
	String managerEmail
	String office
	String department
	String teamLeader
	String employee

    static constraints = {

	fullName blank:false, nullable:false
	userName blank:false, nullable:false
	password blank:false, nullable:false
	managerEmail blank:false, nullable:false, email:true
	office blank:false, nullable:false
	department blank:false, nullable:false
	teamLeader blank:false, nullable:false
	employee blank:false, nullable:false

    }
}
