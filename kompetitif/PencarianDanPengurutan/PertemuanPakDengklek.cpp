#include <iostream>
#include <array>
#include <bits/stdc++.h>
using namespace std;



int main() {
    int iter;
    string arr[500];
    cin >> iter;
    int min = 11;
    for(int i = 0; i < iter; i++) {
        cin >> arr[i];
        if (arr[i].length() < min) min = arr[i].length();
    }
    // for (int i = 0; i < iter; i++) cout << arr[i] << "\n";

    sort(arr+0, arr+iter);
    int counter = 0;
    while (counter < iter) {
        for(int i = 0; i < iter; i++) {
            if (arr[i].length() == min) {
                cout << arr[i] << "\n";
                counter++;
            }
        }
        min++;
    }
    // for (int i = 0; i < iter; i++) cout << arr[i] << "\n";

}