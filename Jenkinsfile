pipeline {
    agent any

    stages{
      
        stage("Clone"){
            steps{
               echo 'Cloning the application...'
              sh "rm -rf *"
              sh "git clone https://github.com/rjacques89/java-certification.git"
            }
        }

        stage("Build"){
            steps{
               echo 'Testing the application...'
               sh 'cd java-certification && javac Forest.java'
            }
        }

        stage("Run"){
            steps{
                echo 'Deploying the application...'
                sh 'cd java-certification && java Forest'
            }
        }
    }
}
