# Compass.uol_Avaliacao_Sprint-1
Avaliação do Primeiro Sprint do Programa de Bolsas Compass.UOL

## Avaliação I – PB 2022 – Springboot / UNICESUMAR – Compass.uol

### Pergunda 1<br />
  <p>Baseado no Scrum Guide, qual o tempo máximo deveriam ter as seguintes cerimônias:</p>
  a. Daily:<br />
  b. Planning:<br />
  c. Review:<br />
  d. Retrospectiva:
  
### Resposta 1<br />
  a. A Daily Scrum deve ter em torno de 15 minutos de duração. <br />
  b. O Sprint Planning tem como limite 8 horas para um Sprint de um mês, no entanto pode ser mais curto para Sprints menores.<br />
  c. A Sprint Review é limitada a um máximo de 4 horas para um Sprint de um mês, porém tal qual o Sprint Planning, pode ser mais curto em caso de Sprints menores.<br />
  d. A Sprint Retrospective tem como limite 3 horas para um Sprint de um mês, porém o evento normalmente é mais curto para Sprints menores.<br />
<br />
<hr />

### Pergunta 2<br />
<p>José iniciou sua jornada recentemente com git e não está conseguindo publicar seu arquivo README e a classe Product.js que acabou de criar. O erro do git dá a seguinte informação:</p>

  Untracked Files:<br />
  README<br />
  Product.js<br />

Por que esse “erro” de “Untracked files” ocorreu e qual comando resolveria o problema?<br />

### Resposta 2<br />
Cada arquivo no diretório onde o Git foi inicializado pode estar em dois estados iniciais, tracked e untracked, que em tradução livre seria algo como Monitorado e Não Monitorado respectivamente. Os arquivos de José ainda não estão sendo monitorados (tracked) pelo Git, embora o Git saiba da existência dos arquivos na pasta. Para resolver esse problema basta José utilizar o comando git add <nome do arquivo> para que o Git comece a monitorá-los e publicá-los posteriormente. O próprio Git avisa isso na mensagem de erro:<br />
  
  Untracked files:<br />

  (use "git add <file>..." to include in what will be committed)<br />
    
        README.md
        Product.js

   nothing added to commit but untracked files present (use "git add" to track)<br />
<br />
<hr />
  
### Pergunta 3<br />
O time de desenvolvimento analisou e descobriu que o projeto está gerando arquivos pesados e desnecessários para serem commitados no repositório git. Em qual arquivo você deve incluir a lista de extensões para que esses arquivos desnecessários sejam desconsiderados?
### Resposta 3<br />
As extensões e pastas precisam ser listadas dentro do arquivo .gitignore para serem ignoradas pelo monitoramento do git. Como por exemplo *.doc irá ignorar todos os arquivos de extensão .doc ou .idea/ irá ignorar a pasta .idea e todo seu conteúdo.
<br />
<hr />

### Pergunta 4<br />
  Com suas palavras, descreva as vantagens de utilizar o Scrum no seu projeto.
  
### Resposta 4<br />
Acredito que embora o Scrum traga mais agilidade e produtividade para o projeto, as maiores vantagens em se utilizar o Scrum em um projeto seria a Adaptabilidade que o Scrum proporciona e Redirecionamento caso necessário. O quero dizer com isso é que devido ao fato do Scrum ser organizado em Sprints curtas com comunicação constante entre as partes, ele permite que o time esteja preparado para se Adaptar a novas funcionalidades ou imprevisto que possam surgir no projeto, bem como mudar a direção ou foco do desenvolvimento caso seja necessário. Outra vantagem que não pode ser ignorada na utilização do Scrum é a entrega incremental no final de cada Sprint, permitindo que tanto o cliente quanto a equipe tenham resultados e métricas palpáveis para se trabalhar no próximo ciclo. 
<br />
<hr />
  
### Pergunta 5<br />  
José foi promovido de seu cargo anterior e se tornou o novo Product Owner do time, quais são suas novas responsabilidades como PO?
  
### Resposta 5<br />
Como Product Owner do time José será responsável por maximizar o valor do produto desenvolvido pelo Scrum Team. Embora a forma como isso seja feita varie de acordo com a Organização e os indivíduos envolvidos.<br />
O Product Owner é reponsável pela gestão eficiente do Product Backlog, que inclui:<br />
  
* Desenvolvimento e Comunicação explícita do Product Goal;
* Criar e comunicar com clareza os itens do Product Backlog;
* Ordenar os itens do Product Backlog;
* Garantir que o Product Backlog é transparente, visível e compreendido.
  
Vale lembrar que o Product Owner pode delegar esses tarefas, porém ele ainda é responsável pelo resultado do trabalho realizado.
