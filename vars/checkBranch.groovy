def call() {
    pipeline {
        agent any

        options {
            timestamps()
            disableConcurrentBuilds()
            skipDefaultCheckout(true)
        }

        stages {
            stage('Run') {
                steps {
                    checkout scm
                    script {
                        // Access the BRANCH_IS_PRIMARY environment variable
                        if (env.BRANCH_IS_PRIMARY == 'true') {
                            echo "This is the primary branch."
                            // Perform actions specific to the primary branch
                        } else {
                            echo "This is not the primary branch."
                            // Perform actions for non-primary branches
                        }
                    }
                }
            }
        }
    }
}
