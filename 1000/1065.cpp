#include <iostream>

using namespace std;

int main(){
  int n, m, a, b, c, re = 0;
  cin >> n;
  if(n < 100)
    cout << n;
  else if(n < 1000){
    for(int i = 100; i<=n; i++){
      m = i, a = m%10-m/10%10, b = m/10%10-m/100%10;
      if(a == b)
        re++;
    }
    cout << 99+re;
  }
  else
    cout << 144;
}