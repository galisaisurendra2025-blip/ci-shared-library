// def call(Map config = [:]) {
//     def app = config.app ?: 'default-app'
//     def env = config.env ?: 'dev'
//     def version = config.version ?: 'latest'

//     echo "Deploying ${app} to ${env} with version ${version}"
// }

def call() {
    return input(
        id: 'userInput',
        message: 'Provide deployment details',
        parameters: [
            string(name: 'APP_NAME', defaultValue: 'default-app', description: 'Enter application name'),
            choice(name: 'ENVIRONMENT', choices: ['dev', 'qa', 'staging', 'prod'], description: 'Select environment'),
            string(name: 'VERSION', defaultValue: 'latest', description: 'Enter app version')
        ]
    )
}
