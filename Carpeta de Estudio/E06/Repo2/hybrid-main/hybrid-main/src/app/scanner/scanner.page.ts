import { Component, EnvironmentInjector, inject} from '@angular/core';
import { IonIcon, IonToolbar, IonTitle, IonContent, IonButton, IonButtons, IonBackButton, IonImg, } from '@ionic/angular/standalone';
import { PhotoService } from '../services/photo.service';

import { addIcons } from 'ionicons';
import { checkmarkCircle, camera, alertCircle } from 'ionicons/icons';

@Component({
  selector: 'app-scanner',
  templateUrl: './scanner.page.html',
  styleUrls: ['./scanner.page.scss'],
  standalone: true,
  imports: [IonIcon, IonToolbar, IonTitle, IonContent, IonButton, IonButtons, IonBackButton, IonIcon, IonImg,],
})

export class scanner {
  public index = 0

  public environmentInjector = inject(EnvironmentInjector);

  constructor(public photoService: PhotoService) {
    addIcons({checkmarkCircle, camera, alertCircle });
  }

  addPhotoToGallery() {
    this.photoService.addNewToGallery();
  }

  showScreen(numero: any){
    this.index = parseInt(numero)
  }

  regresar(){
    this.index = 0
  }
}