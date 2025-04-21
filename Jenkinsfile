pipeline {
    agent any

    environment {
        IMAGE_NAME = 'dockjenkins-java-app'
        // DOCKER_CREDENTIALS_ID = 'dockerhub-creds' // Not needed if not pushing
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

        // Removed Push to Docker Hub stage since you don't have an account

        stage('Run Image (Optional)') {
            steps {
                script {
                    sh "docker run --rm ${IMAGE_NAME}:${BUILD_NUMBER}" // optional: runs the image
                }
            }
        }
    }

    post {
        always {
            cleanWs()
        }
    }
}
