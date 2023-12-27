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
        steps("Setup"){
            steps{
                sh 'chmod +x /var/lib/jenkins/workspace/Maven/resources/drivers/geckodriver'

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