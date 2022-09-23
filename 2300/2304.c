#include <stdio.h>

int main(){
  int n, l, h, result = 0, nani = -99, minn = 99999, max = -99999, maxn = -99999, longn = 0, arr[1010] = {0, };
  scanf("%d", &n);
  for(int i = 0; i<n; i++){
    scanf("%d %d", &l, &h);
    arr[l] = h;
    if(l < minn)//가장 앞
      minn = l;
    if(longn < l)//가장 뒤
      longn = l;
    if(arr[l] > max)//최대
      max = arr[l], maxn = l;
  }
  for(int i = minn; i<=maxn; i++){
    if(arr[i] > nani)
      nani = arr[i];
    result += nani;
  }
  nani = -99;
  for(int i = longn; i>maxn; i--){
    if(arr[i] > nani)
      nani = arr[i];
    result += nani;
  }
  printf("%d", result);

  return 0;
}