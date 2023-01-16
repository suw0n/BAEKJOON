#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int n, max = 0, mode = 0, marr[8010] = {0, }, arr[500000] = {0, };
double sum = 0;

int compare(const void *a, const void *b){
  return *(int*)a > *(int*)b ? 1 : *(int*)a < *(int*)b ? -1 : 0;
}

int main() {
  scanf("%d", &n);
  for(int i = 0; i<n; i++)
    scanf("%d", &arr[i]), sum += arr[i], marr[arr[i]+4000]++;
  qsort(arr, n, 4, compare);
  for(int i = 0; i<8001; i++)
    if(max < marr[i])
      max = marr[i], mode = i-4000;
  for(int i = 0; i<8001; i++)
    if(mode+4000 != i && max == marr[i])
      mode = i-4000, i = 9999;
  printf("%d\n%d\n%d\n%d", (int)round(sum/n), arr[n/2], mode, arr[n-1]-arr[0]);

  return 0;
}