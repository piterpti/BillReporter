import { Component } from '@angular/core';
import { AppService } from './services/app.service';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';

import { Observable } from 'rxjs';
import { finalize } from 'rxjs/operators';



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'BillReporter abc';

  constructor(private app: AppService, private http: HttpClient, private router: Router) {
    this.app.authenticate(undefined, undefined);
  }

  authenticated() {
    console.log('appComponet: ' + this.app.authenticated);
    return this.app.authenticated;
  }

  logout() {
    this.http.post('logout', {}).pipe(
      finalize(() => {
            this.app.authenticated = false;
            this.router.navigateByUrl('/login');
      }
      )
    ).subscribe();

  }

}
