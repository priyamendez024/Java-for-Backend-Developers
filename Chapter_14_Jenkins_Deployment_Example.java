
pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Deploy') {
            steps {
                sh 'aws ecs update-service --cluster my-cluster --service my-service'
            }
        }
    }
}
    