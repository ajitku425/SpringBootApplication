pipeline {
    agent any
    stages {
        stage('---clean---') {
            steps {
                bat "maven clean"
            }
        }
        stage('--test--') {
            steps {
                bat "maven test"
            }
        }
        stage('--package--') {
            steps {
                bat "maven package"
            }
        }
    }
}
