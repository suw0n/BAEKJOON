#include <iostream>

using namespace std;

int main() {
  long long int n, m, re;
  while(cin >> n){
    m = 1, re = 1;
    while(m%n)
      m = m%n*10+1, re++;
    cout << re << endl;
  }
}