/* A9: read 5 numbers, print: <even_count> <odd_count> */
#include <stdio.h>
int main() {
    long long x;
    int even=0, odd=0;
    for (int i = 0; i < 5; ++i) {
        if (scanf("%lld", &x)!=1) return 0;
        if (x % 2 == 0) even++; else odd++;
    }
    printf("%d %d\n", even, odd);
    return 0;
}
