#include <stdio.h>
#include <stdlib.h>

int compare(const void *a, const void *b){
  return *(int*)a > *(int*)b ? 1 : *(int*)a < *(int*)b ? -1 : 0;
}

int main(){
  int n, m, arr[10000] = {0, };
  scanf("%d %d", &n, &m);
  for(int i = 0; i<n; i++)
    scanf("%d", &arr[i]);
  qsort(arr, n, 4, compare);
  for(int i = 0; i<n; i++)
    if(m >= arr[i])
      m++;
  printf("%d", m);

  return 0;
}