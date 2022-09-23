#include <stdio.h>

int main() {
  int n;
  double arr[50];
  char s[50][10];
  while(1){
    double max = -1.0;
    scanf("%d", &n);
    if(!n)
      return 0;
    for(int i = 0; i<n; i++){
      scanf("%s %lf", s[i], &arr[i]);
      if(arr[i] > max)
        max = arr[i];
    }
    for(int i = 0; i<n; i++)
      if(max == arr[i])
        printf("%s ", s[i]);
    printf("\n");
  }

  return 0;
}