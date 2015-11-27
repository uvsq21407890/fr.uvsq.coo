package fr.uvsq.coo.ex3_8;

import java.util.Date;
import java.util.List;

public class Personnel {

	private String nom;
	private String prenom;
	private Date date_naiss;

	public static class Builder {
		private String nom;
		private String prenom;
		private Date date_naiss;

		private List tel;

		public Builder(String nom, String prenom, Date date_naiss) {
			this.nom = nom;
			this.prenom = prenom;
		}

		public Builder tel(List Tel) {
			Tel = tel;
			return this;
		}

		public Personnel build() {
			return new Personnel(this);
		}
	}

	public Personnel(Builder builder) {
		nom = builder.nom;
		prenom = builder.prenom;
		date_naiss = builder.date_naiss;
		
		List tel = builder.tel;
	}

	
	
}
