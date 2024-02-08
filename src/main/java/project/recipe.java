package project;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class recipe {
	@Id
	private int recipeId;
	private String recipeName;
	private String ingredients;
	private int difficultylevel;
	public recipe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRecipeId() {
		return recipeId;
	}
	public void setRecipeId(int recipeId) {
		this.recipeId = recipeId;
	}
	public String getRecipeName() {
		return recipeName;
	}
	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}
	public String getIngredients() {
		return ingredients;
	}
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	public int getDifficultylevel() {
		return difficultylevel;
	}
	public void setDifficultylevel(int difficultylevel) {
		this.difficultylevel = difficultylevel;
	}
	
	
}
