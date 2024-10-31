// Uses Declarative syntax to run commands inside a container.
pipeline {
    agent {
        kubernetes {
            yaml '''
apiVersion: v1
kind: Pod
spec:
  containers:
  - name: shell
    image: ubuntu
    command:
    - sleep
    args:
    - infinity
    securityContext:
      runAsUser: 1000
'''
            defaultContainer 'shell'
            retries 2
        }
    }
    options {
        durabilityHint('PERFORMANCE_OPTIMIZED') // Optimize for performance, minimizing durability
        disableResume() // Disable the ability to resume after a restart
    }
    stages {
        stage('Main') {
            steps {
                sh 'hostname'
            }
        }
    }
}
