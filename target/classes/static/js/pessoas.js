angular.module("PessoasApp", [])
.value('urlBase','http://localhost:8080/rest/')
.controller("PessoaController", function($http, urlBase){


	var self = this;
	self.projeto = 'CRUD Pessoas (Spring Boot + Rest + Angular)';

	self.infpessoa 	= undefined;
	self.infArrayPessoa 	= [];

	//controller.novo()
	self.novo = function(){
		self.infpessoa 	= {};
		self.infPesqPessoa	= undefined;
	};

	self.voltar = function(){
		self.infPesqPessoa	= undefined;
		self.atualizarTabela();
	}

	//controller.salvar()
	self.salvar = function(){

		var metodo = 'POST';
		var rest   = 'save';

		if(self.infpessoa.idPessoa){
			metodo = 'PUT';
			rest = 'update';
		}

		$http({
			method: metodo,
			url: urlBase + rest,
			data: self.infpessoa
		}).then(function successCallback(response){
			self.atualizarTabela();
		}, function erroCallback(respose){
			self.ocorreuErro();
		});
	};	

	self.alterar = function(dadosPessoa){
		self.infpessoa = dadosPessoa;
		self.infPesqPessoa	= undefined;

	};	

	//Pesquisar
	self.pesquisar = function(dadosPessoa){
		self.ch2 = dadosPessoa;

		$http({
			method:'GET',
			url: urlBase + 'pessoa/' + self.ch2.idPessoa
		}).then(function successCallback(response){
			self.infPesqPessoa = response.data;
		}, function erroCallback(respose){
			self.ocorreuErro();
		});
	}

	self.deletar = function(dadosPessoa){
		self.infpessoa 	= dadosPessoa;
		self.infPesqPessoa	= undefined;

		$http({
			method: 'DELETE',
			url: urlBase + 'remove/' + self.infpessoa.idPessoa,
			data: self.infpessoa
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
			self.infArrayPessoa = response.data;
			self.infpessoa = undefined;
		}, function erroCallback(respose){
			self.ocorreuErro();
		});

	}


	self.activate = function(){
		self.atualizarTabela();
	};

	self.activate();

});