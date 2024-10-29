pipeline {
    agent any
    }
    options {
        durabilityHint('PERFORMANCE_OPTIMIZED') // Optimize for performance, minimizing durability
        disableResume() // Disable the ability to resume after a restart
    }
    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
                sleep 600
            }
        }
    }
