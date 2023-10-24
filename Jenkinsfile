pipeline {
agent any
      tools {
            maven 'MAVEN_LOCAL'
            jdk 'JDK_LOCAL'
          }
       stages{
           stage('Pipeline Bookshelf') {
               steps{
                   sh  'mvn clean package'
               }
           }
       }
}