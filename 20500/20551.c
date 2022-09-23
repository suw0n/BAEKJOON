#include <stdio.h>
#include <stdlib.h>

int n, m, num, arr[200000];

int compare(const void *a, const void *b){
  return *(int*)a > *(int*)b ? 1 : *(int*)a < *(int*)b ? -1 : 0;
}

int lowerbound(int arr[], int low, int high, int re) {
    int cnt = 0;
    while(low < high) {
        int mid = (low + high) / 2;
        if(arr[mid] < re)
            low = mid + 1;
        else 
            high = mid;
        if(arr[mid] == re)
            cnt++;
    }
  return cnt==0 ? -1 : high;
}

int main() {
  scanf("%d %d", &n, &m);
  for(int i = 0; i<n; i++)
    scanf("%d", &arr[i]);
  qsort(arr, n, 4, compare);
  while(m--){
    scanf("%d", &num);
    printf("%d\n", lowerbound(arr, 0, n, num));
  }

  return 0;
}