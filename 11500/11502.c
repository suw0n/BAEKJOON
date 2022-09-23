#include <stdio.h>

int main() {
  int t, n, arr[1000] = {1, 1, };
  for(int i = 2; i*i<=1000; i++)
    for(int j = 2; i*j<=1000; j++)
      if(!arr[i*j])
        arr[i*j] = 1;
  scanf("%d", &t);
  while(t--){
    scanf("%d", &n);
    for(int i = 2; i<=n; i++)
      for(int j = 2; j<=n; j++)
        for(int k = 2; k<=n; k++)
          if(arr[i]+arr[j]+arr[k] == 0 && n == i+j+k)
            printf("%d %d %d\n", i, j, k), i = n+1;
  }

  return 0;
}