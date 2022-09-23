#include <stdio.h>
#include <stdlib.h>

int compare(const void *a, const void *b){
	return (*(int*)b - *(int*)a);
}

int main(){
  int n, arr[100000] = {0, };
  scanf("%d", &n);
  for(int i = 0; i<n; i++)
    scanf("%d", &arr[i]);
  qsort(arr, n, sizeof(int), compare);
  long long int re = 0;
  for(int i = 0; i<n; i++)
    re += arr[i]-i > 0 ? arr[i]-i : 0;
  printf("%lld", re);

  return 0;
}