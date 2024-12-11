#include <iostream>
using namespace std;

long long fibonacci(int n) {
    if (n <= 1)
        return n;
    else
        return(fibonacci(n-1) + fibonacci(n-2));
}

int main() {
    cout << "Fibonacci numbers up to 10,000 in C++:" << endl;
    for (int i = 0; i < 10000; i++) {
        if (fibonacci(i) < 10000) {
            cout << fibonacci(i) << endl;
        }
    }
    return 0;
}