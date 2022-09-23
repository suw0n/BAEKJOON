#include <stdio.h>

int main(){
  int n, m, a, b, c, re = 0;
  scanf("%d", &n);
  if(n < 100)
    printf("%d", n);
  else if(n < 1000){
    for(int i = 100; i<=n; i++){
      m = i, a = m%10-m/10%10, b = m/10%10-m/100%10;
      if(a == b)
        re++;
    }
    printf("%d", 99+re);
  }
  else
    printf("%d", 144);

  return 0;
}