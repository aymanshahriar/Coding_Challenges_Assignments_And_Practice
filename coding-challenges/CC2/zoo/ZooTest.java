import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ZooTest {
	@Test
	public void test_ConstructorAndGetter() {
		Zoo c = new Zoo("Test Constructor and Getter");
		assertEquals("Testing constructor and getter", "Test Constructor and Getter", c.getName());
	}
	
	@Test
	public void test_addAnimal_addingOne() {
		Zoo c = new Zoo("Test");
		Animal m = new Animal('m',2,35);
		c.addAnimal(m);
		ArrayList<Animal> list = c.getAnimalList();
		Animal m2 = null;
		
		if (list.size() > 0){
			m2 = list.get(0);
		}
		
		
		assertEquals("Zoo only has one Animal ('m',2,35) - testing size.", 1, list.size());
		assertEquals("Zoo only has one Animal ('m',2,35) - testing type.", 'm', m2.getType());
		assertEquals("Zoo only has one Animal ('m',2,35)- testing age.", 2, m2.getAge());
		assertEquals("Zoo only has one Animal ('m',2,35)- testing health.", 35, m2.getHealth());
	}

	@Test
	public void test_addAnimal_addingMany() {
		Zoo c = new Zoo("Test");
		Animal m1 = new Animal('m',100,51);
		Animal m2 = new Animal('r',5,20000);
		Animal m3 = new Animal('b',6,4);
		Animal m4 = new Animal('f',0,2000);
		Animal m5 = new Animal('a',1,2001);
		Animal m6 = new Animal('n',2,49);
		c.addAnimal(m1);
		c.addAnimal(m2);
		c.addAnimal(m3);
		c.addAnimal(m4);
		c.addAnimal(m5);
		c.addAnimal(m6);
		
		ArrayList<Animal> list = c.getAnimalList();
		
		assertEquals("Expected list of size 6 after adding 6 Animals", 6, list.size());			
		assertEquals("Animal 1 test - testing Type", 'm', list.get(0).getType());
		assertEquals("Animal 2 test - testing Type", 'r', list.get(1).getType());
		assertEquals("Animal 3 test - testing Type", 'b', list.get(2).getType());
		assertEquals("Animal 4 test - testing Type", 'f', list.get(3).getType());
		assertEquals("Animal 5 test - testing Type", 'a', list.get(4).getType());
		assertEquals("Animal 6 test - testing Type", 'n', list.get(5).getType());
	}

	@Test
	public void test_addAnimal_addingOne_EncapsulationTest() {
		Zoo c = new Zoo("Test");
		Animal m = new Animal('m',41,1);
		c.addAnimal(m);
		m.setType('b');
		ArrayList<Animal> list = c.getAnimalList();
		Animal m2 = null;
		
		if (list.size() > 0){
			m2 = list.get(0);
		}
		
		assertEquals("Zoo only has one Animal ('m',41,1)- testing encapsulation (changed Type of original).", 'm', m2.getType());
		
	}
	
	@Test
	public void test_getAnimalList_Encapsulation() {
		Zoo c = new Zoo("Test");
		Animal m1 = new Animal('m',100,51);
		Animal m2 = new Animal('r',5,20000);
		Animal m3 = new Animal('b',6,4);
		Animal m4 = new Animal('f',0,2000);
		Animal m5 = new Animal('a',1,2001);
		Animal m6 = new Animal('n',2,49);
		c.addAnimal(m1);
		c.addAnimal(m2);
		c.addAnimal(m3);
		c.addAnimal(m4);
		c.addAnimal(m5);
		c.addAnimal(m6);
		
		ArrayList<Animal> list = c.getAnimalList();
		
		list.get(0).setType('a');
		list.get(1).setType('a');
		list.get(2).setType('a');
		list.get(3).setType('a');
		list.get(4).setType('f');
		list.get(5).setType('f');
		
		list = c.getAnimalList();
		
		
		assertEquals("Animal 1 test - testing Type", 'm', list.get(0).getType());
		assertEquals("Animal 2 test - testing Type", 'r', list.get(1).getType());
		assertEquals("Animal 3 test - testing Type", 'b', list.get(2).getType());
		assertEquals("Animal 4 test - testing Type", 'f', list.get(3).getType());
		assertEquals("Animal 5 test - testing Type", 'a', list.get(4).getType());
		assertEquals("Animal 6 test - testing Type", 'n', list.get(5).getType());
	}


	@Test
	public void test_healthiestAnimal_emptyList() {
		Zoo c = new Zoo("test");
		assertEquals("Empty list has no Animals with highest health.", null, c.healthiestAnimal());
	}
	
	@Test
	public void test_healthiestAnimal_ListHasOneAnimals() {
		Animal c = new Animal('n',1,10);
		c.setHealth(20);
		c.setAge(2);
		c.setType('f');
		Zoo z = new Zoo("test");
		z.addAnimal(c);
		
		Animal healthiest = z.healthiestAnimal();
		assertEquals("List has one animal - testing type", 'f', healthiest.getType());
		assertEquals("List has one animal - testing age", 2, healthiest.getAge());
		assertEquals("List has one animal - testing health", 20, healthiest.getHealth());
	}

	@Test
	public void test_healthiestAnimal_encapsulation() {
		Animal c = new Animal('n',1,10);
		Zoo z = new Zoo("test");
		z.addAnimal(c);
		
		Animal healthiest = z.healthiestAnimal();
		
		healthiest.setType('m');
		
		healthiest = z.healthiestAnimal();
		
		assertEquals("Changed type of healthiest from 'n' to 'm', should not have changed list", 'n', healthiest.getType());
	}

	@Test
	public void test_healthiestAnimal_ListHasManyAnimals_FirstIsHealthiest() {
		Zoo z = new Zoo("test");
		Animal a1 = new Animal('m',40,20000);
		Animal a2 = new Animal('n',0,100);
		Animal a3 = new Animal('b',1,5);
		Animal a4 = new Animal('r',6,2000);
		Animal a5 = new Animal('m',50,2001);
		
		z.addAnimal(a1);
		z.addAnimal(a2);
		z.addAnimal(a3);
		z.addAnimal(a4);
		z.addAnimal(a5);
		
		Animal healthiest = z.healthiestAnimal();
		assertEquals("List has many animals, first is healthiest - testing Type.", 'm', healthiest.getType());
		assertEquals("List has many animals, first is healthiest - testing age.", 40, healthiest.getAge());
		assertEquals("List has many animals, first is healthiest - testing health.", 20000, healthiest.getHealth());
	}

	@Test
	public void test_healthiestAnimal_ListHasManyAnimals_LastIsHealthiest() {
		Zoo z = new Zoo("test");
		Animal a1 = new Animal('m',40,200);
		Animal a2 = new Animal('n',0,100);
		Animal a3 = new Animal('b',1,5);
		Animal a4 = new Animal('r',6,2000);
		Animal a5 = new Animal('m',50,2001);
		
		z.addAnimal(a1);
		z.addAnimal(a2);
		z.addAnimal(a3);
		z.addAnimal(a4);
		z.addAnimal(a5);
		
		Animal healthiest = z.healthiestAnimal();
		assertEquals("List has many animals, last is healthiest - testing Type.", 'm', healthiest.getType());
		assertEquals("List has many animals, last is healthiest - testing age.", 50, healthiest.getAge());
		assertEquals("List has many animals, last is healthiest - testing health.", 2001, healthiest.getHealth());
	}

	@Test
	public void test_healthiestAnimal_ListHasManyAnimals_TwoAreEquallyHealthiest() {
		Zoo z = new Zoo("test");
		Animal a1 = new Animal('m',40,20);
		Animal a2 = new Animal('n',1,1000);
		Animal a3 = new Animal('b',1,5);
		Animal a4 = new Animal('r',51,500);
		Animal a5 = new Animal('m',50,201);
		
		z.addAnimal(a1);
		z.addAnimal(a2);
		z.addAnimal(a3);
		z.addAnimal(a4);
		z.addAnimal(a5);
		
		Animal healthiest = z.healthiestAnimal();
		assertEquals("List has many animals, two equally healthiest, expecting first found returned - testing Type.", 'n', healthiest.getType());
		assertEquals("List has many animals, last is healthiest - testing age.", 1, healthiest.getAge());
		assertEquals("List has many animals, last is healthiest - testing health.", 1000, healthiest.getHealth());
	}

	@Test
	public void test_oldestAnimalPerType_emptyList() {
		Zoo z = new Zoo("test");
		assertEquals("Empty list has no animals.", null, z.oldestForType('m'));
	}
	
	@Test
	public void test_oldestAnimalPerType_typeNotInList() {
		Zoo z = new Zoo("test");
		Animal a1 = new Animal('m',40,20);
		Animal a2 = new Animal('n',1,1000);
		Animal a3 = new Animal('b',1,5);
		Animal a4 = new Animal('r',51,500);
		Animal a5 = new Animal('m',50,201);
		
		z.addAnimal(a1);
		z.addAnimal(a2);
		z.addAnimal(a3);
		z.addAnimal(a4);
		z.addAnimal(a5);
		
		assertEquals("List does not have animal of specified type.", null, z.oldestForType('f'));
	}
	
	@Test
	public void test_oldestAnimalPerClass_OneOfTypeInList() {
		Zoo z = new Zoo("test");
		Animal a1 = new Animal('m',40,20);
		Animal a2 = new Animal('n',1,1000);
		Animal a3 = new Animal('f',1,5);
		Animal a4 = new Animal('r',51,500);
		Animal a5 = new Animal('m',50,201);
		
		z.addAnimal(a1);
		z.addAnimal(a2);
		z.addAnimal(a3);
		z.addAnimal(a4);
		z.addAnimal(a5);
		
		Animal oldest = z.oldestForType('f');
		assertEquals("List has many animals, only one of specified type.", 'f', oldest.getType());
		assertEquals("List has many animals, only one of specified type.", 1, oldest.getAge());
		assertEquals("List has many animals, only one of specified type.", 5, oldest.getHealth());
	}

	@Test
	public void test_oldestAnimalPerClass_ManyOfTypeInList() {
		Zoo z = new Zoo("test");
		Animal a1 = new Animal('m',40,20);
		Animal a2 = new Animal('n',1,1000);
		Animal a3 = new Animal('f',1,5);
		Animal a4 = new Animal('r',51,500);
		Animal a5 = new Animal('m',50,201);
		Animal a6 = new Animal('m',14,250);
		
		z.addAnimal(a1);
		z.addAnimal(a2);
		z.addAnimal(a3);
		z.addAnimal(a4);
		z.addAnimal(a5);
		z.addAnimal(a6);
		
		Animal oldest = z.oldestForType('m');
		assertEquals("List has many animals, only one of specified type.", 'm', oldest.getType());
		assertEquals("List has many animals, only one of specified type.", 50, oldest.getAge());
		assertEquals("List has many animals, only one of specified type.", 201, oldest.getHealth());
	}
	
	@Test
	public void test_oldestByType_encapsulation() {
		Animal c = new Animal('n',1,10);
		Zoo z = new Zoo("test");
		z.addAnimal(c);
		
		Animal oldest = z.oldestForType('n');
		
		oldest.setType('m');
		
		oldest = z.oldestForType('n');

		assertFalse("Changed type of oldest from 'n' to 'm', list should still have 'n' animal, instead got null as healthiest", null == oldest);
		assertEquals("Changed type of oldest from 'n' to 'm', should not have changed list", 'n', oldest.getType());
	}



}
