import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AfiliadoListComponent } from './afiliado-list/afiliado-list.component';
import { AfiliadoCreateComponent } from './afiliado-create/afiliado-create.component';
import { AfiliadoDeleteComponent } from './afiliado-delete/afiliado-delete.component';


const routes: Routes = [
  { path: 'afiliado-create', component: AfiliadoCreateComponent },
  { path: 'afiliado-list', component: AfiliadoListComponent },
  { path: 'afiliado-delete/:id', component: AfiliadoDeleteComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
