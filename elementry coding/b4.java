/* B4: simple sieve-like check to find nth prime (n>=1). Not optimized for very large n. */
#include <stdio.h>
#include <math.h>

int isprime(long long x) {
    if (x <= 1) return 0;
    if (x <= 3) return 1;
    if (x % 2 == 0) return 0;
    for (long long i = 3; i*i <= x; i += 2)
        if (x % i == 0) return 0;
    return 1;
}

int main() {
    int n;
    if (scanf("%d", &n)!=1) return 0;
    if (n <= 0) { printf("0\n"); return 0; }
    int count = 0;
    long long candidate = 1;
    while (count < n) {
        candidate++;
        if (isprime(candidate)) count++;
    }
    printf("%lld\n", candidate);
    return 0;
}
