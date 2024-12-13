import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { IonContent, IonHeader, IonTitle, IonToolbar, IonGrid, IonRow, IonCol, IonButton, IonIcon, IonFooter } from '@ionic/angular/standalone';
import { ActivatedRoute } from '@angular/router';
import { UserService } from '../services/user.service';
import { addIcons } from 'ionicons';
import { cameraSharp, fileTrayFullSharp, newspaperSharp, sparklesSharp} from 'ionicons/icons';

@Component({
  selector: 'app-home',
  templateUrl: './home.page.html',
  styleUrls: ['./home.page.scss'],
  standalone: true,
  imports: [IonIcon, IonContent, IonHeader, IonTitle, IonToolbar, CommonModule, FormsModule, IonGrid, IonRow, IonCol, IonButton, IonFooter],
})
export class HomePage implements OnInit {
  name: string | null = null;

  constructor(private userService: UserService) { 
    addIcons({cameraSharp, fileTrayFullSharp, newspaperSharp, sparklesSharp});
  }

  ngOnInit() {
    this.name = localStorage.getItem('user'); 
    console.log(this.name);
}

}
