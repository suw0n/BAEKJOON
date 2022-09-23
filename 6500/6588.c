#include <stdio.h>

int n, arr[1000000] = {1, 1, };

int main() {
  for(int i = 2; i*i<=1000000; i++)
    for(int j = 2; i*j<=1000000; j++)
      if(!arr[i*j])
        arr[i*j] = 1;
  while(1){
    scanf("%d", &n);
    if(n == 0)
      return 0;
    int x = 0, y = 0;
    int j = n-2;
    for(int i = 2; i<=n/2; i++, j--)
      if(arr[i]+arr[j] == 0 && i+j == n)
        x = i, y = j, i = n;
    printf("%d = %d + %d\n", n, x, y);
  }

  return 0;
}