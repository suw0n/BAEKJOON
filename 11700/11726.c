#include <stdio.h>

int main(){
  int n, arr[1000] = {0, 1, 1};
  scanf("%d", &n), n++;
  for(int i = 2; i<=n; i++)
    arr[i] = (arr[i-1] + arr[i-2])%10007;
  printf("%d", arr[n]%10007);

  return 0;
}