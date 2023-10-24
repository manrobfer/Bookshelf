pipeline {
agent any
      tools {
            maven 'MAVEN_LOCAL'
            jdk 'JDK_LOCAL'
          }
       stages{
           stage('Limpada e constroi') {
               steps{
                   sh  'mvn clean package -DskipTests=true'
               }
           }
          stage('Executa testes') {
              steps{
                  sh  'mvn test'
              }
          }
       }
}