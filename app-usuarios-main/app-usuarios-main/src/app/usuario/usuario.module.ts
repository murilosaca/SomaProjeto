import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { InserirUsuarioComponent } from './inserir-usuario/inserir-usuario.component';
import { EditarUsuarioComponent } from './editar-usuario/editar-usuario.component';
import { ListarUsuarioComponent } from './listar-usuario/listar-usuario.component';



@NgModule({
  declarations: [
    InserirUsuarioComponent,
    EditarUsuarioComponent,
    ListarUsuarioComponent
  ],
  imports: [
    CommonModule
  ],
  exports: [
    InserirUsuarioComponent,
    EditarUsuarioComponent,
    ListarUsuarioComponent
  ]
})
export class UsuarioModule { }
