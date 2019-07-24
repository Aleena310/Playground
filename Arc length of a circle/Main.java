#include<stdio.h>
int main()
{
  float r,theta,len;
  scanf("%f%f",&r,&theta);
  len=(theta/360)*2*3.14*r;
  printf("%.2f",len);
  return 0;
}