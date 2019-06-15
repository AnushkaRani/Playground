#include<stdio.h>
int main()
{
char str1[100], str2[100], str3[100];
scanf("%s", str1);
scanf("%s", str2);
scanf("%s", str3);
for(int i = 0; str1[i] != '\0'; i++)
{
char ch = str1[i];
if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
 {
 str1[i] = '$';
}
 }
    for(int i = 0; str2[i] != '\0'; i++)
{
 char ch = str2[i];
 if(!(ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u'))
 {
 str2[i] = '#';
 }
}
for(int i = 0; str3[i] != '\0'; i++)
{
 if(str3[i] >= 'a' && str3[i] <= 'z')
 {
 str3[i] = 'A' + (str3[i] - 'a');
 }
 }
 	int idx = 0;
while(str1[idx++] != '\0');
 	idx--;
	int i;
	for(int i = 0; str2[i] != '\0'; i++)
	{
      str1[idx++] = str2[i];
	}
	for(int i = 0; str3[i] != '\0'; i++)
	{
      str1[idx++] = str3[i];
	}
str1[idx] = '\0';
printf("%s", str1);
return 0;
}