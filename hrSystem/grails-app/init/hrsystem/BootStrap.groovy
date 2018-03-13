package com.jsaunby

class BootStrap {

    def init = { servletContext ->



// Manager
def manag3r = new 
Manager(
fullName: 'Riya Acharya',
userName: 'r.acharya',
password: 'nepal123',
managerEmail: 'r.acharya@icloud.com',
office: 'B9343',
department: 'Bakery'
).save()

def bakerymanager = new
Manager(
fullName: 'Harris Mohammed',
userName: 'hazza.mohammed',
password: 'chesterfield123',
managerEmail: 'hazza.m@icloud.com',
office: 'B9309',
department: 'Bakery'
).save()

//Team Leader
def leader = new
TeamLeader(
fullName: 'Rachel Green',
department: 'Clothes',
employeeID: 'RG123',
sectionName: 'Sportswear',
officePhone: '01142356478',
leaderEmail: 'r.green@icloud.com',
password: 'sports123'
).save()

def teamleader2 = new
TeamLeader(
fullName: 'Chandler Bing',
department: 'Grocery',
employeeID: 'CB123',
sectionName: 'Butcher',
officePhone: '01142344321',
leaderEmail: 'c.bing@icloud.com',
password: 'bing123'
).save()


def employee = new
Employee(
fullName: 'John McConnachie',
dateOfBirth: new Date ('08/05/1996'),
residence: 'Chesterfield',
hourlyRate: '10.50',
employeeID: 'jm123',
dateEmployed: new Date ('26/01/2018'),
taxCode: 'TX5655',
contract: 'part-time'
).save()

def employee2 = new
Employee(
fullName: 'Monica Geller',
dateOfBirth: new Date ('03/03/1976'),
residence: 'Birmingham',
hourlyRate: '9.20',
employeeID: 'mg123',
dateEmployed: new Date ('21/10/2016'),
taxCode: 'TX3321',
contract: 'full-time'
).save()



def team = new
Team(
teamName: 'Team Clothing',
numberOfEmployees: 21,
sectionName: 'Butcher',
description: 'Deals with clothing department'
).save()

def team2 = new
Team(
teamName: 'Team Deliveries',
numberOfEmployees: 30,
sectionName: 'Loading',
description: 'Deals with deliveries'
).save()



def task = new
Task(
taskName: 'Decorating',
numberOfPeople: '30',
sectionName: 'Vegetables',
department: 'Grocery',
timeRequired: '20 hours',
description: 'Decorating the vegetable section of the groceries',
taskCompleted: 'yes'
).save()

def task2 = new
Task(
taskName: 'Stock rotation',
numberOfPeople: '2',
sectionName: 'Bakery',
department: 'Grocery',
timeRequired: '12 hours',
description: 'Restocking and checking dates and rotating stock if necessary',
taskCompleted: 'no'
).save()


def shift2 = new
Shift(
timeOfDay: 'Evening',
dayOfWeek: 'monday',
numberOfHours: '2',
startingTime: '6.00am'
).save()



    }
    def destroy = {
    }
}


