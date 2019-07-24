#include<stdio.h>
#include<math.h>
int main()
{
  float hyp,ad,opp;
  scanf("%f%f",&ad,&opp);
  hyp=sqrt((ad*ad)+(opp*opp));
  printf("%.2f",hyp);
  
  return 0;
}