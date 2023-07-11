#include <stdio.h>

int main() {
    int x1, v1, x2, v2, n;
    scanf("%d %d %d %d", &x1, &v1, &x2, &v2);
    
    if(x1>x2 && v2>v1)
    {
        n = ((x1 - x2)%(v2 - v1));
      
        if(n == 0)
        {
            printf("YES");
        }
        else
        {
            printf("NO");
        }
    }
    
    else if(x2>x1 && v1>v2)
    {
        n = ((x2 - x1)%(v1 - v2));
        
        if(n == 0)
        {
            printf("YES");
        }
        else
        {
            printf("NO");
        }
    }
    
    else
    {
        printf("NO");
    }

    return 0;
}
