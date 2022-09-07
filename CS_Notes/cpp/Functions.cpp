#include<iostream>
#include<string>
using namespace std;
string func(int a,int &b)//& is used to pass a variable with reference
{
    string final ="";
    if(a==1)
    {
        final="1";
    }
    if(a==2)
    {
        final ="2";
    }
    if(a==4)
    {
        final ="4";
    }
    b +=1;
    return final;
}
void fn(int a)
{
    return;
}
int main()
{
    int hello=0;
    cout << func(2,hello)<<hello;//21
    //cout << fn(hello);//error line void functions should not be printed
}