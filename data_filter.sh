#!/usr/bin
#!/usr/sbin

#Created by: Abhishek Sharma
# Data filter


docker ps | grep -i "study_project" | awk -F" " '{print $1}' | cut -b 1-4 > tmp_data.txt

var1=$(cat tmp_data)

docker rm -f "$var1"
sleep 2
docker rmi study
