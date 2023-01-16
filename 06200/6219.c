#include <stdio.h>

int a, b, d, cnt, re = 0, arr[4000000] = {1, 1, };

int main() {
  for(int i = 2; i<=2000; i++)
    for(int j = 2; i*j<=4000000; j++)
      if(!arr[i*j])
        arr[i*j] = 1;
  scanf("%d %d %d", &a, &b, &d);
  for(int i = a; i<=b; i++){
    if(!arr[i]){
      int m = i, cnt = 0;
      while(m != 0){
        if(m%10 == d)
          re++, m = 0;
        m/=10;
      }
    }
  }
  printf("%d", re);

  return 0;
}