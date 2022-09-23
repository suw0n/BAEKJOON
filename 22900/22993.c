#include <stdio.h>
#include <stdlib.h>

int compare(const void *a, const void *b){
  return *(int*)a > *(int*)b ? 1 : *(int*)a < *(int*)b ? -1 : 0;
}

int main() {
  int n, arr[100000];
  long long int m;
  scanf("%d\n%lld", &n, &m);
  for(int i = 0; i<n-1; i++)
    scanf("%d", &arr[i]);
  qsort(arr, n-1, 4, compare);
  for(int i = 0; i<n-1; i++){
    if(m <= arr[i]){
      printf("No");
      return 0;
    }
    else
      m+=arr[i];
  }
  printf("Yes");

  return 0;
}