pipeline {
agent any
      tools {
            maven 'MAVEN_HOME'
            jdk 'JAVA_HOME'
          }
       stages{
           stage('Pipeline Bookshelf') {
               steps{
                   sh  'mvn clean package'
               }
           }
       }
}