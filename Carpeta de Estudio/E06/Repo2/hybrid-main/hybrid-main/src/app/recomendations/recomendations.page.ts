import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { IonContent, IonHeader, IonTitle, IonToolbar, IonCard, IonCardHeader, IonCardTitle, IonCardContent, IonBackButton, IonButtons } from '@ionic/angular/standalone';

@Component({
  selector: 'app-recomendations',
  templateUrl: './recomendations.page.html',
  styleUrls: ['./recomendations.page.scss'],
  standalone: true,
  imports: [IonButtons, IonBackButton, IonCardHeader, IonContent, IonHeader, IonTitle, IonToolbar, CommonModule, FormsModule,IonCard, IonCardHeader, IonCardTitle, IonCardContent],
})
export class RecomendationsPage implements OnInit {
  public index = Math.floor(Math.random() * 6);

  constructor() { }

  ngOnInit() {
  }

}
