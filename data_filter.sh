#!/usr/bin
#!/usr/sbin

#Created by: Abhishek Sharma
# Data filter


docker_img_name="study" #provide your docker image name


docker ps | grep -i "study_project" | awk -F" " '{print $1}' | cut -b 1-4 > tmp_data.txt

var1=$(cat tmp_data.txt)



var2=$(cat tmp_data.txt | wc -l)
if [ $var2 -eq 0 ];then
        echo "There is no process is running now"
else
        docker rm -f "$var1"
fi

sleep 2

var3=$(docker images | grep -i  "$docker_img_name" | wc -l)

if [ $var3 -eq 0 ];then
        echo "There is no Image for Remove"
else
        docker rmi study
        
fi
docker ps | grep -i "study_project" | awk -F" " '{print $1}' | cut -b 1-4 > tmp_data.txt

