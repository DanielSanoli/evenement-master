import { provideRouter, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { CadastroComponent } from './cadastro/cadastro.component';
import { LoginComponent } from './login/login.component';

export const routes: Routes = [
    { path: 'home', component: HomeComponent },
    { path: 'cadastrar', component: CadastroComponent },
    { path: 'login', component: LoginComponent},
];


export const appRoutingProviders = [
    provideRouter(routes)
  ];