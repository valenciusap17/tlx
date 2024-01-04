#include <iostream>
#include <array>

using namespace std;

int a, b, lowerBound, upperBound;
int arr[100005];

int binser(int x) {
    int left = 0; int right = a;
    while ( left < right) {
        int middle = (left + right) / 2;
        // cout << "\n" << "middle: " << middle  << " left: " << left  << " right: " << right<< "\n";
        if (arr[middle+1] <= x) left = middle + 1;
        else right = middle;
    }
    // cout << "hasilnya yang di return: " << left << "\n"; 
    return left;
}

int main() {
    cin >> a;
    for(int i = 1; i <= a; i++) {
        cin >> arr[i]; 
    }
    cin >> b;
    for (int i = 1; i <= b; i++) {
        cin >> lowerBound >> upperBound;
        int lower = binser(lowerBound);
        int upper = binser(upperBound);
        cout << upper - lower << "\n";
    }
    return 0;
}

