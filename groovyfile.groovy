//@Library("study_shared") _
pipeline {
    agent { label "dev" }

vars{
    abhi = "12345"
}
  stages{
    stage(var_call){
      steps{
        echo "${vars.abhi}"

      }
    }
      
      
    stage(build){
        steps{
          sh 'echo "hi this is testing new"'
        }
    }

    
  }

}
