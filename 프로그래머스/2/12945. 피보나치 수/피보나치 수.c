#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    if(n == 0) return 0;
    if(n == 1) return 1;

    int f1 = 0;
    int f2 = 1;
    int answer = 0;

    for (int i = 2; i <= n; i++) {
        answer = (f1 + f2) % 1234567;
        f1 = f2;
        f2 = answer;
    }

    return answer;
}
