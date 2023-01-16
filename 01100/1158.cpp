#include <iostream>
#include <queue>

using namespace std;

int main() {
    int n, k;
    queue <int> a;
    cin >> n >> k;
    for(int i = 1; i<=n; i++)
        a.push(i);
    cout << "<";
    while(!a.empty()){
        for(int i = 1; i<k; i++){
            a.push(a.front());
            a.pop();
        }
        cout << a.front();
        a.pop();
        if(a.size())
            cout << ", ";
    }
    cout << ">";
}