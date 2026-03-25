pipeline {
    agent any

    stages {

        stage('Build & Test') {
            steps {
                retry(2) {
                    bat 'mvn clean test'
                }
            }
        }

    }
}