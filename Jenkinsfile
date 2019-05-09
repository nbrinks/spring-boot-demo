pipeline {
  agent {
    docker {
      image 'gradle:jdk11-slim'
    }

  }
  stages {
    stage('') {
      steps {
        sh './gradlew check'
      }
    }
  }
}