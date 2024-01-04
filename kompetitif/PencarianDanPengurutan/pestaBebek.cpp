#include <iostream>
#include <array>
#include <bits/stdc++.h>
#include <string>
using namespace std;

string arr[1001];

int selectionSort(int l) {
    int result = l;
    for (int i = l; i > 1; i--) {
        // cout << "banyak: " << l << "sekarang" << i << "\n";
        // cout << arr[i-1] << "banding" << arr[i] << "\n";
        if (arr[i-1] < arr[i] ) {
            // cout << "hai";
            return i;
        }
        string current = arr[i];
        arr[i] = arr[i-1];
        arr[i-1] = current;
        result = i-1;
    }
    return result;
}

int main() {
    string name;
    int l, N, result;
    cin >> N;
    for (int i = 1; i <= N; i++) {
        cin >> name;
        arr[i] = name;
        l++;
        cout << selectionSort(l) << "\n";
    }

    // for (int i = 1; i <= l; i++) {
    //     cout << "ini ngab:  " << arr[i] << "\n";
    // }
    return 0;
}
