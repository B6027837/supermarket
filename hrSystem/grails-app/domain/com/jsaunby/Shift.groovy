package com.jsaunby

class Shift {

	String timeOfDay
	String dayOfWeek
	String numberOfHours
	String startingTime
	String task
	String employee
	String team

    static constraints = {

	timeOfDay blank:false, nullable:false
	dayOfWeek blank:false, nullable:false
	numberOfHours blank:false, nullable:false
	startingTime blank:false, nullable:false
	task blank:false, nullable:false
	employee blank:false, nullable:false
	team blank:false, nullable:false


    }
}
