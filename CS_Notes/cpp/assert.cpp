#include<iostream>
#define NDEBUG //to disable assert statements
#include<cassert>
using namespace std;
int main()
{
    int a=1;
    a++;
    assert(a==1);
    cout << 2 <<endl;
}