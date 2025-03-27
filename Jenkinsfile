//test
pipeline {
    options {
        disableConcurrentBuilds()  // Ensures only one build runs at a time
    }
    triggers {
        cron('* * * * *')  // Triggers the job every minute
    }
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
    stages {
        stage('Main') {
            steps {
                sh 'hostname'
                sh 'sleep 120'  // Wait for 2 minutes
            }
        }
    }
}
