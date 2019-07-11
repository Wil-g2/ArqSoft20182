# WACoQL
Uma Ferramenta para Definição, Análise e Visualização de Conformidade Arquitetural e Dependência em Classes na linguagem Java.

# Utilização da Ferramenta
  1 - Adicionar o jar javadepextractor.jar para pasta src do projeto que deseja realizar analise
  
  2 - Importar o projeto java para algum IDE ou compilar o mesmo e executar o .jar
  
# Interface da ferramenta  

![Ferramentas](https://user-images.githubusercontent.com/26700193/61057518-df351f80-a3cb-11e9-900d-c6b40eaba1c0.png)


# Tela de carregamento do projeto Java e pode ser configurado suas restrições arquiteturais
  1 - Pode se criar restrições a nível de Classes e Pacotes
  
  2 - Definir as regras através de interface 
  
  3 - Após definiar as regras pode clicar em validar, ou salvar o arquivo de restrições para utilizar em futuras analises
  
![interface_restricoes](https://user-images.githubusercontent.com/26700193/61057609-05f35600-a3cc-11e9-9a1a-d686ba89b114.png)

# Visualização Arquitetural
A visualização Arquitetural pode ser a nível de pacote, classe e geral, em todas as visualizações pode considerar ou não API do Java.

![interface_visualizacao](https://user-images.githubusercontent.com/26700193/61057950-b06b7900-a3cc-11e9-9c19-bc51c12335f9.png)

# A nível de pacotes 
   - linha Vermelha é considerado uma divergência na sua arquitetura 
   - linha Azul ausência 
![visualizacao](https://user-images.githubusercontent.com/26700193/61058235-338ccf00-a3cd-11e9-84e9-5b57054e4b65.png)

# A nível de classes 
![visualizacaoAPIJAva](https://user-images.githubusercontent.com/26700193/61058707-245a5100-a3ce-11e9-9e25-39ee6be0d662.png)

# A nível geral 
![interface_visualizacao](https://user-images.githubusercontent.com/26700193/61058558-e2310f80-a3cd-11e9-85fc-b72b0a640188.png)

# Matriz de Dependências - DSM
A matriz de dependências estruturais (DSM do inglês Dependency Structure Matrix), este conceito é baseado em uma matriz quadrada, na qual a interseção entre
linhas e colunas denota a relação entre classes ou pacotes de um sistema orientado por objetos.

![matriz](https://user-images.githubusercontent.com/26700193/61059275-1ce77780-a3cf-11e9-9d72-37758c9f7e70.png)

# Consulta SQL no projeto 
Nessa tela é realizdao uma consulta utilizando SQL para verificar todas as classes e tipos que existe no projeto exemplo de consulta: 
```SQL 
select * from project;  
```
Na interface já tem alguns SQL padrões, onde pode escolher utilizando uma caixa de seleção e caso queira uma consulta mais elaborada pode ser criado na ferramenta digitando o código.
![sqlProjeto](https://user-images.githubusercontent.com/26700193/61060153-7bf9bc00-a3d0-11e9-9698-ada98d3e0bd3.png)
