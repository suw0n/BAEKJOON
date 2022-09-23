#include <stdio.h>

struct person{
  char s[20];
  int d;
  int m;
  int y;
}typedef Person;

int main() {
  int n;
  Person p[100];
  scanf("%d", &n);
  for(int i = 0; i<n; i++)
    scanf("%s %d %d %d", p[i].s, &p[i].d, &p[i].m, &p[i].y);
  for(int i = 0; i<n; i++){
    for(int j = 0; j<n-i-1; j++){
      if(p[j].y > p[j+1].y){
          Person temp = p[j];
          p[j] = p[j+1];
          p[j+1] = temp; 
      }
      else if(p[j].y == p[j+1].y){//나이가 같은 경우
        if(p[j].m > p[j+1].m){
          Person temp = p[j];
          p[j] = p[j+1];
          p[j+1] = temp;
        }
        else if(p[j].m == p[j+1].m){//월이 같은 경우
          if(p[j].d > p[j].d){
            Person temp = p[j];
            p[j] = p[j+1];
            p[j+1] = temp;
          }
        }
      }
    }
  }
  printf("%s\n%s", p[n-1].s, p[0].s);

  return 0;
}