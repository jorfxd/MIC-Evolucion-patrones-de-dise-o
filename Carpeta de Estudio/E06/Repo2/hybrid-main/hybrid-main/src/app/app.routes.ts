import { Routes } from '@angular/router';

export const routes: Routes = [
  {
    path: '',
    redirectTo: 'login',
    pathMatch: 'full'
  },
  {
    path: 'login',
    loadComponent: () => import('./login/login.page').then( m => m.LoginPage)
  },
  {
    path: 'home',
    loadComponent: () => import('./home/home.page').then( m => m.HomePage)
  },
  {
    path: 'sign-up',
    loadComponent: () => import('./sign-up/sign-up.page').then( m => m.SignUpPage)
  },
  {
    path: 'tabSport',
    loadComponent: () => import('./tabSport/tabSport.page').then( m => m.tabSport)
  },
  {
    path: 'articles',
    loadComponent: () => import('./articles/articles.page').then( m => m.articles)
  },
  {
    path: 'password-reset',
    loadComponent: () => import('./password/password.page').then( m => m.PasswordPage)
  },
  {
    path: 'scanner',
    loadComponent: () => import('./scanner/scanner.page').then( m => m.scanner)
  },{
    path: 'recomendations',
    loadComponent: () => import('./recomendations/recomendations.page').then( m => m.RecomendationsPage)
  },
  {
    path: '**', 
    redirectTo: 'login'
  }

  
];
