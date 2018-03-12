package com.jsaunby

class Team {

	String teamName
	int numberOfEmployees
	String sectionName
	String description
	String teamLeader
	String shift
	String task
	String employee

    static constraints = {

	teamName blank:false, nullable:false
	numberOfEmployees blank:false, nullable:false
	sectionName blank:false, nullable:false
	description blank:false, nullable:false
	teamLeader blank:false, nullable:false
	shift blank:false, nullable:false
	task blank:false, nullable:false
	employee blank:false, nullable:false

    }

}
