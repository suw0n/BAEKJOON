#include <stdio.h>

int Generator(int a){
  int sum = a;
  while(a != 0){
    sum += (a%10);
    a/=10;
  }
  return sum;
}

int main(){
  int check[15000] = {0, };
  for(int i = 1; i<=10000; i++)
    check[Generator(i)]++;
  for(int i = 1; i<=10000; i++)
    if(check[i] == 0)
      printf("%d\n", i);

  return 0;
}

