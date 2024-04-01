pipeline {
    agent any

    environment {
        MAVEN_HOME = tool 'maven'
    }

    tools {
        jdk 'jdk17'
    }

    stages {
        stage("Build"){
            steps{
                bat "mvn clean install -DskipTests"
            }
        }

        stage("Docker"){
            steps{
                script {
                    bat "docker build -t springapp ."
                }
            }
        }

        stage("Deploy"){
            steps{
                script{
                    bat "docker run --name springApp -it -p 9090:9090 -d springapp"
                }
            }
        }
    }
}