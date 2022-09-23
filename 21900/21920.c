#include <stdio.h>

int n, x, cnt = 0, arr[500000];
double re =  0;

int gcd(int a, int b){
  if(b == 0)
    return a;
  return gcd(b, a%b);
}

int main() {
  scanf("%d", &n);
  for(int i = 0; i<n; i++)
    scanf("%d", &arr[i]);
  scanf("%d", &x);
  for(int i = 0; i<n; i++)
    if(gcd(x, arr[i]) == 1)
      re += arr[i], cnt++;
  printf("%g", re/cnt);

  return 0;
}

