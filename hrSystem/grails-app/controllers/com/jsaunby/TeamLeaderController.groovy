package com.jsaunby

class TeamLeaderController {

      def scaffold=TeamLeader
def tllogin(){
    }

    def validate() {
	def user = TeamLeader.findByLeaderemail(params.leaderemail)
	if (user && user.password == params.password){
		session.user = user
		render view:'tlhome'
						}



	else{
	flash.message = "Invalid username/password."
	render view:'tllogin'
				}
	}



	def tllogout = {
 	session.user = null
 	redirect(uri:'/')
 			}

}

