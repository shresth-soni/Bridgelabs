/* A8: read 5 numbers, print count of odds */
#include <stdio.h>
int main() {
    long long x;
    int cnt = 0;
    for (int i = 0; i < 5; ++i) {
        if (scanf("%lld", &x)!=1) return 0;
        if (x % 2 != 0) cnt++;
    }
    printf("%d\n", cnt);
    return 0;
}
