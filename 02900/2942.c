#include <stdio.h>

int gcd(int a, int b){
  if(b == 0)
    return a;
  return gcd(b, a%b);
}

int main() {
  int r, g, n;
  scanf("%d %d", &r, &g);
  n = gcd(r, g);
  for(int i = 1; i<=n; i++)
    if(!(n%i))
      printf("%d %d %d\n", i, r/i, g/i);

  return 0;
}