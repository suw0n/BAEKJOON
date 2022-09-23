#include <stdio.h>

int prime(unsigned int n){
  if(n < 2)
    return 0;
  for(int i = 2; i*i<=n; i++)
    if(n%i == 0)
      return 0;
  return 1;
}

int main() {
  unsigned int t, n;
  scanf("%u", &t);
  while(t--){
    scanf("%u", &n);
    if(prime(n))
      printf("%u\n", n);
    else{
      for(int i = n+1; ; i++){
        if(prime(i)){
          printf("%u\n", i);
          break;
        }
      }
    }
  }

  return 0;
}