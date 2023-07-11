#include <stdio.h>

int main() {
    int n, p, front, back, i, num=0;
    scanf("%d", &n);
    scanf("%d", &p);
    
    front = p / 2;
    
    if(n%2 == 0)
    {
        n=n+1;
        back = (n-p)/2;
    }
    
    else
    {
        back = (n-p)/2;
    }
    
    if(back > front)
    {
        printf("%d", front);
    }
    else
    {
        printf("%d", back);
    }

    return 0;
}
