#include <stdio.h>

int main(){
  int mn, max, sum = 0, cnt = 0, count[5] = {0, }, arr[8] = {0, };
  for(int i = 0; i<8; i++)
    scanf("%d", &arr[i]);
  for(int i = 0; i<5; i++){
    max = arr[0], mn = 0;
    for(int j = 0; j<8; j++)
      if(max < arr[j])
        max = arr[j], mn = j;
    sum += max, count[cnt++] = mn+1, arr[mn] = -999;
  }
  for(int i = 0; i<5; i++){
    for(int j = 0; j<5-i-1; j++){
      if(count[j] > count[j+1]){
        int temp = count[j];
        count[j] = count[j+1];
        count[j+1] = temp;
      }
    }
  }
  printf("%d\n", sum);
  for(int i = 0; i<5; i++)
    printf("%d ", count[i]);

  return 0;
}