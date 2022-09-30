#include <iostream>

using namespace std;

int main(){
  int n, m, sum = 0, result = 1, arr[1010] = {0, };
  cin >> n >> m;
  for(int i = 0; i<n; i++)
    cin >> arr[i];
  if(n == 0){
    cout << 0;
    return 0;
  }
  for(int i = 0; i<n; i++){
    sum += arr[i];
    if(m < sum)
      sum = arr[i], result++;
  }
  cout << result;
}