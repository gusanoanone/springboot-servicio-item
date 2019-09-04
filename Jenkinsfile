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
        withCredentials([usernamePassword(credentialsId: 'c31c3513-d30a-4628-bd3a-b9dd380c7158', passwordVariable: 'password', usernameVariable: 'user')]) {
        sh 'docker tag app:test gusanorock/app:stable'
        sh 'docker push gusanorock/app:stable'
      }
    }
  }
}
}