#include <stdio.h>

int f(int a){
  for(int i = 2; i*i<=a; i++)
    if(a%i == 0)
      return 0;
  return a == 1 ? 0 : 1;
}

int main(){
  int t;
  scanf("%d", &t);
  int m = 0, arr[10000] = {0, };
  for(int i = 2; i<9974; i++)
    if(f(i))
      arr[m++] = i;
  while(t--){
    int n, gap = 99999, ri, rj;
    scanf("%d", &n);  
    for(int i = 0; arr[i]<=n/2; i++){
      for(int j = 0; arr[j]<n; j++){
        if(arr[i]+arr[j] == n){
          int l = arr[i] > arr[j] ? arr[i]-arr[j] : arr[j]-arr[i];
          if(gap > l)
            ri = arr[i]<arr[j] ? arr[i] : arr[j], rj = arr[i]+arr[j]-ri, gap = l;
        }
      }
    }
    printf("%d %d\n", ri, rj);
  }

  return 0;
}