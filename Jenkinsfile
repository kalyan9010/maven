pipeline {
    agent any 
    stages {
        stage('Compile') {
            steps {
                echo 'Welcome To Stage compile'
                sh 'mvn compile'
            }
        }
        stage('Test') {
            steps {
                echo 'Welcome To Stage test'
                sh 'mvn test'
            }
        }
    }
}
