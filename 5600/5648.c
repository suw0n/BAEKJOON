#include <stdio.h>
#include <stdlib.h>

int compare(const void *a, const void *b){
  return *(long long int*)a > *(long long int*)b ? 1 : *(long long int*)a < *(long long int*)b ? -1 : 0;
}

long long int reverse(long long int a){
  long long int re = 0;
  while(a != 0)
    re = re*10 + a%10, a/=10;
  return re;
}

int main(){
  int n;
  long long int arr[100000] = {0, };
  scanf("%lld", &n);
  for(int i = 0; i<n; i++)
    scanf("%lld", &arr[i]), arr[i] = reverse(arr[i]);
  qsort(arr, n, 8, compare);
  for(int i = 0; i<n; i++)
    printf("%lld\n", arr[i]);

  return 0;
}