@Library("study_shared") _
pipeline {
    agent { label "dev" }

  stages{
      stage(var_call){
          steps{
            value();
            
            
          }
      }
      
      stage(build){
          steps{
            sh 'echo "hi this is testing new"'
          }
      }

    
  }

}
