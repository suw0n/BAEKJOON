#include <stdio.h>

int main(){
  int t;
  long long int n, m;
  scanf("%d", &t);
  while(t--){
    scanf("%lld", &n), m = sqrt(n);
    printf("%d ", m*m==n ? 1 : 0);
  }

  return 0;
}