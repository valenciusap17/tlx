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

void recursion(int row, int column, vector<vector<int>>& arr, vector<vector<int>>& arrCheck, int wanted) {
    if (row >= 0 && row < M && column >= 0 && column < N ) {
        if (arrCheck[row][column] == 0 && arr[row][column] == wanted) {
            current++;
            arrCheck[row][column] = 1;
            recursion(row-1, column, arr, arrCheck, wanted);
            recursion(row, column-1, arr, arrCheck, wanted);
            recursion(row+1, column, arr, arrCheck, wanted);
            recursion(row, column+1, arr, arrCheck, wanted);
        }
    }

}

vector<vector<int>> bruteForce(int row, int column, vector<vector<int>>& arr, vector<vector<int>>& arrCheck, int wanted) {
    if (row >= 0 && row < M && column >= 0 && column < N ) {
        // cout << "hai: " << arrCheck[row][column] << "\n";
        if (arrCheck[row][column] == 0 && arr[row][column] == wanted) {
            arr[row][column] = 0;
            // cout << "hello";
            // int point = 1;
            // bool check = true;
            // while (row-point >= 0 && arr[row-point][column] != 0) {
            //     arr[row-point+1][column] = arr[row-point][column];
            //     arr[row-point][column] = 0;
            //     point++;
            // }
            // cout << "gamasuk";
            arrCheck[row][column] = 1;
            bruteForce(row-1, column, arr, arrCheck, wanted);
            bruteForce(row, column-1, arr, arrCheck, wanted);
            bruteForce(row+1, column, arr, arrCheck, wanted);
            bruteForce(row, column+1, arr, arrCheck, wanted);
        }
    }
    return arr;
}

int main() {
    cin >> M >> N;
    vector<vector<int>> arr(M, vector<int>(N));
    for (int i = 0; i < M; i++) {
        for (int j = 0; j < N; j++) {
            cin >> arr[i][j];
        }
    }

    vector<vector<int>> check(M, vector<int>(N));
    pair<int, vector<int>> result = {0,{0,0}};
    // cout << "testing yak: " << result.first << " " << result.second[0] << " " << result.second[1] << "\n"; 
    for (int i = 0; i < M; i++) {
        for (int j = 0; j < N; j++) {
            current = 0;
            fill(check.begin(), check.end(), vector<int>(N,0));
            recursion(i, j, arr, check, arr[i][j]);
            // cout << "nilai current: " << current << "\n";
            // cout << current << " banding: " << result.first << "\n";
            if (result.first < current) {
                // cout << "pernah masuk sini ga\n";
                result.first = current;
                result.second = {i,j};
            }
        }
    }
    // int wanted = arr[result.second[0]][result.second[1]];
    // cout << "test: " << result.second[0] << " " << result.second[1] << "\n";
    int first = result.second[0];
    int second = result.second[1];
    fill(check.begin(), check.end(), vector<int>(N,0));
    vector<vector<int>> may = bruteForce(first, second, arr, check, arr[first][second]);
    // cout << "\n";
    for (int i = 0; i < M; i++) {
        for (int j = 0; j < N; j++) {
            int point = 1;
            bool check = true;
            // cout << may[i][j];
            if (may[i][j] == 0) {
                while (i-point >= 0 && may[i-point][j] != 0) {
                    may[i-point+1][j] = may[i-point][j];
                    may[i-point][j] = 0;
                    point++;
                }
            }
        }
        // cout << "\n";
    }
    for (int i = 0; i < M; i++) {
        for (int j = 0; j < N; j++) {
            if (may[i][j] == 0) cout << ". ";
            else cout << may[i][j] << " ";
        }
        cout << "\n";
    }
    
}