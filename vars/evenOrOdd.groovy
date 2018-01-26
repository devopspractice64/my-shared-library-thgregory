def call(int buildNumber) {
    pipeline {
        agent any
        stages {
            stage('Checkout') {
                steps {
                    println 'Morning'
                    git url: 'https://github.com/tkgregory/legacy-repo.git'
                    sh 'ls'
                }
            }
            stage('Even Stage') {
                steps {
                    echo "The build number is even"
                }
            }
        }
    }
}