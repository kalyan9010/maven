pipeline {
    agent any 
    stages {
        stage('Compile') {
            steps {
                echo 'Welcome To Stage compile'
                sh 'mvn compiler:compile'
            }
        }
        stage('Test') {
            steps {
                echo 'Welcome To Stage test'
                sh 'compiler:testCompile'
            }
        }
    }
}
