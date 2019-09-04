pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'docker build -t app:test .'
      }
    }
    stage('Test') {
      steps {
        echo 'Test'
        sh 'docker run -d --name app app:test'
        sh '/bin/nc -vz localhost 80'
        sh 'docker stop app'
      }
    }
    stage('Push Registry') {
      steps {
        sh 'docker tag app:test gusanorock/app:stable'
        sh 'docker push gusanorock/app:stable'
      }
    }
  }
}