package com.jsaunby

class HrSystemTagLib {
   // static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

def loginToggle = {
out << "<div style='margin: 15px 0 40px;'>"
if (request.getSession(false) && session.user){

out << "<span style='float:left; margin-left: 15px'>"
out << "Welcome ${session.user}."
out << "</span><span style='float:right;margin-right:15px'>"

out << "<a href='${createLink(controller:'manager', action:'logout')}'>"
out << "Manager Logout </a></span>"}

else{
out << "<span style='float:right;margin-right:10px'>"
out << "<a href='${createLink(controller:'manager', action:'login')}'>"
out << "Manager Login </a></span>"
}
out << "</div><br/>"
}

def mainloginToggle = {
out << "<div style='margin: 15px 0 40px;'>"
if (request.getSession(false) && session.user){

out << "<span style='float:left; margin-left: 15px'>"
out << "Welcome ${session.user}."
out << "</span><span style='float:right;margin-right:15px'>"

out << "<a href='${createLink(controller:'teamLeader', action:'tllogout')}'>"
out << " Teamleader Logout </a></span>"}

else{
out << "<span style='float:right;margin-right:10px'>"
out << "<a href='${createLink(controller:'teamLeader', action:'tllogin')}'>"
out << "Teamleader Login </a></span>"
}
out << "</div><br/>"
}
}
