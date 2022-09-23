#include <stdio.h>
#include <stdlib.h>

int t, n, m, o, arr[1000000];

int compare(const void *a, const void *b){
  return *(int*)a > *(int*)b ? 1 : *(int*)a < *(int*)b ? -1 : 0;
}

int binary(int arr[], int low, int high, int re){
  int mid;
  while(low <= high){
    mid = (low+high)/2;
    if(re == arr[mid])
      return 1;
    else if(re < arr[mid])
      high = mid-1;
    else
      low = mid+1;
  }
  return 0;
}

int main() {
  scanf("%d", &t);
  for(int i = 0; i<t; i++){
    scanf("%d", &n);
    for(int i = 0; i<n; i++)
      scanf("%d", &arr[i]);
    qsort(arr, n, 4, compare);
    scanf("%d", &m);
    for(int i = 0; i<m; i++){
      scanf("%d", &o);
      printf("%d\n", binary(arr, 0, n-1, o));
    }
  }

  return 0;
}