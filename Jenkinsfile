pipeline {
	agent {
		label 'DIN30000728'
	}
	
	stages {
	
	
	
		stage("build"){
			steps {
				
				withMaven(jdk: 'java1.8.0_151', maven: 'maven') {
					powershell 'mvn clean compile'
				}
			}
		}
		stage("unit-test"){
			steps {
				withMaven(jdk: 'java1.8.0_151', maven: 'maven') {
					powershell 'mvn surefire:test'
				}
			}
		}
		stage("package"){
			steps {
				withMaven(jdk: 'java1.8.0_151', maven: 'maven') {
					powershell 'mvn war:war'
				}
			}
		}
		stage("deploy"){
			steps {
				withMaven(jdk: 'java1.8.0_151', maven: 'maven') {
					powershell 'mvn tomcat7:undeploy tomcat7:deploy'
				}
				
			}
		}
	}
	
	post {
        success {
          echo "PIPELINE - SUCCESS"
        }
        
        failure {
          echo "PIPELINE - FAILURE"
        }
      }
	
	
}
//def notifyStarted() {
		//echo 'NOTIFICATION - BUILD STARTED'
		// send to email
		//emailext (
		//subject: "STARTED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'",
		//body: """<p>STARTED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]':</p>
        //<p>Check console output at "<a href="${env.BUILD_URL}">${env.JOB_NAME} [${env.BUILD_NUMBER}]</a>"</p>""",
		//recipientProviders: [[$class: 'DevelopersRecipientProvider']]
		//)
	//}
	
	//def notifySuccessful() {
  
		//echo 'NOTIFICATION - BUILD SUCCESSFUL'
		//emailext (
		//subject: "SUCCESSFUL: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'",
		//body: """<p>SUCCESSFUL: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]':</p>
        //<p>Check console output at "<a href="${env.BUILD_URL}">${env.JOB_NAME} [${env.BUILD_NUMBER}]</a>"</p>""",
		//recipientProviders: [[$class: 'DevelopersRecipientProvider']]
		//)
	//}
	
	//def notifyFailed() {
  
		//echo 'NOTIFICATION - BUILD FAILED'
		//emailext (
		//subject: "FAILED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'",
		//body: """<p>FAILED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]':</p>
        //<p>Check console output at "<a href="${env.BUILD_URL}">${env.JOB_NAME} [${env.BUILD_NUMBER}]</a>"</p>""",
		//recipientProviders: [[$class: 'DevelopersRecipientProvider']]
		//)
	//}