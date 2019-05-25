pipeline {
     agent any
     stages {
          stage('Primeiro stage') {
               steps {
                    echo 'Step 1. Test'
		    sh """sudo docker run -it --rm -v $PWD:/pom.xml -w /pom.xml abu/maven:v1 mvn test"""
               }
          }
          stage('Segundo Stage') {
               steps {
                    echo 'Step 1. Compile'
               }
          }
     }
}


