#include <stdio.h>

int n, m, arr[20000010] = {0, };//2000만 1(0포함)

int main() {
  scanf("%d", &n);
  for(int i = 0; i<n; i++){
    scanf("%d", &m);
    arr[m>0 ? m : m+20000001]++;//1000만 1부터 음수
  }
  scanf("%d", &n);
  for(int i = 0; i<n; i++){
    scanf("%d", &m);
    printf("%d ", arr[m>0 ? m : m+20000001]);
  }

  return 0;
}