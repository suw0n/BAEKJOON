#include<stdio.h>

int main() {
  int n;
  int result = -1;
  scanf("%d", &n);
  for (int i = 0; i <= 1000; i++)
    for (int j = 0; j <= 1000; j++)
      if ((i * 5) + (j * 3) == n) 
        result = i + j;
  printf("%d", result);

  return 0;
}