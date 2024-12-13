import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { IonicModule } from '@ionic/angular';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HeaderComponent } from './header/header.component';
import { CustomInputComponent } from './custom-input/custom-input.component';
import { LogoComponent } from './logo/logo.component';



@NgModule({
  declarations: [
    HeaderComponent,
    CustomInputComponent, 
    LogoComponent
  ],
  exports: [
    HeaderComponent,
    CustomInputComponent,
    ReactiveFormsModule
  ],
  imports: [
    CommonModule, 
    IonicModule,
    ReactiveFormsModule,
    FormsModule,
    
  ]
})
export class SharedModule { }
