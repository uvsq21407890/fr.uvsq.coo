package exopattern;

import java.util.Date;
import java.awt.List;
import java.time.LocalDate;


public class personnel {
	
	private String nom;
	private String prenom;
	private Date dateDeNaissance;
	//private List tel; 
	
	
	
	public static class Builder{
		
		private String nom;
		private String prenom;
		
		
		private Date datedenaissance = new Date(); 
					
		
		public Builder(String nom,String prenom) {
			this.nom      = nom;
			this.prenom = prenom;
		}
		public Builder dateDeNaissance(Date date){
			datedenaissance= date;
			return this;
		}
		public personnel build(){
			return new personnel(this);
		}
		
	}
	private  personnel(Builder builder) {
		nom =builder.prenom;
		prenom=builder.nom;
		
		//attributs facultatif
		dateDeNaissance=builder.datedenaissance;
		
		}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		personnel alpha = new personnel.Builder("moussa", "diagne").dateDeNaissance(d).build();
		System.out.println(alpha.dateDeNaissance);

	}

}
