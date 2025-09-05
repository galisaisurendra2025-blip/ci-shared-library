@Library("ci-shared-library") _
pipeline {
    agent any
    stages {
        stage('Hello'){
            steps{
                deployApp(app: 'order-service', env: 'staging', version: '1.2.3')
            }
        }
    }
}