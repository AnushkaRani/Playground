#include <stdio.h>

int find_second_greatest(int no1, int no2, int no3);

int main() {
	//Get 3 numbers
	int no1, no2, no3;
	scanf("%d", &no1);
	scanf("%d", &no2);
	scanf("%d", &no3);
	//Call find_second_greatest. This function will return 2nd greatest number
	printf("second greatest = %d", find_second_greatest(no1, no2, no3));
	return 0;
}

int find_second_greatest(int no1, int no2, int no3)
{
    // Compare 3 numbers to find 2nd greatest
    if(no1 > no2 && no1 > no3) {
        return no2 > no3 ? no2 : no3;
    } else if(no2 > no3) {
        return no1 > no3 ? no1 : no3;
    } else {
        return no1 > no2 ? no1 : no2;
    }
}
