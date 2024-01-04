#include <iostream>
#include <map>

using namespace std;

int main() {
    int a, b;
    string key, value, wanted, result;
    map<string, string> map;

    cin >> a >> b;
    for (int i = 0; i < a; i++) {
        cin >> key >> value;
        map[key] = value;
    }

    for (int i = 0; i < b; i++) {
        result = "";
        cin >> wanted;
        result = map[wanted];
        if (result == "") cout << "NIHIL" << "\n";
        else cout << result << "\n";
    }

    return 0;
}