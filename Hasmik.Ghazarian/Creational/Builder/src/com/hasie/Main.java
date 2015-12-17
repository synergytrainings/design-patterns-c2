package com.hasie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;


public class Main {

	public static void main(String[] args) throws Exception {
		
		List<Integer> allLanguages = new ArrayList<>();
		allLanguages.add(1); //English
		allLanguages.add(2); //Spanish
		allLanguages.add(3); //Italian
		
		List<Integer> languages = new ArrayList<>();
		languages.add(2); //Spanish
		languages.add(3); //Italian
		
	Map months = Collections.EMPTY_MAP;
	months.put(1, MultilingualString.newBuilder().with(1, "January").with(2, "Enero").with(3, "Gennaio").build()); 
	months.put(2, MultilingualString.newBuilder().with(1, "February").with(2, "Febrero").with(3, "Febbraio").build());
	months.put(3, MultilingualString.newBuilder().with(1, "March").withSameStringForAllLanguages("Marzo", languages).build());
	months.put(4, MultilingualString.newBuilder().withSameStringForAllLanguages("April", allLanguages).build());
	
	
		
	}
}

