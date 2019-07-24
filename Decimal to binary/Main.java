#include<stdio.h>
int main()
{
  int num,n, c, k=0,place=1;
scanf("%d", &num);
 
n=num;
 
 while(n>0)
 {
   c=n%2;
   k+=c*place;
   place*=10;
  n /=2;
 }
   printf("%d",k);
  return 0;

}