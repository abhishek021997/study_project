!#/usr/bin
!#/usr/sbin

#Created by: Abhishek Sharma 
# docker id get

docker ps | grep -i "study_project" | awk -F" " '{print $1}' | cut -b 1-4 > ../tmp_data.txt
