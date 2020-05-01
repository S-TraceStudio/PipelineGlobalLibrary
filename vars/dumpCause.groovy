@NonCPS
def call() {
    echo "cause: ${currentBuild.rawBuild.getCause(hudson.model.Cause$UserIdCause)}"
}