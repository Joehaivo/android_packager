pipeline {
    agent {
        label "android"
    }

    options {
        timeout(time: 1, unit: 'HOURS')
        timestamps()
    }

    stages {
        stage('SCM') {
            steps {
                echo 'Hello World'
                script {
                    sh ("java -version")

                    sh ("python3")
                    print("jenkins custom script")

                }
            }
        }
        stage('Build') {
            steps {
                echo 'Hello World'
                script {
                    sh ("java -version")
                    sh ("kotlinc -script src/main/kotlin/main.kts")
                    print("jenkins custom script")
                }
            }
        }
        stage('Test') {
            steps {
                echo 'Test Hello World'
                script {
                    sh ("java -version")

                    sh ("python3")
                    print("jenkins custom script")

                }
            }
        }
        stage('Report') {
            steps {
                echo 'Hello World'
                script {
                    sh ("java -version")

                    sh ("python3")
                    print("jenkins custom script")

                }
            }
        }
    }
}
