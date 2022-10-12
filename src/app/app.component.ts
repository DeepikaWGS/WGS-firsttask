import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Component } from '@angular/core';
import { Register } from './register';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'kanbanproject';
 URL="http://localhost:8082/addingdetails";

 constructor(private http:HttpClient)
{

}
Data()
{
  this.http.post
}
}