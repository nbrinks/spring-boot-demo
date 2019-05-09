pipeline {
  agent {
    docker {
      image 'gradle:jdk11-slim'
    }

  }
  stages {
    stage('Gradle Check') {
      steps {
        sh './gradlew check'
      }
    }
  }
}
