#include <stdio.h>

int gcd(int a, int b){
  if(b == 0)
    return a;
  return gcd(b, a%b);
}

int main() {
  int n, a[3], b[3];
  scanf("%d %d %d %d", &a[0], &b[0], &a[1], &b[1]);
  a[2] = a[0]*b[1]+a[1]*b[0], b[2] = b[0]*b[1], n = gcd(a[2], b[2]);
  printf("%d %d", a[2]/n, b[2]/n);

  return 0;
}