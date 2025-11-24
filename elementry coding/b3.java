/* B3: prints nth Fibonacci (0-indexed: F0=0, F1=1). For large n values may overflow. */
#include <stdio.h>
int main() {
    int n;
    if (scanf("%d", &n)!=1) return 0;
    if (n <= 0) { printf("0\n"); return 0; }
    if (n == 1) { printf("1\n"); return 0; }
    unsigned long long a = 0, b = 1;
    for (int i = 2; i <= n; ++i) {
        unsigned long long c = a + b;
        a = b; b = c;
    }
    printf("%llu\n", b);
    return 0;
}
