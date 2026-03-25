pipeline {
    agent any

    stages {

        stage('Parallel Tests') {
            parallel {

                stage('Login Test') {
                    steps {
                        bat 'mvn -Dtest=LoginTest test'
                    }
                }

                stage('Another Test') {
                    steps {
                        bat 'mvn -Dtest=AnotherTest test'
                    }
                }

            }
        }

    }
}