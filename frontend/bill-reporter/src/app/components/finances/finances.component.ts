import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { AppService } from '../../services/app.service';


@Component({
  selector: 'app-finances',
  templateUrl: './finances.component.html',
  styleUrls: ['./finances.component.css']
})
export class FinancesComponent {

  greeting = {};

  constructor(private http: HttpClient, private app: AppService) {
    http.get('resource').subscribe(data => this.greeting = data);
   }

  authenticated() {
    return this.app.authenticated;
  }

}
