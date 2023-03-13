#include <iostream>
#include <string>

using namespace std;

string compressString(string s) {
    string compressed = "";
    char currChar = s[0];
    int currFreq = 1;

    for (int i = 1; i < s.length(); i++) {
        if (s[i] == currChar) {
            currFreq++;
        } else {
            compressed += currChar;
            if (currFreq < 10) {
                compressed += to_string(currFreq);
            } else {
                compressed += to_string(currFreq / 10) + to_string(currFreq % 10);
            }
            currChar = s[i];
            currFreq = 1;
        }
    }

    // Add the last character
    compressed += currChar;
    if (currFreq < 10) {
        compressed += to_string(currFreq);
    } else {
        compressed += to_string(currFreq / 10) + to_string(currFreq % 10);
    }

    if (compressed.length() < s.length()) {
        return compressed;
    } else {
        return s;
    }
}

int main() {
    string s;
    cin >> s;

    cout << compressString(s) << endl;

    return 0;
}
