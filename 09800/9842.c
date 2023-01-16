#include <stdio.h>

int k, cnt = 0, arr[104729] = {0, 1, };

int main() {
  scanf("%d", &k);
  for(int i = 2; i<=324; i++)
    if(arr[i] == 0)
      for(int j = 2; i*j<=104729; j++)
        arr[i*j] = 1;
  for(int i = 1; k != cnt; i++){
    if(!arr[i]){
      cnt++;
      if(k == cnt)
        printf("%d", i);
    }
  }

  return 0;
}