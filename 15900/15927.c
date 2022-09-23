#include <stdio.h>
#include <string.h>

int main(){
  int n, j, count = 0;
  char c, s[500010];
  scanf("%s", s);
  c = s[0], n = strlen(s);
  for(int i = 0; i<n; i++){
    if(c == s[i])
      count++;
    else
      break;
  }
  if(count == n){
    printf("-1");
    return 0;
  }
  count = 0, j = n-1;
  for(int i = 0; i<=n/2; i++){
    if(s[i] != s[j]){
      printf("%d", n);
      return 0;
    }
    j--;
  }
  printf("%d", n-1);

  return 0;
}