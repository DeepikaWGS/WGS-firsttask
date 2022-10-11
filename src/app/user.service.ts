import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http:HttpClient) {


   }
   public doRegistration(register: any){
    return this.http.post("localhost:8082/addingdetails",register,{responseType:'text' as 'json'});
   }
}
