#include <iostream>
#include <array>
#include <string>
#include <iomanip>
#include <cstdio>
#include <vector>
#include <map>
#include <bits/stdc++.h>
using namespace std;

int M, N, current;

void recursive(int row, int column, vector<vector<int>>& arr, vector<vector<int>>& arrCheck, int wanted) {
    // cout << "current broder: " << current << "\n";
    if (row >= 0 && row < M && column >= 0 && column < N) {
        if (arr[row][column] == wanted && arrCheck[row][column] == 0) {
            current++;
            arrCheck[row][column] = 1;
            recursive(row-1, column, arr, arrCheck, wanted);
            recursive(row, column-1, arr, arrCheck, wanted);
            recursive(row+1, column, arr, arrCheck, wanted);
            recursive(row, column+1, arr, arrCheck, wanted);
        }
        
    }
}

int main() {
    cin >> M >> N;
    vector<vector<int>> arr(M, vector<int>(N));
    for (int i = 0; i < M; i++) {
        for (int j = 0; j < N; j++) {
            cin >> arr[i][j];
        }
    }

    int result = -1;
    vector<vector<int>> arrCheck(M, vector<int>(N,0));

    for (int i = 0; i < M; i++) {
        for (int j = 0; j < N; j++) {
            current = 0;
            fill(arrCheck.begin(), arrCheck.end(), vector<int>(N,0));
            // cout << "test: " << arr[i][j] << "\n";
            recursive(i, j, arr, arrCheck, arr[i][j]);
            // cout << "done: " << current << "\n";
            result = max(result, current);
        }
    }
    // cout << "hasil akhir: " << result;
    cout << result*(result-1);

    return 0;
}