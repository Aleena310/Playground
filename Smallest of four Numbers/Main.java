#include<stdio.h>

int main( )
{
int a,b,c,d,small;
scanf("%d",&a);
scanf("%d",&b);
scanf("%d",&c);
scanf("%d",&d);
small=(a<b)?(a<c)?(a<d)?a:d:(c<d)?c:d:(b<c)?(b<d)?b:d:(c<d)?c:d;
printf(" %d",small);
  return 0;
}
