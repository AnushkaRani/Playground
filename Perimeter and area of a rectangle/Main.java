#include <stdio.h> 
     

int main() {
  int length=6,breadth=9,area,perimeter;                

    perimeter = 2*(breadth + length);
	printf("The perimeter of the rectangle is: %d cm\n", perimeter);
	
	area = breadth * length;
	printf("The area of the rectangle is: %d sq cm\n", area);

return(0);
}