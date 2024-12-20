//@Library("study_shared") _
pipeline {
    agent { label "dev" }

    stages{        
      stage("build"){
          steps{
            sh 'echo "hi this is testing new"'
          }
      }

    
  }

}
