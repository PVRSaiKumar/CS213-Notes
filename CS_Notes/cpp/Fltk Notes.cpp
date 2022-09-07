#include<FL/Fl.H>
#include<FL/Fl_Window.H>
#include<FL/Fl_Box.H>
#include<FL/Fl_Button.H>
#include<FL/fl_draw.H>
class mydrawing : public Fl_Widget
{
    public:
    mydrawing(int a,int b,int c,int d):Fl_Widget(a,b,c,d)
    {
    }
    void draw()
    {
        fl_color(7);
        fl_circle(100,100,100);
        fl_pie(0,0,200,200,0,270);
//x,y are coordinates of top left corner of rectangle circumscribing circle, width, height
        fl_arc(400,400,100,100,0,360);
//x,y are coordinates of top left corner of rectangle circumscribing circle, width, height
        fl_rectf(150,0,100,100);
        fl_rect(0,150,100,100);
    }
    int handle(int a)
    {
        if(a==FL_DRAG)
        {        
        }
        redraw();//which calls draw() function
        return 1;//should return 1 if u are using that in this widget, else 0
    }
};
int main(int argc,char* argv[])
{
    Fl_Window w(500,500,"Fltk");
    mydrawing m(0,0,500,500);
    Fl_Button a(0,0,100,100,"okay");//can't use draw fn of FL_Widget object
    w.show();
    return Fl::run();
}