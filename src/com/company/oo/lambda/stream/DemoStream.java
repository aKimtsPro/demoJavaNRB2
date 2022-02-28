package com.company.oo.lambda.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.company.oo.Animal;

public class DemoStream {
	
	public static void main(String[] args) {
		
		List<Animal> list = new ArrayList<>();
		
		list.add(Animal.builder().nom("rex").age(4).build());
		list.add(Animal.builder().nom("pico").age(2).build());
		list.add(Animal.builder().nom("youki").age(7).build());
		
		Stream<Animal> s = list.stream();
		
		String rslt = s
			.sorted( (a1, a2) -> {
				return a1.getAge() - a2.getAge();
			})
			.filter( (a) -> { 
				System.out.println(a);
				return a.getAge() < 5;
			} )
			.filter( (a) -> { 
				System.out.println(a);
				return a.getNom().charAt(0) == 'r'; 
			} )
			.map( a -> {
				System.out.println(a);
				return a.getNom();
			})
			.map((chaine) -> { 
				System.out.println(chaine);
				return chaine.toUpperCase(); 
			})
			.flatMap((nom) -> Arrays.stream(nom.split("")) )
			.reduce( "", (acc, next) ->  acc += (acc == ""? "":",")+next );
		
			System.out.println(rslt);
		
		
		
	}

}
