pipeline {
    agent any

    environment {
        IMAGE_NAME = 'dockjenkins-java-app'
    }

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/Creatureab/DockJenkineFile.git', branch: 'main'
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    dockerImage = docker.build("${IMAGE_NAME}:${BUILD_NUMBER}")
                }
            }
        }

        stage('Compile Java Class') {
            steps {
                bat 'javac Employee.java'
            }
        }

        stage('Run Java Class') {
            steps {
                bat 'java Employee'
            }
        }
    }

    post {
        always {
            cleanWs()
        }
    }
}
