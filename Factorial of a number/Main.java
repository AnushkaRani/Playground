#include <stdio.h>
 
int main()
{
  int c, num=5, fact = 1;
 
  
  scanf("%d", &num);
 
  for (c = 1; c <= num; c++)
    fact = fact * c;
 
  printf("%d",fact);
 
  return 0;
}