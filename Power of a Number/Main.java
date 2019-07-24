#include <stdio.h>
int main()
{
   int b,e,i,pow=1;
    scanf("%d%d", &b,&e);
    if (e>=0)
    {
      for (i=1;i<=e;i++)
      {
        pow= pow*b;
      }
        printf("%d",pow);
    }
  else
  {
    printf("Wrong input");
  }
    return 0;
}
  
    
