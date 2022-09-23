#include <stdio.h>
#include <stdlib.h>

int n, arr[1000000];

int compare(const void *a, const void *b){
  return *(int*)a > *(int*)b ? 1 : *(int*)a < *(int*)b ? -1 : 0;
}

int main() {
  scanf("%d", &n);
  for(int i = 0; i<n; i++)
    scanf("%d", &arr[i]);
  qsort(arr, n, 4, compare);
  for(int i = 0; i<n; i++)
    printf("%d\n", arr[i]);

  return 0;
}