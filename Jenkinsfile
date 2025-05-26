@Library("shared_library") _
pipeline {
    agent any

    // environment {
    //     IMAGE_NAME = 'kireeti1234/helloworld'
    // }

    stages {
        stage('checkout') {
            steps {
                git url: 'https://github.com/KIREETI1234/shared-library.git', branch: 'main'
            }
        }

        stage('function call from shared library') {
            steps {
                script {
                    call('Kireeti')  // This will call the shared library function
                }
            }
        }
    }
}
