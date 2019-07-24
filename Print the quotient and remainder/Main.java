#include<stdio.h>
int main()
{
  int d=4,n=365,q,r;
  q=n/d;
  r=n%d;
  printf("Quotient: %d\nRemainder: %d",q,r);
  return 0;
}