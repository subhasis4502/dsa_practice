#include <iostream>

using namespace std;

void display(int *arr, int size){
    for (int i: arr)
    {
        cout << arr[i] << " ";
    }
    
}

int main()
{
    int arr[10] = {};
    display(arr, 10);
}