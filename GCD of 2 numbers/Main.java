// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int n1,n2,i,gcd;
  scanf("%d%d",&n1,&n2);
  gcd=n1>n2?n2:n1;
  for (i=gcd;i>=1;i--)
  {
    if(n1%i==0&&n2%i==0)
    {
      printf("%d",i);
      break;
    }
  }
  
   return 0;
}
  
  