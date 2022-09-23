#include <stdio.h>

int main(){
  int n, k, arr[35][35] = {1, };
  for(int i = 1; i<=30; i++)
	arr[i][1] = 1, arr[i][i] = 1;
  for(int i = 3; i<=30; i++)
	for(int j = 2; j<=i; j++)
	  arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
  scanf("%d %d", &n, &k);
  printf("%d", arr[n][k]);

  return 0;
}