#include <stdio.h>

long long int gcd(long long int a, long long int b){
  return b == 0 ? a : gcd(b, a%b);
}

int main() {
  long long int a, b;
  scanf("%lld %lld", &a, &b);
  for(int i = gcd(a, b); i>0; i--)
    printf("1");

  return 0;
}