//@Library("study_shared") _
pipeline {
    agent { label "dev" }

enviroment{
    abhi = "12345"
}
  stages{
    stage(var_call){
      steps{
        echo "${env.abhi}"

      }
    }
      
      
    stage(build){
        steps{
          sh 'echo "hi this is testing new"'
        }
    }

    
  }

}
