#include <stdio.h>

int main() {
  int n, k, j, min, cnt, re, arr[1000] = {1, 1, 0};
  for(int i = 2; i*i<=1000; i++)
    for(int j = 2; i*j<=1000; j++)
      if(!arr[i*j])
        arr[i*j] = 1;
  scanf("%d %d", &n, &k);
  while(1){
    j = 1, min = 9999;
    for(int i = 2; i<=n; i++)
      if(!arr[i])
        min = i, i = 9999;
    while(min*j <= n){
      if(arr[min*j] != -1)
        re = min*j, arr[re] = -1, k--;
      j++;
      if(!k){
        printf("%d", re);
        return 0;
      }
    }
  }

  return 0;
}