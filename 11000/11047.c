#include <stdio.h>

int main() {
  int n, k, re = 0, arr[10];
  scanf("%d %d", &n, &k);
  for(int i = 0; i<n; i++)
    scanf("%d", &arr[i]);
  while(k != 0){
    for(int i = n-1; i>=0; i--){
      if(k >= arr[i]){
        k-=arr[i], re++;
        break;
      }
    }
  }
  printf("%d", re);

  return 0;
}