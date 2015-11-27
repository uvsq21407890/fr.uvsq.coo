package fr.uvsq.coo.ex3_8;

import java.util.ArrayList;

public class Groupe implements IpersoGroupe {

	private String nom;
	ArrayList perso = new ArrayList<Personnel>();
	public Groupe(String nom, ArrayList perso){
		this.nom = nom;
		this.perso=perso;
	}
	public void add(IpersoGroupe pe){
		Personnel p = new Personnel.Builder("Fall", "Mohamet", null).tel(null).build();
		ArrayList perso = new ArrayList<Personnel>();
		perso.add(p);
		Groupe g = new Groupe("Directeur", perso);
	}
	public void aff() {
		// TODO Auto-generated method stub
		/*int s =Integer.parseInt(perso.size());*/
		/*for(int i=0; i=perso.size(); i++){
			
		}*/
		System.out.println(perso);
	}
	public static void main(String args){
		
	}
	
}
