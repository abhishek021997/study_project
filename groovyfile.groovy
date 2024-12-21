//@Library("study_shared") _
pipeline {
    agent { label "dev" }

    stages{        
      stage('download data'){
        steps{
          echo "Git content download in a machine"
          sh "rm -rf workspace"
          git branch: 'main', credentialsId: 'github_passwd', url: 'https://github.com/abhishek021997/study_project.git'
        }
      }
      stage('build'){
        steps{

          sh "sh data_filter.sh"
          sh "python3 startup.py"  
          sh "ansible-playbook apache_content1.yml"      

        }

      }



    
  }

}
