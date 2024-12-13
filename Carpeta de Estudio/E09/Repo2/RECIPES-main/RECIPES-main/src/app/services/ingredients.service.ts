import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class IngredientsService {
  private ingredients: { [key: string]: number } = {};

  addIngredients(newIngredients: string[]) {
    newIngredients.forEach(ingredient => {
      if (this.ingredients[ingredient]) {
        this.ingredients[ingredient]++;
      } else {
        this.ingredients[ingredient] = 1;
      }
    });
  }

  getIngredients(): { [key: string]: number } {
    return this.ingredients;
  }
}
