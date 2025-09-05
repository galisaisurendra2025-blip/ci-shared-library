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


pipeline {
    agent any
    stages {
        stage('Collect Inputs') {
            steps {
                script {
                    def inputs = getUserInputs()
                    echo "App: ${inputs.APP_NAME}, Env: ${inputs.ENVIRONMENT}, Version: ${inputs.VERSION}"
                }
            }
        }
    }
}
