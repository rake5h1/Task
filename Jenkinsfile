pipeline{

    agent any
    
    tools {
        maven 'Maven'
    }

    stages{

        stage("Checkout"){
            steps{
                checkout scm
            }
        }
        stage("Setup"){
            steps{
                sh 'chmod +x /var/lib/jenkins/workspace/Pipeline/resources/drivers/chromedriver'

            }
        }

        stage("Test"){
            steps{
                sh 'mvn clean test'
            }   
          
        }
        
        
    }
    post{
            always{
                
                echo 'Build Completed'
                archiveArtifacts artifacts: '/results'
            
            }
        }
}