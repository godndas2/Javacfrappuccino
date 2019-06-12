package generics.test; // move to package

import java.util.Collections;
import java.util.Comparator;

class Fruit {
	String name;
	int weight;
	
	public Fruit(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public String toString() {return name+"("+weight+")"; }
}

class Apple extends Fruit {
	public Apple(String name, int weight) {
		super(name, weight);
	}
}

class Grape extends Fruit {
	public Grape(String name, int weight) {
		super(name, weight);
	}
}

class AppleComp implements Comparator<Apple> {
	public int compare(Apple t1, Apple t2) {
		return t2.weight - t1.weight;
	}
}

class GrapeComp implements Comparator<Grape> {
	public int compare(Grape t1, Grape t2) {
		return t2.weight - t1.weight;
	}
}

class FruitComp implements Comparator<Fruit> {
	public int compare(Fruit t1, Fruit t2) {
		return t1.weight - t2.weight;
	}
}

public class GenFruitSort {

	public static void main(String[] args) {
		FruitBox<Apple> aBox = new FruitBox<Apple>();
		FruitBox<Grape> gBox = new FruitBox<Grape>();
		
		aBox.add(new Apple("GreenApple", 300));
		aBox.add(new Apple("GreenApple", 200));
		aBox.add(new Apple("GreenApple", 100));
		
		gBox.add(new Grape("GreenGrape", 400));
		gBox.add(new Grape("GreenGrape", 300));
		gBox.add(new Grape("GreenGrape", 200));
		
		Collections.sort(aBox.getList(), new AppleComp());
		Collections.sort(gBox.getList(), new GrapeComp());
		
		System.out.println(aBox);
		System.out.println(gBox);
		System.out.println();
		Collections.sort(aBox.getList(), new FruitComp());
		Collections.sort(gBox.getList(), new FruitComp());
		System.out.println(aBox);
		System.out.println(gBox);
	}

}
