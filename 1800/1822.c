#include <stdio.h>
#include <stdlib.h>

int n, m, cnt = 0, re[500000], a1[500000], a2[500000];

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
  scanf("%d %d", &n, &m);
  for(int i = 0; i<n; i++)
    scanf("%d", &a1[i]);
  qsort(a1, n, 4, compare);
  for(int i = 0; i<m; i++)
    scanf("%d", &a2[i]);
  qsort(a2, m, 4, compare);
  for(int i = 0; i<n; i++)
    if(!binary(a2, 0, m-1, a1[i]))
      re[cnt++] = a1[i];
  if(!cnt)
    printf("0");
  else{
    printf("%d\n", cnt);
    for(int i = 0; i<cnt; i++)
      printf("%d ", re[i]);
  }

  return 0;
}