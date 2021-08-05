import java.util.ArrayList;
public class Zoo {

	// instance variables
	
	String name;
	ArrayList<Animal> animalList = new ArrayList<Animal>();


	// getters
	
	public String getName() {
		return this.name;
	}

	public ArrayList<Animal> getAnimalList() {
		ArrayList<Animal> copyList = new ArrayList<Animal>();
		for (Animal eachAnimal : animalList) {
			Animal copyAnimal = new Animal(eachAnimal);
			copyList.add(copyAnimal);
		}
		return copyList;
	}


	// no setters
	

	// constructors
	
	public Zoo(String n) {
		this.name = n;
	}

	// methods
	
	public void addAnimal(Animal a) {
		Animal copyAnimal = new Animal(a);
		this.animalList.add(copyAnimal);
	}

	public Animal healthiestAnimal() {
		if (animalList.isEmpty()) {
			return null;
		}

		else {
			ArrayList<Animal> copyList = this.getAnimalList();
			for (int i = 0; i <= copyList.size(); i++) {
				for (int j = 0; j < (copyList.size() - 1); j++) {
					if (copyList.get(j).getHealth() < copyList.get(j+1).getHealth()) {
						Animal copyAnimal = new Animal(copyList.get(j+1));
						copyList.remove(j+1);
						copyList.add(j, copyAnimal);
					}
				}
			}
			return copyList.get(0);
		}
	
	}

	public Animal oldestForType(char c) {
		if (animalList.isEmpty()) {
                        return null;
		}
		else if ((c =='m') || (c =='b') || (c =='f') || (c =='r') || (c =='a') || (c =='n')) {
			ArrayList<Animal> copyList = this.getAnimalList();
			ArrayList<Animal> secondList = new ArrayList<Animal>();
                        for (int i = 0; i < copyList.size(); i++) {
				if (copyList.get(i).getType() == c) {
					secondList.add(copyList.get(i));
				}
			}

			for (int i = 0; i <= secondList.size(); i++) {
                                for (int j = 0; j < (secondList.size() - 1); j++) {
                                        if (secondList.get(j).getAge() < secondList.get(j+1).getAge()) {
                                                Animal copyAnimal = new Animal(secondList.get(j+1));
                                                secondList.remove(j+1);
                                                secondList.add(j, copyAnimal);
                                        }
                                }
                        }
			if (!secondList.isEmpty()) {
				return secondList.get(0);
			} else return null;


				
		}
		else {
			return null;
		}




	}












}
