@Library("study_shared") _
pipeline {
    agent { label "dev" }

    stages{        
      stage('build'){
          steps{
            echo "Git content download in a machine"
            git branch: 'main', credentialsId: 'github_passwd', url: 'https://github.com/abhishek021997/study_project.git'
          }
          steps{

            sh "ls -l workspace/study_project"
          }
      }

    
  }

}
