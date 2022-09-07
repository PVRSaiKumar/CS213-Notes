#include<iostream>
#include<fstream>
#include<string>
using namespace std;
int main()
{
    ifstream f;
    ofstream g,h;
    g.open("text_file.txt",std::ios_base::app);
    //if u don't write std::ios_base::app, then all the data in that file will be 
    //erased and then it will add the strings u will add from this cpp file
    f.open("text_file.txt");
    h.open("text_file1.txt");
    string s;
    while(!f.eof())
    {
        f >> s;
        cout << s;
        g << s;
        h << s;
    }
}