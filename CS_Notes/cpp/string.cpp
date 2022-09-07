#include<iostream>
#include<string>
#include<cstdlib>
using namespace std;
int main()
{
    string a = to_string(12);       //int to string
    string b = "abcdab";
    int i = stoi(a);                //string to int
    int len1 = a.length();
    string c = a+b;                 //adding of strings
    int i2 = b.find("b");           //first character index
    string d = c.substr(1,4);       //second argument is length of string
    cout << d;
}