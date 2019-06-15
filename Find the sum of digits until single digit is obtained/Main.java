int sumofdigits(int n);
void main()
{
    int num;
   scanf("%d",&num);
    int sod = num;
   while(sod>=10)  /*this will keep repeatedly add the digits until the single 
                     digit (which will be less than 10) is left*/ 
   {
   	sod = sumofdigits(sod);
    }
    printf("%d", sod);
}
int sumofdigits(int n)
{
    int rem, sum=0;
    while(n != 0)
    {
            rem = n%10;
            sum = sum+rem;
            n=n/10;
      }
     return sum;
}