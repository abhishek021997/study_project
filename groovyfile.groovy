@Library("study_shared") _
pipeline {
    agent { label "dev" }

    stages{        
      stage('build'){
        steps{
          echo "Git content download in a machine"
          sh "rm -rf workspace"
          git branch: 'main', credentialsId: 'github_passwd', url: 'https://github.com/abhishek021997/study_project.git'
        }
      }
      stage('build'){
        steps{
          sh "docker images"
        }

      }



    
  }

}
