#include <stdio.h>
 
int main()
{
  int i, Num=26; 
   
  
  scanf("%d", &Num);
 

  for (i = 1; i <= Num; i++)
   {
     if(Num%i == 0)
        {
		 printf("%d \n", i);
    
		}
   }
 
  return 0;
}