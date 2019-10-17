#include"CommonFunctions.h"

class Person {
public:
	virtual void Speak() {
		cout << "Person is speaking" << endl;
	}
};


class Engineer : public Person {
private:
	string skillSet;
	//All the members of the Person are available to Engineer also....
public:
	void Skill(string skill) {
		skillSet = skill;
		cout << "The Engineer's skillset is " << skillSet << endl;
	}

	void Speak() {
		cout << "The Engineer speaks about " << skillSet << endl;
	}
};

//First Version.....................
//Person* createPerson(string kind) {
//	if (kind == "Engineer")
//		return new Engineer();
//	else
//		return new Person;
//}
//2nd version.............
Person* createPerson(string kind) {
	if (kind == "Engineer") {
		Person* p = new Engineer();
		string skill = getString("Please enter UR skill");
		((Engineer*)p)->Skill(skill);
		return p;
	}
	else
		return new Person;
}
void main() {
/*****************First example**********************************
	Person* p = new Person();
	p->Speak();

	p = new Engineer();//Runtime polymorphism
	((Engineer*)p)->Skill("Computer Science");//Calling the derived func....
	p->Speak();//Calling the overriden func.....
	********************Using Factory method to get the objct*******/
	Person* p = createPerson("Engineer");
	//((Engineer*)p)->Skill("Computer Science");For second version, comment this...
	p->Speak();
}
