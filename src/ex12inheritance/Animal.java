package ex12inheritance;  //★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★

public class Animal
{	
	private String species;
	public int age;
	public String gender;
	
	public Animal(String species, int age, String gender){
		
//		species = "강아지";  
		this.species = species;
		this.age = age;
		this.gender = gender;
	}
		
		
	public void showAnimal() {  // show 보여주기만 해서 return 값이 없는것. 그래서 void
		System.out.println("species= "+ species);
		System.out.println("age= " + age);
		System.out.println("gender= " + gender);
	}
	// getter method 간접호출 할 수 있게 도와주는 코드
	public String getSpecies() {
		return species;
	}
	
	
}

 
