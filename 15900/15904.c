#include <stdio.h>
#include <string.h>

int main() {
  int n, cnt = 0;
  char s[1010];
	scanf("%[^\n]s", s), n = strlen(s);
  for(int i = 0; i<n; i++){
    switch(cnt){
      case 0:
        if(s[i] == 'U')
          cnt++;
        break;
      case 1:
        if(s[i] == 'C')
          cnt++;
        break;
      case 2:
        if(s[i] == 'P')
          cnt++;
        break;
      case 3:
        if(s[i] == 'C')
          cnt++;
        break;
    }
  }
  printf("%s", cnt==4 ? "I love UCPC" : "I hate UCPC");

  return 0;
}