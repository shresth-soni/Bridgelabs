/* A2: print 1 if odd, 0 otherwise */
#include <stdio.h>
int main() {
    long long n;
    if (scanf("%lld", &n)!=1) return 0;
    printf("%d\n", (n % 2 != 0) ? 1 : 0);
    return 0;
}
