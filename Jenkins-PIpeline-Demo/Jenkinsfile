pipeline {
  environment {
    registry = "dailycodebuffer/spring-boot-jenkins-docker"
    registryCredential = 'dockerhub'
    dockerImage = ''
  }
  agent any
  tools { maven "M3" }
  stages {
    stage('Cloning Git') {
      steps {
        git 'https://github.com/dailycodebuffer/Spring-MVC-Tutorials.git'
      }
    }
    stage('Build') {
       steps {
			dir('Jenkins-PIpeline-Demo') {
				bat 'mvn -Dmaven.test.failure.ignore clean package'
			}
		}
    }
    stage('Test') {
		steps {
			dir('Jenkins-PIpeline-Demo') {
				junit '**/target/surefire-reports/TEST-*.xml'
				archiveArtifacts 'target/*.jar'
			}
		}
    }
	stage('SonarQube Analysis') {
		steps {
			dir('Jenkins-PIpeline-Demo') {
				withSonarQubeEnv('sonarqube') {
					bat 'mvn sonar:sonar'
				}
			}
		}
    }
    stage('Building image') {
      steps{
        script {
			dir('Jenkins-PIpeline-Demo') {
				dockerImage = docker.build registry + ":$BUILD_NUMBER"
			}
        }
      }
    }
    stage('Deploy Image') {
      steps{
         script {
			dir('Jenkins-PIpeline-Demo') {
				docker.withRegistry( '', registryCredential ) {
				dockerImage.push()
			  }
			}
        }
      }
    }
    stage('Remove Unused docker image') {
      steps{
		  dir('Jenkins-PIpeline-Demo') {
			bat "docker rmi $registry:$BUILD_NUMBER"
		  }
      }
    }
  }

  post {

        success {
            echo 'This Build is Successfull!'
        }
        failure {
            echo 'I failed :('
        }

    }
}