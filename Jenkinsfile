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
        sh 'docker run --rm --name app -p 80:80 app:test'
        sh '/bin/nc -vz localhost 80'
      }
    }
    stage('Push Registry') {
      steps {
        sh 'docker tag app:test gusanorock/app:stable'
        sh 'docker push app:test gusanorock/app:stable'
      }
    }
  }
}