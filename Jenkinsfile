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
                sh 'sudo chmod +x /home/ubuntu/Maven/resources/drivers/geckodriver'

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