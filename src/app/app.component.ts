import { HttpErrorResponse } from '@angular/common/http';
import { Component } from '@angular/core';
import { Register } from './register';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'kanbanproject';
  // userService: any;
  // register: Register[] | undefined;

// public getRegister(): void {
//   this.userService.getEmployees().subscribe(
//     (response: Register[]) => {
//       this.register = response;
//       console.log(this.register);
//     },
//     (error: HttpErrorResponse) => {
//       alert(error.message);
//     }
//   );
// }

}