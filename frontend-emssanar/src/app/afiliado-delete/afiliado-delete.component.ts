import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-afiliado-delete',
  template: `
    <div>
      <h2>Eliminar Afiliado</h2>
      <p>¿Estás seguro de que deseas eliminar al afiliado con ID {{ afiliadoId }}?</p>
      <button (click)="eliminarAfiliado()">Eliminar</button>
      <button (click)="cancelar()">Cancelar</button>
    </div>
  `,
  styles: [
    `
      div {
        margin-top: 20px;
      }

      button {
        background-color: #d9534f;
        color: white;
        padding: 10px 15px;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        margin-right: 10px;
      }

      button:hover {
        background-color: #c9302c;
      }
    `,
  ],
})
export class AfiliadoDeleteComponent implements OnInit {
  afiliadoId!: number; // Usa el operador de "definite assignment assertion"

  constructor(private route: ActivatedRoute, private router: Router) {}

  ngOnInit(): void {
    const idParam = this.route.snapshot.paramMap.get('id');
    if (idParam !== null) {
      this.afiliadoId = +idParam;
    } else {
      // Manejar el caso donde 'id' es null, por ejemplo, redirigir a otra página o mostrar un mensaje de error.
    }
  }
  

  eliminarAfiliado() {
    // Aquí debes agregar tu lógica para eliminar directamente (sin un servicio)
    console.log(`Afiliado con ID ${this.afiliadoId} eliminado directamente`);
    // Puedes redirigir a la lista de afiliados u otras acciones después de eliminar
    this.router.navigate(['/afiliado-list']);
  }

  cancelar() {
    // Puedes redirigir a la lista de afiliados u otras acciones al cancelar
    this.router.navigate(['/afiliado-list']);
  }
}
