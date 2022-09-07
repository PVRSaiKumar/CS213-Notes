#include<iostream>
using namespace std;
class trial
{
    public:
    int a;
    char b;
    bool c;
    public:
//There can be many constructors for a structure.
//But those constructors should be different in number of arguments, 
//if same atleast they should not have same data types of arguments in the same order.
    trial(int dum1)
    {
        a =1;
        b='2';
        c=0;
    }
    trial(int dum1)
    {
        a =2;
        b='2';
        c=0;
    }
    void fn(int a)
    {
        this->a = a;
        return;
    }
    trial operator+(trial& dum) //operator overloading
//Operator’s precedence doesn’t change if we overload
//operator is very similar to member function
    {
        this->a += dum.a;
        this->b += dum.b;
        this->c += dum.c;
        return *this;
    }
    ~trial()
    {
        cout <<"I am Destructor\n"; 
    }
};
int main()
{
    trial a(1),b(1),c(1);
    a = b+c;
    a.fn(3);
    cout << b.a<<a.a<<" "<<b.b <<a.b;
}