#include <iostream>
#include <array>
#include <string>
#include <iomanip>
#include <cstdio>
#include <vector>
#include <map>
#include <bits/stdc++.h>
using namespace std;

int main() {
    long A, B;
    cin >> A >> B;
    long dp[B+1]= {0};
    long current;
    if (A / 1000000 > 0) {
        A = A%1000000;
    }
    dp[1] = A;
    bool more = false;
    for (long i = 2; i <= B; i++) {
        current = dp[i-1];
        long result = A * current;
        if (result / 1000000 > 0) {
            dp[i] = result%1000000;
            more = true;
        }
        else dp[i] = result;
    }
    string result = to_string(dp[B]);
    // cout << more;
    if (more) {
        if (result.length() != 6) {
            for(long i = 0; i < (6-result.length()); i++) {
                cout << "0";
            }
            cout << result;
        } else {
            cout << result;
        }
    } else {
        cout << result;
    }
    // return 0;
}