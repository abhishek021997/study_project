pipeline {
    agent { label "dev" }

  stages{
    stage(build){
      steps{
        sh 'echo "hi this is tesing"'
      }
    }

    
  }

}
