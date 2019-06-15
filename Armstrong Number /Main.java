#include<stdio.h>  
 int main()    
{    
int num=153,r,sum=0,temp;    
   
scanf("%d",&num);    
temp=num;    
while(num>0)    
{    
r=num%10;    
sum=sum+(r*r*r);    
num=num/10;    
}    
if(temp==sum)    
printf("Armstrong Number ");    
else    
printf("Not an Armstrong Number");    
return 0;  
}   