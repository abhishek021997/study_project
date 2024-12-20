//@Library("study_shared") _
pipeline {
    agent { label "dev" }

    
    ABHI = "12345"
    
    stages{        
      stage("build"){
          steps{
            sh 'echo "hi this is testing new"'
          }
      }

    
  }

}
