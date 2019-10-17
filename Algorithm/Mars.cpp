#include <iostream>
using namespace std;

int main()
{
	int x,y,sx,sy,ex,ey,len;
	char d;
	string move;
	int m[x][y];
	cout<<"Enter the dimension of Array:";
	cin>>x>>y;
	cout<<"Enter the starting point:";
	cin>>sx>>sy;
	cout<<"Enter Direction:";
	cin>>d;
	cout<<"Enter M to move:";
	cin>>move;
	len=move.length();	
	
	if(sx>x || sy>y)
	{
		cout<<"Out of Range";
	}
	else
	{
		if(d=='n')
		{
			ey=sy-len;
			if(ey<0)
				cout<<"Out of Range";
			else
				cout<<sx<<ey<<d;
		}
		
		else if(d=='s')
		{
			ey=sy+len;
			if(ey>y)
				cout<<"Out of Range";
			else
				cout<<sx<<ey<<d;
		}
		
		else if(d=='w')
		{
			ex=sx-len;
			if(ex<0)
				cout<<"Out of Range";
			else
				cout<<ex<<sy<<d;
		}
		
		else if(d=='e')
		{
			ex=x+len;
			if(ex<0)
				cout<<"Out of Range";
			else
				cout<<ex<<sy<<d;
		}
	}
	return 0;
}
