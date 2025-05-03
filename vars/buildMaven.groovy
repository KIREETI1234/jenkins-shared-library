def call(String pomPath = '.') {
    pipeline {
        agent any

        tools {
            maven 'Maven 3.8.5' 
            jdk 'JDK 11'        
        }

        stages {
            stage('Checkout') {
                steps {
                    checkout scm
                }
            }
            stage('Build with Maven') {
                steps {
                    sh "mvn -f ${pomPath}/pom.xml clean install"
                }
            }
        }
    }
}
