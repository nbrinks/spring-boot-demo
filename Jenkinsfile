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
    stage('SonarQube analysis') {
      steps {
        withSonarQubeEnv('sq-cloud') {
          sh 'printenv | sort'
          sh './gradlew --info sonarqube'
        }
      }
    }
  }
}
