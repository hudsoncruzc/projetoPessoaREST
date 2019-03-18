angular.module("PessoasApp", [])
	.value('urlBase','http://localhost:8080/rest/')
	.controller("PessoaController", function($http, urlBase){
	
		
		var self = this;
		self.projeto = 'CRUD Pessoas (Spring Boot + Rest + Angular)';
	
		self.chamado 	= undefined;
		self.chamados 	= [];
		
		//controller.novo()
		self.novo = function(){
			self.chamado 	= {};
			self.chamado2	= undefined;
		};
		
		self.voltar = function(){
			self.chamado2	= undefined;
			self.atualizarTabela();
		}
		
		//controller.salvar()
		self.salvar = function(){

			var metodo = 'POST';
			var rest   = 'save';
			
			if(self.chamado.idPessoa){
				metodo = 'PUT';
				rest = 'update';
			}
			
			$http({
				method: metodo,
				url: urlBase + rest,
				data: self.chamado
			}).then(function successCallback(response){
				self.atualizarTabela();
			}, function erroCallback(respose){
				self.ocorreuErro();
			});
		};	
		
		self.alterar = function(dadosPessoa){
			self.chamado = dadosPessoa;
			self.chamado2	= undefined;

		};	
		
		//Pesquisar
		self.pesquisar = function(dadosPessoa){
			self.ch2 = dadosPessoa;
			
			$http({
				method:'GET',
				url: urlBase + 'pessoa/' + self.ch2.idPessoa
			}).then(function successCallback(response){
				self.chamado2 = response.data;
			}, function erroCallback(respose){
				self.ocorreuErro();
			});
		}
		
		self.deletar = function(dadosPessoa){
			self.chamado 	= dadosPessoa;
			self.chamado2	= undefined;

			$http({
				method: 'DELETE',
				url: urlBase + 'remove/' + self.chamado.idPessoa,
				data: self.chamado
			}).then(function successCallback(response){
				self.atualizarTabela();
			}, function erroCallback(respose){
				self.ocorreuErro();
			});
		
		};	
	

		self.ocorreuErro = function(){
			alert("Ocorreu um erro ao Incluir/Atualizar registro!!!");
		};
		
		self.atualizarTabela = function(){
			$http({
				method:'GET',
				url: urlBase + 'pessoas'
			}).then(function successCallback(response){
				self.chamados = response.data;
				self.chamado = undefined;
			}, function erroCallback(respose){
				self.ocorreuErro();
			});

		}
		
		
		self.activate = function(){
			self.atualizarTabela();
		};
		
		self.activate();
		
});