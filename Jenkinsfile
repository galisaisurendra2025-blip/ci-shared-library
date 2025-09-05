@Library("ci-shared-library") _
pipeline {
    agent any
    stages {
        stage('Hello'){
            steps{
                helloWorld()
            }
        }
        stage('Hello2'){
            steps{
                helloWorld()
            }
        }
        stage('Docker'){
            steps{
                sh 'docker ps'
            }
        }
        stage('Docker3'){
            steps{
                sh 'docker ps'
            }
        }
    }
}