//@Library("study_shared") _
pipeline {
    agent { label "dev" }

    enviroment{
        ABHI = "12345"
    }
    stages{
      stage("var_call"){
        steps{
          sh echo "${env.ABHI}"

        }
      }
        
        
      stage("build"){
          steps{
            sh 'echo "hi this is testing new"'
          }
      }

    
  }

}
