pipeline {
    agent any

    parameters {
        string(name: 'TEST_NAME', defaultValue: 'LoginTest')
    }

    stages {

        stage('Parallel Tests') {
            parallel {

                stage('Test Execution 1') {
                    steps {
                        retry(2) {
                            bat "mvn -Dtest=%TEST_NAME% test"
                        }
                    }
                }

                stage('Test Execution 2') {
                    steps {
                        retry(2) {
                            bat "mvn -Dtest=AnotherTest test"
                        }
                    }
                }

            }
        }

    }
}