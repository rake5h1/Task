pipeline{

    agent any

    stages{

        stage("checkout"){
            steps{
                checkout scm
            }
        }

        stage("Test"){
            steps{
                bat 'mvn clean test'
            }   
          
        }
        
        
    }
    post{
            always{
                
                echo 'Build Completed Succesfully '
            
            }
        }
}