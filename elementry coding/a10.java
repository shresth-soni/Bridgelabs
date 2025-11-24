/* B1: prints 1 if prime, else 0. Handles n<=1 -> 0. */
#include <stdio.h>
#include <math.h>
int main() {
    long long n;
    if (scanf("%lld", &n)!=1) return 0;
    if (n <= 1) { printf("0\n"); return 0; }
    if (n <= 3) { printf("1\n"); return 0; }
    if (n % 2 == 0) { printf("0\n"); return 0; }
    for (long long i = 3; i*i <= n; i += 2) {
        if (n % i == 0) { printf("0\n"); return 0; }
    }
    printf("1\n");
    return 0;
}
