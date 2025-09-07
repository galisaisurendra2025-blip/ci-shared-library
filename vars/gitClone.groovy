// vars/gitClone.groovy
def call(Map config = [:]) {
    // Validate required parameters
    def repoUrl = config.repo ?: error("⚠️ 'repo' is required")
    def branchRaw = config.branch ?: "main"
    def credsId = config.credsId ?: ""

    // Remove 'origin/' prefix if present
    def branch = branchRaw.replaceFirst(/^origin\//, '')

    echo "Cloning repo: ${repoUrl} with branch: ${branch}"

    checkout([
        $class: 'GitSCM',
        branches: [[name: "*/${branch}"]],
        doGenerateSubmoduleConfigurations: false,
        extensions: [
            [$class: 'CleanBeforeCheckout'], // clean workspace before checkout
        ],
        userRemoteConfigs: [[
            url: repoUrl,
            credentialsId: credsId
        ]]
    ])
}