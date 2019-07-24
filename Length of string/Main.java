#include<stdio.h>
int main()
{
 char a[100];
  int length;
  gets(a);
 
  length = strlen(a);
 
  printf("%d\n", length);
  return 0;
}