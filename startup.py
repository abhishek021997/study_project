import os
import docker

"""
Created by: Abhishek Sharma
data collection and run

"""
def docker_data(a):
    if a == 0:
        os.system("docker images")
    elif a == 1:
        b = os.WEXITSTATUS(os.system(f" {doc_img_output} | grep -i Exited"))
    else:
        print("Container not created")

docker_images = os.WEXITSTATUS(os.system("docker ps -a | grep -i study"))

doc_img_output = f"{docker_images}"

a = os.WEXITSTATUS(os.system(f" {doc_img_output} | wc -l"))

docker_data(a)
#docker_ps = os.system("docker build .")