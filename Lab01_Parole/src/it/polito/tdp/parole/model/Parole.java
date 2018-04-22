package it.polito.tdp.parole.model;

import java.util.*;

public class Parole {
	List<String> parole;
		
	public Parole() {
		//TODO
		parole=new ArrayList<String>();
	}
	
	public void addParola(String p) {
		//TODO
		parole.add(p);
	}
	
	public List<String> getElenco() {
		//TODO
		Collections.sort(parole);
		return parole;
	}
	
	public void reset() {
		// TODO
		parole.removeAll(parole);
	}

	@Override
	public String toString() {
		String stampa="";
		for(String s:parole)
			stampa+=s+"\n";
		return stampa ;
	}
	
	
}
