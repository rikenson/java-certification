

pipeline {
    agent any

    environment {

    }

    parameters {

    }


    tools {

    }

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
               sh 'cd java-certification/ && javac chapter/Forest.java'
            }
        }

        stage("Run"){
            steps{
                echo 'Deploying the application...'
                sh 'java chapter.Forest'
            }
        }
    }
}

nodes{
   //ajouter les script groovy
}
