#include <stdio.h>

int main() {
  int a, b, n, mn = 0;
  scanf("%d %d %d", &a, &b, &n);
  for(int i = 0; i<=n; i++){
    if(a < b)
      a*=10, mn = 0;
    else{
      for(int i = 1; b*i<=a; i++)
        mn = i;
      a = 10*(a-b*mn);
    }
  }
  printf("%d", mn);

  return 0;
}