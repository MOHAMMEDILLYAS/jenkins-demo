pipeline {
    agent any

    parameters {
        string(name: 'TEST_NAME', defaultValue: 'LoginTest')
    }

    stages {

        stage('Run Selected Test') {
            steps {
                bat "mvn -Dtest=%TEST_NAME% test"
            }
        }

    }
}