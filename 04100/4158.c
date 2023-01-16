#include <stdio.h>

int n, m, num, re, arr[1000000];

int binary(int arr[], int low, int high, int re){
  while(low<=high){
    int mid = (low+high)/2;
    if(re == arr[mid])
      return 1;
    else if(re > arr[mid])
      low = mid+1;
    else
      high = mid-1;
  }
  return 0;
}

int main() {
  while(1){
    scanf("%d %d", &n, &m), re = 0;
    if(!(n+m))
      return 0;
    for(int i = 0; i<n; i++)
      scanf("%d", &arr[i]);
    for(int i = 0; i<m; i++){
      scanf("%d", &num);
      if(binary(arr, 0, n-1, num))
        re++;
    }
    printf("%d\n", re); 
  }

  return 0;
}