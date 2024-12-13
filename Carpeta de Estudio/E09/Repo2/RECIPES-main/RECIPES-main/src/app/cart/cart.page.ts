import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { IngredientsService } from '../services/ingredients.service';
import { IonicModule } from '@ionic/angular';



@Component({
  selector: 'app-cart',
  templateUrl: './cart.page.html',
  styleUrls: ['./cart.page.scss'],
  standalone: true,
  imports: [IonicModule, CommonModule, FormsModule]
})
export class CartPage implements OnInit {
  recipe: any;

  ingredients: { [key: string]: { count: number, checked: boolean } } = {};

  constructor(private ingredientsService: IngredientsService) {}

  ngOnInit() {
    const ingredients = this.ingredientsService.getIngredients();
    for (const key in ingredients) {
      if (ingredients.hasOwnProperty(key)) {
        this.ingredients[key] = { count: ingredients[key], checked: false };
      }
    }
  }

  clearCart() {
    this.ingredients = {};
  }

  isCartEmpty(): boolean {
    return Object.keys(this.ingredients).length === 0;
  }

}
