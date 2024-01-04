#include <iostream>
#include <array>
#include <string>
#include <iomanip>
#include <cstdio>
#include <vector>
#include <map>
using namespace std;


int main() {
    int N;
    cin >> N >> N;
    int first[N][N];
    int second[N][N];
    for(int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            cin >> first[i][j];
        }
    }

    cin >> N >> N;
    for(int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            cin >> second[i][j];
        }
    }

    // check horizontal

    bool identic = true;
    bool vertical = true;
    bool horizontal = true;
    bool diagonalKanan = true;
    bool diagonalKiri = true;


    for(int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            if (first[i][j] != second[i][j]) identic = false;
            if (first[i][j] != second[i][N-1-j]) vertical = false;
            if (first[i][j] != second[N-1-i][j]) horizontal = false;
            if (first[i][j] != second[j][i]) diagonalKanan = false;
            if (first[i][j] != second[N-1-j][N-1-i]) diagonalKiri = false;
        }
    }    


    string result = "tidak identik";
    if (identic) result = "identik";
    else if (vertical) result = "vertikal";
    else if (horizontal) result = "horisontal";
    else if (diagonalKanan) result = "diagonal kanan bawah";
    else if (diagonalKiri) result = "diagonal kiri bawah";
    cout << result;
    return 0;
}