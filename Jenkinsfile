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
}