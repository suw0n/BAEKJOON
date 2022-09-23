#include <stdio.h>

int main(){
  int n, p, newn, rankcnt = 1, arr[55] = {0, };
  scanf("%d %d %d", &n, &newn, &p);
  for(int i = 0; i<n; i++)
    scanf("%d", &arr[i]);
  for(int i = 0; i<n; i++)
    if(newn < arr[i])
      rankcnt++;
  if(arr[p-1] >= newn && n >= p)
    printf("-1");
  else if(rankcnt <= p)
    printf("%d", rankcnt);
  else
    printf("-1");

	return 0;
}