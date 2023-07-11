#include <stdio.h>

int main() {
    int n, arr[1000], d, m, i, j, sum=0, ini=0, count=0;
    scanf("%d", &n);
    for(i=0; i<n; i++)
    {
        scanf("%d", &arr[i]);
    }
    scanf("%d %d", &d, &m);
    
    while(ini < n)
    {
        for(i=ini; i<ini+m; i++)
        {
            sum = sum + arr[i];
        }
        if(sum == d)
        {
            count++;
        }
        sum = 0;
        ini++;
    }
    printf("%d", count);

    return 0;
}
