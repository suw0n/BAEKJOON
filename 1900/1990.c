#include <stdio.h>
#include <stdbool.h>

int a, b;
bool arr[9989899] = {1, 1, };

int f(int n){
  int i = 0, j, cnt = 0, s[15];
  while(n != 0)
    s[cnt++] = n%10, n/=10;
  j = cnt-1;
  while(i<j){
    if(s[i] != s[j])
      return 0;
    i++, j--;
  }
  return 1;
}

int main() {
  for(int i = 2; i*i<=9989899; i++)
    for(int j = 2; i*j<=9989899; j++)
      if(!arr[i*j])
        arr[i*j] = true;
  scanf("%d %d", &a, &b);
  for(int i = a; i<=(b>9989899 ? 9989899 : b); i++)
    if(f(i) && !arr[i])
      printf("%d\n", i);
  printf("-1");

  return 0;
}