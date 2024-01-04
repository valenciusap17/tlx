#include <iostream>
#include <array>
#include <bits/stdc++.h>
#include <string>
#include <iomanip>
#include <cstdio>
#include <vector>
#include <map>
using namespace std;

int weight[1001];
double cost[1001];

int partition(int left, int right) {
    double pivot = cost[right];
    int pointer = left-1;
    for (int i = left; i <= right; i++) {
        if (cost[i] < pivot) {
            pointer++;
            double temp = cost[pointer];
            cost[pointer] = cost[i];
            cost[i] = temp;
            double temp3 = weight[pointer];
            weight[pointer] = weight[i];
            weight[i] = temp3;
        }
    }
    double temp2 = cost[pointer+1];
    cost[pointer+1] = cost[right];
    cost[right] = temp2;
    double temp4 = weight[pointer+1];
    weight[pointer+1] = weight[right];
    weight[right] = temp4;
    return pointer+1;
}

void quicksort(int left, int right) {
    if (left < right) {
        int pivot = partition(left, right);
        quicksort(left, pivot-1);
        quicksort(pivot+1, right);
    }
}

int main() {
    int N, X;
    int l = 0;
    cin >> N >> X;
    for (int i = 1; i <= N; i++) {
        cin >> weight[i];
        l++;
    }
    for (int i = 1; i <= N; i++) {
        int total = 0;
        cin >> total;
        double operation = (total+0.0) / (weight[i]+0.0);
        cost[i] = operation;
        // cout << "cost: "<< cost[i] << "\n";
    }

    quicksort(1,l);
    // for (int i = 1; i <= l; i++) {
    //     cout  << "hasil: " << cost[i] << "\n";
    // }
    // for (int i = l; i >= 1; i--) {
    //     cout  << "hasil: " << cost[i] << "\n";
    // }
    double result = 0;
    for (int i = l; i >= 1; i--) {
        // int sum = weight[i];
        double curr = cost[i];
        // cout  << "curr: " << cost[i] << "\n";
        int sum = weight[i];
        if (X == 0) break;
        if (sum <= X) {
            // cout << "result sebelum: " << result << "\n";
            result += ((sum + 0.0) * curr);
            // cout << "result sesudah: " << result << "\n";
            X -= sum;
        } else {
            result += ((X+0.0) * curr);
            X = 0;
        }
    }
    printf("%.5f", result);

    return 0;
}