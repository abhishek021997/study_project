//@Library("study_shared") _
pipeline {
    agent { label "dev" }

  stages{
      stage(var_call){
          steps{
            class Example {
              static void main(String[] args) {
                  // Using a simple println statement to print output to the console
                  println('Hello World');
              }
            }
            
            
          }
      }
      
      stage(build){
          steps{
            sh 'echo "hi this is testing new"'
          }
      }

    
  }

}
