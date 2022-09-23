#include <stdio.h>
#include <stdlib.h>

int compare(const void *a, const void *b){
  return *(int*)a > *(int*)b ? 1 : *(int*)a < *(int*)b ? -1 : 0;
}

int main() {
  int n, m, re = 0, arr[15000];
  scanf("%d\n%d", &n, &m);
  for(int i = 0; i<n; i++)
    scanf("%d", &arr[i]);
  qsort(arr, n, 4, compare);
  for(int i = 0; i<n-1; i++)
    for(int j = i+1; j<n; j++)
      if(arr[i]+arr[j]==m)
        re++;
  printf("%d", re);

  return 0;
}