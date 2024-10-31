pipeline {
    agent any
    options {
        durabilityHint('PERFORMANCE_OPTIMIZED') 
        disableResume() 
    }
    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
                sleep 600
            }
        }
    }
}
