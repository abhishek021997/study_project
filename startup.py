import os
import time

"""
Created by: Abhishek Sharma
data collection and run

"""
def docker_data(a):
    if a == 0:
        
        def docker_imge_get(docker_imges):
            if docker_imges == 0:
                os.system("docker-compose up -d")
                
            elif docker_imges == 1:
                
                os.system("docker-compose up -d")
            else:

                print(f"Image already pull in your machine1{docker_imges}")

        docker_imges = os.WEXITSTATUS(os.system("docker images | grep -ic study_img"))
        
        docker_imge_get(docker_imges)


    elif a == 1:
        #def cont_recreate(b,fetch_data):
            


        b = os.WEXITSTATUS(os.system(f" {doc_img_output} | grep -ic Exited"))
        #cont_recreate(b, fetch_data)
    else:
        print("Container not created")

docker_process = os.WEXITSTATUS(os.system("docker ps -a | grep -i study"))

doc_img_output = f"{docker_process}"

a = os.WEXITSTATUS(os.system(f" {doc_img_output} | wc -l"))

docker_data(a)
#docker_ps = os.system("docker build .")