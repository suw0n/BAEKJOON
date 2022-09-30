#include <iostream>

using namespace std;

int n, arr[1003001] = {1, 1, };

int f(int n){
  int i = 0, j, cnt = 0, s[10];
  while(n != 0)
    s[cnt++] = n%10, n/=10;
  j = cnt-1;
  while(i<j){
    if(s[i] != s[j])
      return 0;
    i++, j--;
  }
  return 1;
}

int main() {
  for(int i = 2; i<=1002; i++)
    for(int j = 2; i*j<=1003001; j++)
      if(!arr[i*j])
        arr[i*j] = 1;
  cin >> n;
  for(int i = n; i<=1003001; i++)
    if(!arr[i] && f(i))
      cout << i, i = 1003002;
}