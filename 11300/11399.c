#include <stdio.h>
#include <stdlib.h>

int compare(const void *a, const void *b){
  return *(int*)a > *(int*)b ? 1 : *(int*)a < *(int*)b ? -1 : 0;
}

int main() {
  int n, sum = 0, re = 0, arr[1000];
  scanf("%d", &n);
  for(int i = 0; i<n; i++)
    scanf("%d", &arr[i]);
  qsort(arr, n, 4, compare);
  for(int i = 0; i<n; i++)
    sum+=arr[i], re += sum;
  printf("%d", re);

  return 0;
}