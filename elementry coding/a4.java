/* A4: prints second last digit (0..9). If number has <2 digits prints 0 */
#include <stdio.h>
#include <stdlib.h>
int main() {
    long long n;
    if (scanf("%lld", &n)!=1) return 0;
    long long x = llabs(n) / 10;
    int second_last = (int)(x % 10);
    printf("%d\n", second_last);
    return 0;
}
