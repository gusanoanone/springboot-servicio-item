pipeline {
  agent any
  stages {
    stage('Inicio') {
      steps {
        echo 'Hola desde stage incio'
      }
    }
    stage('Test2') {
      steps {
        echo 'Hola desde stage2'
      }
    }
  }
  environment {
    test = 'build'
  }
}