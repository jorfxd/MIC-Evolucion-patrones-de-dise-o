import { Component, inject, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormControl, FormGroup, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';
import { IonContent, IonHeader, IonIcon, IonTitle, IonToolbar, IonButton } from '@ionic/angular/standalone';
import { SharedModule } from '../shared/shared.module';
import { addIcons } from 'ionicons';
import { mailOutline,  lockClosedOutline, eyeOffOutline, eyeOutline} from 'ionicons/icons';
import { RouterLink } from '@angular/router';
import { FirebaseService } from '../services/firebase.service';
import { User } from '../interfaces/user';
import { ExploreContainerComponent } from '../explore-container/explore-container.component';
import { IonCard, IonCardContent, IonCardHeader, IonCardSubtitle, IonCardTitle, IonInput, IonInputPasswordToggle, IonItem, IonLabel, IonList } from '@ionic/angular/standalone';
import { HttpClientModule } from '@angular/common/http';
import { Router } from '@angular/router';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.page.html',
  styleUrls: ['./login.page.scss'],
  standalone: true,
  imports: [IonHeader, IonToolbar, IonTitle, IonContent, ExploreContainerComponent, 
    HttpClientModule, ReactiveFormsModule, CommonModule, 
    IonLabel, IonList, IonItem, IonInputPasswordToggle, IonButton,
    IonCard, IonCardHeader, IonCardSubtitle, IonCardTitle, IonCardContent, SharedModule],
    providers: [FirebaseService, RouterLink, Router]
})
export class LoginPage implements OnInit {
  public userData: User;
  public users: User[] = [];

  form = new FormGroup({
    email: new FormControl('',[Validators.required, Validators.email]),
    password: new FormControl('', [Validators.required])
  })

  constructor(private firebaseSvc: FirebaseService, private routerLink: Router, private userService: UserService) { 
    addIcons({mailOutline, lockClosedOutline, eyeOffOutline, eyeOutline}); }

  ngOnInit() {
    this.loadData()
    console.log(this.loadData())
  }

  loadData() {
    this.firebaseSvc.getResponse().subscribe( response => {
      if( response != null) {
        this.users = Object.values(response) as User[]
      }
        
     })
    }



  submit(): void{
    console.log(this.users)
    if(this.form.valid){
      const formData = this.form.value;
      const userExists = this.users.find(
        user => user.email === formData.email && user.password === formData.password
      );

      if (userExists) {
        this.userService.setUserName(userExists.name);
        localStorage.setItem('user', userExists.name);
        
        this.routerLink.navigate(['../tabSport']);
        this.routerLink.ngOnDestroy()

      } else {
        console.error('Credenciales incorrectas');
      }
    }
    
  }

}
