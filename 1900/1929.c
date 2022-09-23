#include <stdio.h>

int a, b, arr[1000000] = {1, 1, };

int main() {
  for(int i = 2; i*i<=1000000; i++)
    for(int j = 2; i*j<=1000000; j++)
      if(!arr[i*j])
        arr[i*j] = 1;
  scanf("%d %d", &a, &b);
  for(int i = a; i<=b; i++)
    if(!arr[i])
      printf("%d\n", i);
  
  return 0;
}