String call() {
    echo "in"
    if (env.GIT_COMMIT_VERSION == null) {
        def commitTime = ""
        if (isUnix()) {
            commitTime = sh(returnStdout: true, script: 'git show -s --format=%ci')
        } else {
            commitTime = bat(returnStdout: true, script: 'git show -s --format=%ci @')
        }
        String[] toks = commitTime.trim().split(' ')
        env.GIT_COMMIT_VERSION = "${toks[0].replace('-', '.')}.${toks[1].replace(':', '')}"
    }
    env.GIT_COMMIT_VERSION
}