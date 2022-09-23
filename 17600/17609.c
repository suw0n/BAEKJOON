#include <stdio.h>
#include <string.h>

char s[100010];

int main(){
  int t, n, m, j, cnt, kcnt;
  scanf("%d", &t);
  while(t--){
    cnt = 0, kcnt = 0;
    scanf("%s", s), n = strlen(s);
    j = 0, m = n-1;
    while(j<=n/2){
      if(s[j] != s[m])
        cnt++, j--;
      if(cnt > 1)
        break;
      j++, m--;
    }
    j = 0, m = n-1;
    while(m>=n/2){
      if(s[j] != s[m])
        kcnt++, m++;
      if(kcnt > 1)
        break;
      j++, m--;
    }
    printf("%d\n", cnt==0 ? 0 : cnt==1||kcnt==1 ? 1 : 2);
  }

  return 0;
}