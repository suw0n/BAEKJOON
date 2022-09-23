#include <stdio.h>

long long int n, m, k, mid, sum, re = 0, arr[1000000];

void binary(int low, int high){
  while(low <= high){
    sum = 0, mid = (low+high)/2;
    for(int i = 0; i<n; i++)
      sum += arr[i]-mid > 0 ? arr[i]-mid : 0;
    if(sum >= k)
      re = mid, low = mid+1;
    else
      high = mid-1;
  }
}

int main() {
  scanf("%lld %lld", &n, &k);
  for(int i = 0; i<n; i++){
    scanf("%lld", &arr[i]);
    if(arr[i] > m)
      m = arr[i];
  }
  binary(0, m);
  printf("%lld", re);

  return 0;
}