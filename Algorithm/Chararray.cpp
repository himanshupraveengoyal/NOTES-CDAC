#include<iostream>
using namespace std;
int halfvalue(int val)
{
	if(val%2==0)
	{
		val=val/2;
		return val;
	}
	else
	{
		val=(val+1)/2;
		return val;
	}
}
int main()
{
	int numberofinput, a, b, c, d, e, ah,bh,ch;
	cout << "Enter the size of array A:";
	cin >> a;
	cout << "Enter the size of array B:";
	cin>>b;
	cout << "Enter the size of array C:";
	cin>>c;
	cout << "Enter the size of array D:";
	cin>>d;
	char w[a], x[b], y[c], z[d],final[10][10]={' '};
	cout << "Enter elements for Array A"<<endl;
	for (int i = 0; i < a; i++)
		cin >> w[i];
		ah=halfvalue(a);
	cout << "Enter elements for Array B"<<endl;
	for (int i = 0; i < b; i++)
		cin >> x[i];
		bh=halfvalue(b);
	cout << "Enter elements for Array C"<<endl;
	for (int i = 0; i < c; i++)
		cin >> y[i];
		ch=halfvalue(c);
	cout << "Enter elements for Array D"<<endl;
	for (int i = 0; i < d; i++)
		cin >> z[i];
	cout<<"Output:"<<endl;	
	for(int i=0;i<a;i++)
	{
		final[i][0]=w[i];
	}
	for(int i=0;i<b;i++)
	{
		final[ah-1][i+1]=x[i];
	}
	for(int i=0;i<c;i++)
	{
		final[i+bh-1][bh]=y[i];
	}
	for(int i=0;i<d;i++)
	{
		final[bh][ch+i+bh-1]=z[i];
	}

	for(int i=0;i<10;i++)
	{
		for(int j=0;j<10;j++)
		{
			cout<<final[i][j];
		}
		cout<<"\n";
	}
}
