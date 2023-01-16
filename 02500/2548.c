#include <stdio.h>
#include <stdlib.h>

int compare(const void *a, const void *b){
  return *(int*)a-*(int*)b;
}

int main() {
  int n, sum[20000] = {0, }, arr[20000] = {0, };
  scanf("%d", &n);
  for(int i = 0; i<n; i++)
    scanf("%d", &arr[i]);
  qsort(arr, n, sizeof(int), compare);
  for(int i = 0; i<n; i++)
    for(int j = 0; j<n; j++)
      sum[i] += arr[i]>arr[j] ? arr[i]-arr[j] : arr[j]-arr[i];
  int mn = 0, min = sum[0];
  for(int i = 1; i<n; i++)
    if(min > sum[i])
      min = sum[i], mn = i;
  printf("%d", arr[mn]);

  return 0;
}