
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: carrinho compra tokstok
  Given que o usuario acesse o site "https://www.tokstok.com.br/"
	And preencha o campo de pesquisa
	And selecione o produto
	And clique em comprar
	When acessar o carrinho de compra
	Then validar o texto "Calcule as opções de frete e retirada"
  

