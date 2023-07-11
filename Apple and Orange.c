#include <stdio.h>

int main(){
    int s, t, a, b, m, n, app[1000000], ora[1000000], i, orange=0, apple=0;
    scanf("%d %d", &s, &t);
    scanf("%d %d", &a, &b);
    scanf("%d %d", &m, &n); 
    for(i=0; i<m; i++)
    {
        scanf("%d", &app[i]);
    }
    for(i=0; i<n; i++)
    {
        scanf("%d", &ora[i]);
    }
    
    for(i=0; i<m; i++)
    {
        app[i]=app[i]+a;
    }
    for(i=0; i<n; i++)
    {
        ora[i]=ora[i]+b;
    }
    for(i=0; i<m; i++)
    {
        if(app[i]>=s && app[i]<=t)
        {
            apple = apple + 1;
        }
    }
    for(i=0; i<n; i++)
    {
        if(ora[i]>=s && ora[i]<=t)
        {
            orange = orange + 1;
        }
    }
    printf("%d\n%d",apple ,orange );
    
    return 0;
    
}
