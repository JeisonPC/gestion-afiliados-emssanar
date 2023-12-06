// app.module.ts

import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module'; // Importa el módulo de enrutamiento

import { AppComponent } from './app.component';
import { AfiliadoCreateComponent } from './afiliado-create/afiliado-create.component';
import { AfiliadoListComponent } from './afiliado-list/afiliado-list.component';
import { AfiliadoDeleteComponent } from './afiliado-delete/afiliado-delete.component';

@NgModule({
  declarations: [
    AppComponent,
    AfiliadoCreateComponent,
    AfiliadoListComponent,
    AfiliadoDeleteComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
