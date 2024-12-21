import os
import time

"""
Created by: Abhishek Sharma
data collection and run

"""
def docker_data(a):
    if a == 0:
        #def image_create(image_check):
            if image_check == 256:
                print("there is no conetent")
            else:
                print("Image already In your machine")

        

        image_check = os.system("docker images | grep -i study")
        image_create(image_check)
        




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
