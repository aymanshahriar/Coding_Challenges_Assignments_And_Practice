public class Animal {

	// instance variables
	private char type;
	private int age;
	private int health;


	// getters
	
	public char getType() {
		return this.type;
	}


	public int getAge() {
		return this.age;
	}

	public int getHealth() {
		return this.health;
	}

	// setters
	
	public void setType(char c) {
		if ((c =='m') || (c =='b') || (c =='f') || (c =='r') || (c =='a') || (c =='n')) {
			this.type = c;
		} else {
			this.type = 'n';
		}
	}

	public void setAge(int a) {
		if ((this.getType() == 'm') || (this.getType() == 'r')) {
			if ((a >= 0) && (a <= 100)) {
				this.age = a;
			}
		}
		else if ((this.getType() == 'b') || (this.getType() == 'f') || (this.getType() == 'a')){
                        if ((a >= 0) && (a <= 10)) {
                                this.age = a;
                        }
                }
		else if (this.getType() == 'n') {
			if ((a >= 0) && (a <= 2)) {
				this.age = a;
			}
		}


	}


	public void setHealth(int h) {
		if (h > 0) {
			this.health = h;
		} else {
			this.health = 50;
		}
	}


	// constructors
	
	public Animal(char t, int a, int h) {
		this.setType(t);
		this.setAge(a);
		this.setHealth(h);
	}


	// copy constructor
	
	public Animal(Animal a) {
		this.setType(a.getType());
                this.setAge(a.getAge());
                this.setHealth(a.getHealth());
	}

	// methods
	
	public double getRelativeHealth() {
		return this.health / (101.0 - this.age);
	}







}
