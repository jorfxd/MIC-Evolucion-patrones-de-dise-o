import { Component, EnvironmentInjector, inject} from '@angular/core';
import { IonIcon, IonTitle, IonContent, IonToolbar, IonButton, IonButtons, IonBackButton} from '@ionic/angular/standalone';
import { ExploreContainerComponent } from '../explore-container/explore-container.component';

import { addIcons } from 'ionicons';
import { football, basketball, bicycle, walk, tennisball, baseball} from 'ionicons/icons';

@Component({
  selector: 'app-tabSport',
  templateUrl: './tabSport.page.html',
  styleUrls: ['./tabSport.page.scss'],
  standalone: true,
  imports: [IonIcon, ExploreContainerComponent,IonTitle, IonToolbar, IonContent, IonButton, IonButtons, IonBackButton,],
})
export class tabSport {
  public index = 0

  public imagesSRC = ["../../assets/images/futbol.png", "../../assets/images/basketball.png", "../../assets/images/tenis.png",
                      "../../assets/images/ciclismo.png", "../../assets/images/atletismo.png", "../../assets/images/baseball.png"]
  
  public environmentInjector = inject(EnvironmentInjector);

  public textos = 
  ["Los futbolistas pasan muchas horas entrenando y jugando al aire libre, lo que los expone significativamente a los rayos UV. Esta exposición prolongada puede aumentar el riesgo de desarrollar cáncer de piel, incluyendo melanomas y carcinomas basocelulares.",
    "Los jugadores de baloncesto que entrenan y juegan en canchas exteriores están en riesgo de sufrir quemaduras solares, especialmente en los brazos, cara y cuello. Las quemaduras solares frecuentes pueden causar daño permanente a la piel y aumentar el riesgo de cáncer de piel a largo plazo.",
    "Los jugadores de tenis que entrenan y juegan en canchas exteriores están en riesgo de sufrir quemaduras solares, especialmente en los brazos, cara y cuello. Las quemaduras solares frecuentes pueden causar daño permanente a la piel y aumentar el riesgo de cáncer de piel a largo plazo.",
    "Los ciclistas pasan largos periodos al aire libre y en movimiento, lo que los expone no solo a la radiación directa del sol, sino también a la radiación reflejada por las carreteras. Esto puede causar daños a los ojos, incluyendo cataratas y degeneración macular, si no se protegen adecuadamente con gafas UV.",
    "Los atletas que entrenan y compiten al aire libre están expuestos a la radiación solar directa, lo que puede causar hiperpigmentación. Esto se manifiesta como manchas oscuras o irregulares en la piel, y es más común en áreas que reciben más sol, como el rostro y los brazos.",
    "Los jugadores de béisbol que entrenan y juegan en canchas exteriores están en riesgo de sufrir quemaduras solares, especialmente en los brazos, cara y cuello. Las quemaduras solares frecuentes pueden causar daño permanente a la piel y aumentar el riesgo de cáncer de piel a largo plazo.",]

  constructor() {
    addIcons({ football, basketball, bicycle, walk, tennisball, baseball});
  }

  showSport(numero: any){
    this.index = parseInt(numero)
  }

  regresar(){
    this.index = 0
  }
}