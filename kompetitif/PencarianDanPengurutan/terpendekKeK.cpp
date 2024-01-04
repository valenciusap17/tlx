#include <iostream>
#include <array>
#include <bits/stdc++.h>
#include <string>
#include <iomanip>
#include <cstdio>
#include <vector>
#include <map>
using namespace std;

int arr[1001];

int partition(int left, int right) {
    int pivot = arr[right];
    int pointer = left-1;
    for (int i = left; i <= right; i++) {
        if (arr[i] < pivot) {
            pointer++;
            int temp = arr[i];
            arr[i] = arr[pointer];
            arr[pointer] = temp;
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
        quicksort(left,pivot-1);
        quicksort(pivot+1, right);
    }
}

int main() {
    int N, K;
    cin >> N >> K;
    int l = 0;
    for (int i = 1; i <= N; i++) {
        cin >> arr[i];
        l++;
    }

    quicksort(1,l);
    cout << arr[K];
    return 0;

}