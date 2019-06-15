#include<stdio.h>
#define PI 3.14
int main() 
{  
  float r, cir;
  scanf("%f", &r);
  cir = PI * r * r;
  printf("%0.2f", cir);
  return 0;
}