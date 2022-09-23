#include <stdio.h>

int f(int n){
  if(n == 1)
    return 0;
  for(int i = 2; i*i<=n; i++)
    if(n%i == 0)
      return 0;
  return 1;
}

int main(){
  int n, re;
  while(1){
    scanf("%d", &n), re = 0;
    if(!n)
      return 0;
    for(int i = n+1; i<=2*n; i++)
      if(f(i))
        re++;
    printf("%d\n", re);
  }
  return 0;
}