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
        stage('SonarQube Analysis') {
            steps {
//                withSonarQubeEnv('sq-cloud') {
//                    sh 'printenv | sort'
//                    sh "./gradlew --info sonarqube " +
//                            "-Dsonar.projectKey=nbrinks_spring-boot-demo " +
//                            "-Dsonar.organization=nbrinks-github " +
//                            "-Dsonar.host.url=${env.SONAR_HOST_URL} " +
//                            "-Dsonar.login=${env.SONAR_AUTH_TOKEN} " +
//                            "-Dsonar.pullrequest.key=${env.CHANGE_ID} " +
//                            "-Dsonar.pullrequest.branch=${env.CHANGE_BRANCH} " +
//                            "-Dsonar.pullrequest.base=${env.CHANGE_TARGET}"
//                }

                sh 'printenv | sort'
                sh "./gradlew --info sonarqube " +
                        "-Dsonar.projectKey=nbrinks_spring-boot-demo " +
                        "-Dsonar.organization=nbrinks-github " +
                        "-Dsonar.host.url=https://sonarcloud.io " +
                        "-Dsonar.login=27c4844ef43c9d7af78720bd1cbac2f1852ece1e" +
                        "-Dsonar.pullrequest.key=${env.CHANGE_ID} " +
                        "-Dsonar.pullrequest.branch=${env.CHANGE_BRANCH} " +
                        "-Dsonar.pullrequest.base=${env.CHANGE_TARGET}"

            }
        }
        stage('SonarQube Quality Gate') {
            options { timeout(time: 30, unit: 'MINUTES') }
            steps {
                sh 'printenv | sort'
                waitForQualityGate(abortPipeline: true)
            }
        }
    }
}
