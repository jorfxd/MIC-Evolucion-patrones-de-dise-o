import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import {  ReactiveFormsModule  } from '@angular/forms';
import { IonButton, IonIcon, IonContent, IonHeader, IonTitle, IonToolbar, IonCard, IonCardContent, IonCardHeader, IonCardSubtitle, IonCardTitle, IonInput, IonItem, IonLabel, IonList } from '@ionic/angular/standalone';
import { addIcons } from 'ionicons';
import { mailOutline } from 'ionicons/icons';
import { HttpClientModule } from '@angular/common/http';
import { ExploreContainerComponent } from '../explore-container/explore-container.component';
import { SharedModule } from '../shared/shared.module';


@Component({
  selector: 'app-password',
  templateUrl: './password.page.html',
  styleUrls: ['./password.page.scss'],
  standalone: true,
  imports: [IonHeader, IonToolbar, IonTitle, IonContent, ExploreContainerComponent, 
    HttpClientModule, ReactiveFormsModule, CommonModule, 
    IonLabel, IonList, IonItem, IonInput, IonButton,
    IonCard, IonCardHeader, IonCardSubtitle, IonCardTitle, IonCardContent, SharedModule],
})
export class PasswordPage implements OnInit {
  

  constructor() {
  }

  ngOnInit() { 
    
  }

  
  

  
}
