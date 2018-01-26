def call(int buildNumber) {
    pipeline {
        agent any
        stages {
            stage('Checkout') {
                git url: 'https://github.com/tkgregory/legacy-repo.git'
            }
            stage('Even Stage') {
                steps {
                    echo "The build number is even"
                }
            }
        }
    }
}