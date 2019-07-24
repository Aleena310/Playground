#include<stdio.h>
int main()
{
  long dnum, rem, q;
    int oNum[100], i = 1, j;
 
    
    scanf("%ld", &dnum);
    q = dnum;
    while (q != 0)
    {
        oNum[i++] = q % 8;
        q = q/ 8;
    }
  
    for (j = i - 1; j > 0; j--)
        printf("%d", oNum[j]);
  return 0;
}