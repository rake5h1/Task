pipeline{
    agent{
        label "node"
    }
    
    stages{
        stage("Test"){
            steps{
                bat 'mvn clean test'
            }
          
        }
        stage("Artifacts"){
            steps{
                archiveArtifacts artifacts: /results
            }
        }
    }
   
}