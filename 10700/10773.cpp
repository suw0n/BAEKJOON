#include <iostream>
#include <stack>

using namespace std;

int main() {
  stack <int> s;
  int n, m, re = 0;
  std:: cin >> n;
  while(n--){
    std:: cin >> m;
    if(m != 0)
      s.push(m);
    else
      s.pop();
  }
  for(int i = s.size(); i>0; i--)
    re += s.top(), s.pop();
  std:: cout << re;
}