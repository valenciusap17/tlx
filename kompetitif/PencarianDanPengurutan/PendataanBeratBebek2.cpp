#include <iostream>
#include <array>

using namespace std;

int main() {
    int a, b, decrement, lowerBound, upperBound;
    int left, right, indexLower, indexUpper;
    int upperMiddle , lowerMiddle;
    int found = -1;
    cin >> a;
    int arr [a] = {};
    for(int i = 0; i < a; i++) {
        cin >> arr[i]; 
    }
    cin >> b;
    for (int i = 0; i < b; i++) {
        cin >> lowerBound >> upperBound;
        // binary search for lowerbound
        left = 0;
        right = a;
        while (left <= right) {
            int middle = left + (right - left)/2;
            // cout << "ini aneh" << middle << "\n";
            if (arr[middle] == lowerBound) {
                // cout << "sini yak";
                indexLower = middle+1;
                lowerMiddle = middle;
                break;
            }

            
            if (arr[middle] < lowerBound) {
                left = middle+1;
                // cout << "cok" << "\n";
            }
            else if (arr[middle] > lowerBound) {
                right = middle-1;
                // cout << "anjeng" << "\n";
            }
            // cout << "left: " << left << "right: " << right << "\n";
            if (left >= right) {
                // cout << "middle: " << arr[middle] << "upperBound: " << lowerBound<< "\n";
                if (lowerBound < arr[middle] ) indexLower = middle ;
                else indexLower = middle+1;
            }
        }
        // cout << "lower index: " << indexLower;


        left = 0;
        right = a;
        while (left <= right) {
            int middle = left + (right - left)/2;
            // cout << "ini aneh" << middle << "\n";
            if (arr[middle] == upperBound) {
                // cout << "ini bener anjeng" << "\n";
                indexUpper = middle;
                upperMiddle = middle;
                break;
            }

            
            if (arr[middle] < upperBound) {
                left = middle+1;
                // cout << "cok" << "\n";
            }
            else if (arr[middle] > upperBound) {
                right = middle-1;
                // cout << "anjeng" << "\n";
            }
            // cout << "left: " << left << "right: " << right << "\n";
            if (left >= right) {
                // cout << "middle: " << arr[middle] << "upperBound: " << upperBound<< "\n";
                if (upperBound < arr[middle] ) {
                    indexUpper = middle-1;
                    // cout << "yakan";
                }
                else indexUpper = middle;
            }
        }
        // cout << "lower index :" << indexLower << "upper index: " << indexUpper;
        // cout << "\n";

        for (int i = 0; i < a; i++) {
            if (arr[i] == lowerBound || arr[i] == upperBound) {
                found = 1;
            }
        }

        if (upperMiddle == lowerMiddle) {
            if (found == 1) {
                found = -1;
                cout << 1 << "\n";
                // cout << upperMiddle << " jancuk " << lowerMiddle << "\n";
            } else {
                cout << 0 << "\n";
            }
        } else {
            cout << (indexUpper - indexLower + 1) << "\n";
        }

        // cout << leftFound << rightFound;
        // cout << "\n";
    }
}

