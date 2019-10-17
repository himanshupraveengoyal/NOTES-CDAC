#include<iostream>
#include<cstring>
using namespace std;
int main()
{
	int k;
	string inp1="hello",inp2="ieh";
	int inp1l=inp1.length();
	int inp2l=inp2.length();
	char ninp1[inp1l],ninp2[inp2l],result[10][10]={'*'};
	
	strcpy(ninp1, inp1.c_str());
	strcpy(ninp2, inp2.c_str());
	
	for(int i=0;i<inp1l;i++)
	{
		for(int j=0;j<inp2l;j++)
		{
			if(ninp1[i]==ninp2[j])
			{
				k=i;
				break;
			}
		}
	}	
 
 cout<<"Matching Words:"<<ninp1[k]<<endl;


cout<<"Output:"<<endl;
for(int i=0;i<10;i++)
{
	for(int j=0;j<10;j++)
	{
		cout<<result[i][j];
		cout<<i<<j;
	}
	cout<<endl;
}
	
}
