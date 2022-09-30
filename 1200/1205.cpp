#include <iostream>

using namespace std;

int main(){
  int n, p, newn, rankcnt = 1, arr[55] = {0, };
  cin >> n >> newn >> p;
  for(int i = 0; i<n; i++)
    cin >> arr[i];
  for(int i = 0; i<n; i++)
    if(newn < arr[i])
      rankcnt++;
  if(arr[p-1] >= newn && n >= p)
    cout << -1;
  else if(rankcnt <= p)
    cout << rankcnt;
  else
    cout << -1;
}