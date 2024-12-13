import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, RouterModule } from '@angular/router';
import { RecipesService } from '../services/recipes.service';
import { CommonModule } from '@angular/common';
import { IonContent, IonHeader, IonTitle, IonToolbar, IonButtons, IonMenuButton, IonInput, IonItem, IonButton, IonCardContent, IonCardTitle, IonCardHeader, IonCard, IonList, IonBackButton } from '@ionic/angular/standalone';
import { IngredientsService } from '../services/ingredients.service';



@Component({
  selector: 'app-recipe-detail',
  templateUrl: './recipe-detail.component.html',
  styleUrls: ['./recipe-detail.component.scss'],
  standalone: true,
  imports: [IonContent, IonHeader, IonTitle, IonToolbar, CommonModule,IonButtons, IonMenuButton, IonInput, IonItem, IonButton, IonCardContent, IonCardTitle, IonCardHeader, IonCard, IonList, CommonModule, RouterModule, IonBackButton]

})
export class RecipeDetailComponent  implements OnInit {

  recipe: any;

  constructor(
    private route: ActivatedRoute,
    private recipesService: RecipesService,
    private ingredientsService: IngredientsService
  ) { }

  ngOnInit() {
    const id = this.route.snapshot.paramMap.get('id');
    if (id !== null) {
      this.recipesService.getRecipeById(id).subscribe(data => {
        this.recipe = data.recipe;
      }, error => {
        console.error('Error fetching recipe:', error);
      });
    }

  }

  addToCart() {
    this.ingredientsService.addIngredients(this.recipe.ingredientLines);
  }
}
