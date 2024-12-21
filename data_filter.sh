#!/usr/bin
#!/usr/sbin

#Created by: Abhishek Sharma
# Data filter


docker ps | grep -i "study" | awk -F" " '{print $1}' > tmp_data

if [ `cat tmp_data | wc -l` -eq 0 ];then
        echo "There is no container found"
        
else

fi
