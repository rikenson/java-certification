

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
              sh "rm -rf *"
              sh "git clone https://github.com/rjacques89/java-certification.git"
            }
        }

        stage("Build"){
            steps{
               echo 'Testing the application'
            }
        }

        stage("Run"){
            steps{
                echo 'Deploying the application'
            }
        }
    }
}

nodes{
   //ajouter les script groovy
}
