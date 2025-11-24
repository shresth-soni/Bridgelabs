/* B2: compute factorial using unsigned long long (watch overflow) */
#include <stdio.h>
#include <limits.h>
int main() {
    int n;
    if (scanf("%d", &n)!=1) return 0;
    if (n < 0) { printf("0\n"); return 0; } // undefined for negatives
    unsigned long long res = 1;
    for (int i = 2; i <= n; ++i) res *= (unsigned long long)i;
    printf("%llu\n", res);
    return 0;
}
