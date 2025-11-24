/* A6: prints 1 if N is exact multiple of M, else 0. If M==0 prints 0. */
#include <stdio.h>
int main() {
    long long n,m;
    if (scanf("%lld %lld", &n, &m)!=2) return 0;
    if (m == 0) { printf("0\n"); return 0; }
    printf("%d\n", (n % m == 0) ? 1 : 0);
    return 0;
}
