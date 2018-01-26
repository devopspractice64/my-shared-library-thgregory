def call(int buildNumber) {

    node {
        stage('Checkout') {
            git url: 'https://github.com/tkgregory/legacy-repo.git'
            sh 'ls'
            def common = load('common.groovy')
            common.doSomething()
        }
        stage('Even Stage') {
            echo "The build number is even"

        }
    }

}