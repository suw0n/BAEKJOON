#include <stdio.h>

int t, k, arr[1299709] = {1, 1, };

int main() {
  for(int i = 2; i*i<=1299709; i++)
    for(int j = 2; i*j<=1299709; j++)
      if(!arr[i*j])
        arr[i*j] = 1;
  scanf("%d", &t);
  while(t--){
    scanf("%d", &k);
    if(!arr[k])
      printf("0\n");
    else{
      int low = 0, high = 0;
      for(int i = k+1; ; i++){
        if(!arr[i]){
          high = i;
          break;
        }
      }
      for(int i = k-1; ; i--){
        if(!arr[i]){
          low = i;
          break;
        }
      }
      printf("%d\n", high-low);
    }
  }

  return 0;
}