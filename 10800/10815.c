#include <stdio.h>
#include <stdlib.h>

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
  int n, m, num, arr[500000];
  scanf("%d", &n);
  for(int i = 0; i<n; i++)
    scanf("%d", &arr[i]);
  qsort(arr, n, sizeof(int), compare);
  scanf("%d", &m);
  for(int i = 0; i<m; i++){
    scanf("%d", &num);
    printf("%d ", binary(arr, 0, n-1, num));
  }

  return 0;
}