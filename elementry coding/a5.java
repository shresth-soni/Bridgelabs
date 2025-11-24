/* A5: read two numbers, print sum of their last digits */
#include <stdio.h>
#include <stdlib.h>
int main() {
    long long a,b;
    if (scanf("%lld %lld", &a, &b)!=2) return 0;
    int la = (int)(llabs(a)%10);
    int lb = (int)(llabs(b)%10);
    printf("%d\n", la + lb);
    return 0;
}
