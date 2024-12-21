#!/usr/bin
#!/usr/sbin

#Created by: Abhishek Sharma
# Data filter


docker ps | grep -i "study_project" | awk -F" " '{print $1}' | cut -b 1-4 > tmp_data

var1=$(cat tmp_data)

docker rmi study
sleep 2
#docker rm -f "$var1"