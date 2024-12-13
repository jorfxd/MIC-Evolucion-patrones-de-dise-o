import { inject, Injectable } from '@angular/core';
import {AngularFireAuth} from '@angular/fire/compat/auth';
/* 1. Importe el módulo del HttpClient */
import { HttpClient } from '@angular/common/http';
import {  getAuth, signInWithEmailAndPassword} from 'firebase/auth';
import { User } from '../interfaces/user';

@Injectable({
  providedIn: 'root'
})

export class FirebaseService {
  /* 2.Atributo URL */
  private URL: string =  'https://hybrid-c961d-default-rtdb.firebaseio.com/login.json';

  /* 3. Inyección de dependencia del HttpClient */
  constructor(private http:HttpClient) { }

  /* 4. Método con la petición HTTP */
  getResponse() {
      return this.http.get(this.URL);
  }

  /* 5. Método con la petición HTTP */ 
  postResponse(data: any) {
      return this.http.post(this.URL, data);
  }
}
