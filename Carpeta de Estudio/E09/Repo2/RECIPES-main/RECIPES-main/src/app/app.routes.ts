import { Routes } from '@angular/router';

export const routes: Routes = [
  { path: '',loadComponent: ()=> import('./main/main.page').then(m => m.MainPage) },
  { path: 'main',loadComponent: ()=> import('./main/main.page').then(m => m.MainPage) },
  { path: 'recipe/:id', loadComponent: () => import('./recipe-detail/recipe-detail.component').then( m => m.RecipeDetailComponent) },
  {
    path: 'cart',
    loadComponent: () => import('./cart/cart.page').then( m => m.CartPage)
  },


];
