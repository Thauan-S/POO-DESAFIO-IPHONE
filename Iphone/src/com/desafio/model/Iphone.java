package com.desafio.model;

public class Iphone implements AparelhoTelefonico,Navegador,ReprodutorMusical{

	

	@Override
	public void ligar() {
		System.out.println("Ligando ");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo");
		
	}

	@Override
	public void tocar() {
		System.out.println("tocando");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando Música");
		
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo Página");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando Nova Aba");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando Página");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando Correio De Voz");
		
	}

}
