import { Component } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { CadastroService } from './cadastro.service';
import { Pessoa } from './pessoa.model';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-cadastro',
  standalone: true,
  imports: [CommonModule, ReactiveFormsModule,],
  templateUrl: './cadastro.component.html',
  styleUrl: './cadastro.component.css'
})
export class CadastroComponent {
  cadastroForm: FormGroup;

  constructor(private fb: FormBuilder, private cadastroService: CadastroService) {
    this.cadastroForm = this.fb.group({
      nome: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
      cpf: ['', Validators.required],
      telefone: ['', Validators.required],
      senha: ['', Validators.required]
    });
  }

  onSubmit(): void {
    if (this.cadastroForm.valid) {
      const pessoa: Pessoa = this.cadastroForm.value;
      this.cadastroService.savePessoa(pessoa).subscribe(response => {
        console.log('Pessoa cadastrada com sucesso!', response);
      }, error => {
        console.error('Erro ao cadastrar pessoa', error);
      });
    }
  }
}
