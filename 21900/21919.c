#include <stdio.h>

int n, m, cnt = 0, arr[1000000] = {0, 1, };
long long int re = 1;

int main() {
  for(int i = 2; i*i<=1000000; i++)
    for(int j = 2; i*j<=1000000; j++)
      if(!arr[i])
        arr[i*j] = 1;
  scanf("%d", &n);
  for(int i = 0; i<n; i++){
    scanf("%d", &m);
    if(!arr[m])
      arr[m] = 2, cnt++;
  }
  for(int i = 2; i<=1000000; i++)
    if(arr[i] == 2)
      re*=(long long int)i;
  printf("%lld", cnt == 0 ? -1 : re);

  return 0;
}