import os

"""
Created by: Abhishek Sharma
data collection and run

"""
def docker_data(a, docker_images):
    if a == 0:
        print(docker_images)
    elif a == 1:
        b = os.system(f" {doc_img_output} | grep -i Exited")
    else:
        print("Container not created")

docker_images = os.system("docker ps -a | grep -i study")

doc_img_output = f"{docker_images}"

a = os.system(f" {doc_img_output} | wc -l")

docker_data(a, docker_images)

#docker_ps = os.system("docker build .")
