//Constant members Functions are functions defined in a class with a const modifier. The purpose is to make the function not to change the state of the object. The main idea of the const functions is not to allow them to modify the object on which they are called. This would avoid accidental modifications on the objects. 
#include"CommonFunctions.h"

class TestClass {
	int score;
public:
	TestClass(int score) { this->score = score; }
	int getValue() const {//This function does not allow any modifications...
		//score += 123;//Compile Error as the function does not allow to modify the object
		return score; 
	}
	//This is a function that will change the data of the object....
	void setNewValue(int value) {
		score = value;
	}
};
void main() {
	TestClass math(78);
	math.setNewValue(89);
	cout<<"Score:"<<math.getValue()<<endl;

	//Even objects can be made as Const...
	const TestClass science(80);//The const object does not allow to access any function that is modifiable...
	//science.setNewValue(88);
	cout << "Score: " << science.getValue() << endl;
}
