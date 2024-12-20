@Library("study_shared") _
pipeline {
    agent { label "dev" }

    stages{        
      stage('build'){
          steps{
            echo "hi this is testing new ${FOO}"
          }
      }

    
  }

}
