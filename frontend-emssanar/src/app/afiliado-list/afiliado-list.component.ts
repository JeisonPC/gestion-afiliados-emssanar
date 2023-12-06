import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observer } from 'rxjs';

@Component({
  selector: 'app-afiliado-list',
  templateUrl: './afiliado-list.component.html',
  styleUrls: ['./afiliado-list.component.css']
})
export class AfiliadoListComponent implements OnInit {
  afiliados: any[] = [];

  constructor(private http: HttpClient) {}

  ngOnInit(): void {
    this.getAfiliados();
  }

  getAfiliados() {
    const url = 'http://localhost:8080/api/afiliados';

    const observer: Observer<any[]> = {
      next: (response) => {
        this.afiliados = response;
      },
      error: (error) => {
        console.error('Error al obtener afiliados', error);
      },
      complete: () => {
        // Puedes realizar acciones adicionales cuando la operación se complete
      }
    };

    this.http.get<any[]>(url).subscribe(observer);
  }
}
