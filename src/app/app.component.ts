import { Component } from '@angular/core';
import { User } from './models';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'kanbanportal';
  user: User = new User;

    constructor(private accountService: AccountService) {
        this.accountService.user.subscribe((x: User) => this.user = x);
    }

    logout() {
        this.accountService.logout();
    }
}
