#include<stdio.h>

int main(){
  int n, m, l = 0, min = 10000, re = 0, arr[10000] = {1, 1, };
  for(int i = 2; i*i<=10000; i++)
    for(int j = 2; i*j<=10000; j++)
        if(!arr[i*j])
          arr[i*j] = 1;
  scanf("%d %d", &n, &m);
  for(int z = n; z<=m; z++)
    if(!arr[z])
      min = z<min ? z : min, l = 1, re+=z;
  if(l)
    printf("%d\n%d", re, min);
  else
    printf("-1");

  return 0;
}