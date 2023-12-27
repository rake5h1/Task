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

        stage("Test"){
            steps{
                sh 'mvn clean test'
            }   
          
        }
        
        
    }
    post{
            always{
                
                echo 'Build Completed'
            
            }
        }
}