import { Component } from '@angular/core';
// import { IonRouterOutlet } from '@ionic/angular/standalone';
import { IonicModule } from '@ionic/angular';
import { RouterLink, RouterModule } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: 'app.component.html',
  standalone: true,
  imports: [IonicModule, RouterLink, RouterModule],
})
export class AppComponent {
  constructor() {}
}
