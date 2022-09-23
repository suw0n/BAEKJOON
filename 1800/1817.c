#include <stdio.h>

int main(){
  int n, m, sum = 0, result = 1, arr[1010] = {0, };
  scanf("%d %d", &n, &m);
  for(int i = 0; i<n; i++)
    scanf("%d", &arr[i]);
  if(n == 0){
    printf("0");
    return 0;
  }
  for(int i = 0; i<n; i++){
    sum += arr[i];
    if(m < sum)
      sum = arr[i], result++;
  }
  printf("%d", result);

  return 0;
}