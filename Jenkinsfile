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
          sh "./gradlew --info sonarqube " +
                  "-Dsonar.projectKey=nbrinks_spring-boot-demo " +
                  "-Dsonar.oragnization=nbrinks-github " +
                  "-Dsonar.host.url=${env.SONAR_HOST_URL} " +
                  "-Dsonar.login=${env.SONAR_AUTH_TOKEN} " +
                  "-Dsonar.pullrequest.key=${env.CHANGE_ID} " +
                  "-Dsonar.pullrequest.branch=${env.CHANGE_BRANCH} " +
                  "-Dsonar.pullrequest.base=${env.CHANGE_TARGET}"
        }
      }
    }
  }
}
