#include<iostream>
using namespace std;
int main()
{
    for(int i=0;i<10;i++)
    {
        cout << i;
    }
    //int a =i;//out of scope error similarly for while loop
    int b=1;int c=0;
    while(b=0)//we can change values of variables here too
    {
        if(c>10)
        {
            break;
        }
        if(c==1)
        {
            c+=1;
            continue;
        }
        cout << c;
        c+=1;
    }
    cout << b;//prints 0
}
/*Out of Scope Error:
    while(int b=0)
    {
        if(c>10)
        {
            break;
        }
        if(c==1)
        {
            c+=1;
            continue;
        }
        cout << c;
        c+=1;
    }
    cout << b;