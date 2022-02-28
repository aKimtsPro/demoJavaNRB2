package com.company.oo.lambda;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.company.oo.Animal;
import com.company.oo.Diplome;
import com.company.oo.exo.compet.sport.EnEquipe;
import com.company.oo.exo.compet.sport.Equipe;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {

		Diplome d = new Diplome(){};
		
		InterDemo i = new InterDemo() {
			@Override
			public void faireTruc() {
				System.out.println("faire un truc");
			}
		};
		
		i = () -> System.out.println("faire un truc");
		
		Predicate<String> p = (toTest) -> testPredicate(toTest);
		Predicate<String> p1 = Main::testPredicate;
		
		Animal a = Animal.builder()
				.nom("rex")
				.age(4)
				.build();
		
		Supplier<String> s = () -> a.getNom();
		s = a::getNom;
		
		Function<Animal,String> f = (animal) -> animal.getNom();
		f = Animal::getNom;
		
		f.apply(a);
		
		
		Thermometre t = new Thermometre(20);
		t.mettreDansEau( () -> {
			System.out.println("prevenir par email");
			return "la température est montée à " + t.getTemperature();
		} );
		
	}
	
	public static boolean testPredicate(String toTest) {
		return toTest.length() % 2 == 0;
	}
	
	
}
