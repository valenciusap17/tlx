#include <iostream>
#include <array>
#include <string>
#include <iomanip>
#include <cstdio>
#include <vector>
#include <map>
#include <bits/stdc++.h>
using namespace std;

int arr[6];
int N;
bool check;
int banyakPertandingan;
pair <int, int> P[15];

void recursive(int current, int skorSementara[]) {

    if (current >= banyakPertandingan) {
        bool end = true;
        // cout << "Skor akhir: ";
        for (int i = 1; i <= N; i++) {
            // cout  << skorSementara[i] << " ";
            if (skorSementara[i] != arr[i]) end = false;
        }
        // cout << "\n";
        if (end == true) check = true;
        return;
    }

    int A = P[current].first;
    int B = P[current].second;

    // cout << "Skor sebelum: ";
    //     for (int i = 1; i <= N; i++) {
    //         cout  << skorSementara[i] << " ";
            
    //     }
    // cout << "\n";
    int skorBaru[N+1];
    


    //case 1: menang
    for (int i = 1; i <= N; i++ ) {
        skorBaru[i] = skorSementara[i];
    }
    skorBaru[A] += 3; 
    // cout << "Skor tengah: ";
    //     for (int i = 1; i <= N; i++) {
    //         cout  << skorBaru[i] << " ";
    //     }
    // cout << "\n";
    
    // cout << "Skor sesudah: ";
    //     for (int i = 1; i <= N; i++) {
    //         cout  << skorBaru[i] << " ";
            
    //     }
    // cout << "\n";
    recursive(current+1, skorBaru);
    // skorBaru[A] -=3;

    //case 3: kalah
    for (int i = 1; i <= N; i++ ) {
        skorBaru[i] = skorSementara[i];
    }
    skorBaru[B] += 3;
    recursive(current+1, skorBaru);
    // skorBaru[B] -= 3;

    //case 2: seri
    for (int i = 1; i <= N; i++ ) {
        skorBaru[i] = skorSementara[i];
        
    }
    skorBaru[A] += 1;
    skorBaru[B] += 1;
    recursive(current+1, skorBaru);
    // skorBaru[A] -=1;
    // skorBaru[B] -= 1;


}

int main() {
    int T;
    cin >> T;
    for (int i = 1; i <= T; i++) {
        check = false;
        cin >> N;
        for (int j = 1; j <= N; j++) {
            cin >> arr[j];
        }
        
        banyakPertandingan = 1;
        for (int j = 1; j <= N; j++ ) {
            for(int k = j+1; k <= N; k++) {
                P[banyakPertandingan] = {j,k};
                // cout << "nilai j dan k " << j << " " << k << "\n";
                banyakPertandingan++;
            }
        }
        int skorBaru[N+1];
        fill(skorBaru, skorBaru+N+1, 0);
        
        recursive(1,skorBaru);
        if (check) cout << "YES\n";
        else cout << "NO\n";
    }
    return 0;
}