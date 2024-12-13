import { Component } from '@angular/core';
import { IonApp, IonRouterOutlet } from '@ionic/angular/standalone';

//firebase
import { AngularFireModule } from '@angular/fire/compat';
@Component({
  selector: 'app-root',
  templateUrl: 'app.component.html',
  standalone: true,
  imports: [IonApp, IonRouterOutlet, AngularFireModule],
})
export class AppComponent {
  constructor() {}
}
