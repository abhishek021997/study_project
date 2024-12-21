import os
import time

"""
Created by: Abhishek Sharma
data collection and run

"""
def docker_data(a):
    if a == 0:
        def docker_img_make(image_check):
            if image_check == 0:
                print(f"this is value {image_check}")
                
            else:
                print(f"this is value else {image_check}")
                os.system("docker images | grep -ic study")


        image_check = os.WEXITSTATUS(os.system("docker images | grep -ic study"))
        docker_img_make(image_check)

        


    elif a != 0:
        os.system("sh data_filter.sh")
        time.sleep(0.30)
        #os.system("docker-compose up -d")
      
    else:
        print("Container not created")

docker_process = os.WEXITSTATUS(os.system("docker ps -a | grep -i study"))

doc_img_output = f"{docker_process}"

a = os.WEXITSTATUS(os.system(f" {doc_img_output} | wc -l"))

docker_data(a)
