import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observer } from 'rxjs';

@Component({
  selector: 'app-afiliado-create',
  templateUrl: './afiliado-create.component.html',
  styleUrls: ['./afiliado-create.component.css']
})
export class AfiliadoCreateComponent {
  name: string = '';
  apellido: string = '';
  edad: number = 0;
  identificacion: number = 0;
  genero: string = '';
  direccion: string = '';
  telefono: string = '';
  fechaNacimiento: Date | null = null;

  constructor(private http: HttpClient) { }

  crearAfiliado() {
    const url = 'http://localhost:8080/api/afiliados';
    const datosAfiliado = {
      name: this.name,
      apellido: this.apellido,
      edad: this.edad,
      identificacion: this.identificacion,
      genero: this.genero,
      direccion: this.direccion,
      telefono: this.telefono,
      fechaNacimiento: this.fechaNacimiento
    };

    const observer: Observer<any> = {
      next: (response) => {
        console.log('Afiliado creado con éxito', response);
        // Puedes realizar acciones adicionales después de la creación
      },
      error: (error) => {
        console.error('Error al crear afiliado', error);
        // Maneja el error según tus necesidades
      },
      complete: () => {
        // Puedes realizar acciones adicionales cuando la operación se complete
      }
    };

    this.http.post(url, datosAfiliado).subscribe(observer);
  }
}
