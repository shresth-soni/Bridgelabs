public /* A3: prints last digit (non-negative 0..9) */
#include <stdio.h>
int main() {
    long long n;
    if (scanf("%lld", &n)!=1) return 0;
    int last = (int)(llabs(n) % 10);
    printf("%d\n", last);
    return 0;
}
 {
    
}
