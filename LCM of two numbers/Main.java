

#include <stdio.h>

int main()
{
    int i, n1, n2, max, lcm=1;
    scanf("%d%d", &n1, &n2);
    max = (n1 > n2) ? n1 : n2;
    i = max;
    while(1)
    {
        if(i%n1==0 && i%n2==0)
        {
          
            lcm = i;
            break;
        }
        i += max;
    }
   printf("%d",  lcm);
    return 0;
}