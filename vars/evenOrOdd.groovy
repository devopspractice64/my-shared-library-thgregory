def call(int buildNumber) {
    pipeline {
        agent any
        stages {
            stage('Checkout') {
                steps {
                    git url: 'https://github.com/tkgregory/legacy-repo.git'
                    sh 'ls'
                    def commno = load('common.groovy')
                    common.doSomething()
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