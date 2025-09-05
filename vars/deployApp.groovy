def call(Map config = [:]) {
    def app = config.app ?: 'default-app'
    def env = config.env ?: 'dev'
    def version = config.version ?: 'latest'

    echo "Deploying ${app} to ${env} with version ${version}"
}