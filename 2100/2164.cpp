#include <iostream>
#include <queue>

using namespace std;

int main() {
  queue <int> q;
  int n;
  std::cin >> n;
  for(int i = 1; i<=n; i++)
    q.push(i);
  while(q.size() != 1){
    q.pop();
    q.push(q.front());
    q.pop();
  }
  std::cout << q.front();
}