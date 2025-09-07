def call(Map config = [:]) {
    def repoUrl = config.repo ?: error("⚠️ 'repo' is required")
    def branch = config.branch ?: "main"
    def credsId = config.credsId ?: ""

    echo "Cloning repo: ${repoUrl} with branch: ${branch} using SSH credentials (if provided)"

    checkout([
        $class: 'GitSCM',
        branches: [[name: "*/${branch}"]],
        doGenerateSubmoduleConfigurations: false,
        extensions: [[$class: 'CleanBeforeCheckout']],
        userRemoteConfigs: [[
            url: repoUrl,
            credentialsId: credsId
        ]]
    ])
}