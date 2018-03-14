package com.jsaunby

class Shift {

	String timeOfDay
	String dayOfWeek
	String numberOfHours
	String startingTime

	Employee employee
	static hasMany=[teams:Team,tasks:Task]
	static belongsTo=[Task,Team]

    static constraints = {

	timeOfDay blank:false, nullable:false
	dayOfWeek blank:false, nullable:false
	numberOfHours blank:false, nullable:false
	startingTime blank:false, nullable:false

	employee nullable:true , blank:true
	teams nullable:true , blank:true
	tasks nullable:true , blank:true
	


    }
}
