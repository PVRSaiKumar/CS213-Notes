#include<iostream>
using namespace std;
struct arey
{
    int c;
    int &operator+(arey &a)     //if u don't use '&' before "operator", u will get lvalue operand error
    {
        return a.c;
    }
};
int main()
{
    arey a,b;a.c=8;b.c=9;
    a+b=17;
    cout << b.c;
    return 0;
}