#include<stdio.h>

int main()
{
  long int bnum, onum = 0, j = 1, rem;
 
   
    scanf("%ld", &bnum);
    while (bnum != 0)
    {
        rem = bnum % 10;
        onum = onum + rem * j;
        j = j * 2;
        bnum = bnum / 10;
    }
    printf("%lo", onum);
}