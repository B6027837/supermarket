package com.jsaunby

class Team {

	String teamName
	int numberOfEmployees
	String sectionName
	String description

	TeamLeader teamleader
	static hasMany=[employees:Employee,shifts:Shift,tasks:Task]
	

    static constraints = {

	teamName blank:false, nullable:false
	numberOfEmployees blank:false, nullable:false
	sectionName blank:false, nullable:false
	description blank:false, nullable:false
	
	tasks nullable:true , blank:true
	shifts nullable:true, blank:true  
	employees nullable:true , blank:true
	teamleader nullable:true , blank:true


    }

}
