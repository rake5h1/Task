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
        stage("Artifacts"){
            steps{
                archiveArtifacts artifacts: '/results'
            }
        }
    }
}