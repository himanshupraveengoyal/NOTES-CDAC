#include"CommonFunctions.h"
#include<objbase.h>
//Interface in C++ is a type def of struct which contains only pure virtual functions in it. All interfaces are abstract classes but all abstract classes are not interfaces as abstract classes can have normal methods..
interface ISimpleInterface
{
	virtual void SimpleFunc()=0;
};

interface IExampleInterface {
	virtual void ExampleFunc()=0;
};

//Class that implements both the interfaces...
class SimpleExample : public ISimpleInterface, public IExampleInterface {
public:
	void SimpleFunc() { cout << "Simple Func" << endl; }
	void ExampleFunc() { cout << "Example Func" << endl; }
};

void main() {
	IExampleInterface* pEx = new SimpleExample();
	pEx->ExampleFunc();

	ISimpleInterface* pSim = new SimpleExample;
	pSim->SimpleFunc();

}
