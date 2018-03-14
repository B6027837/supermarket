package com.jsaunby

class Task {

	String taskName
	String numberOfPeople
	String sectionName
	String department
	String timeRequired
	String description
	String taskCompleted
	
	static hasMany=[employees:Employee,teams:Team,shifts:Shift]
	static belongsTo=[Team,Employee]

    static constraints = {

	taskName blank:false, nullable:false
	numberOfPeople blank:false, nullable:false
	sectionName blank:false, nullable:false
	department blank:false, nullable:false
	timeRequired blank:false, nullable:false
	description blank:false, nullable:false
	taskCompleted blank:false, nullable:false
	
	teams nullable:true , blank:true
	employees nullable:true , blank:true
	shifts nullable:true , blank:true 



    }
}
