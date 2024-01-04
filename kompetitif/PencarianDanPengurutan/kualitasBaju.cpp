#include <iostream>
#include <array>
#include <bits/stdc++.h>
#include <string>
#include <iomanip>
#include <cstdio>
using namespace std;

int arr[100001];


int partition(int left, int right) {
    int pivot = arr[right];
    int pointer = left-1;
    for (int i = left; i <= right; i++) {
        if (arr[i] < pivot) {
            pointer++;
            int temp = arr[pointer];
            arr[pointer] = arr[i];
            arr[i] = temp;
        }
    }
    int temp2 = arr[pointer+1];
    arr[pointer+1] = arr[right];
    arr[right] = temp2;
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

    int N;
    int l = 0;
    cin >> N;
    for (int i = 1; i <= N; i++) {
        cin >> arr[i];
        l++;
    }
    // for (int i = 1; i <= l; i++) {
    //     cout << arr[i];
    // }
    // cout << "\n";
    quicksort(1, l);
    // cout << "\n";
    // for (int i = 1; i <= l; i++) {
    //     cout << arr[i];
    // }
    // cout << "\n";

    if (N%2 == 0) {
        int first = arr[N/2];
        int second = arr[N/2+1];
        double median = ((first+0.0) + (second+0.0))/2;
        printf("%.1f \n", median);
    } else {
        int index = N/2+1;
        double median = arr[index];
        printf("%.1f \n", median);
    }
}
