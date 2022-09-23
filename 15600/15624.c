#include <stdio.h>

long long int n, arr[1000000] = {0, 1, };

int main() {
  for(int i = 2; i<=1000000; i++)
    arr[i] = (arr[i-1]+arr[i-2])%1000000007;
  scanf("%lld", &n);
  printf("%lld", arr[n]%1000000007);

  return 0;
}