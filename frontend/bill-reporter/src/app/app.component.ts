import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'BillReporter abc';
  springdata;

  constructor(private http: HttpClient) {
    this.getData();
  }

  getData() {
    return this.http.get('api/hi').subscribe(res => this.springdata = res);
  }
}
