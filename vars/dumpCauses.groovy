@NonCPS
def call() {
    echo "causes: ${currentBuild.rawBuild.getCauses()}"
}
