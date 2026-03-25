pipeline {
    agent any

    stages {

        stage('Clone Code') {
            steps {
                git 'https://github.com/MOHAMMEDILLYAS/jenkins-demo.git'
            }
        }

        stage('Build & Test') {
            steps {
                bat 'mvn clean test'
            }
        }

    }
}