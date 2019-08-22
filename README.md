# strategy-java
definição, explicação e implementação em java do padrão de projeto Strategy


# Nome: 
Strategy

# Problema a resolver:
A lógica condicional é uma das estururas mais complexas e difíceis de se gerenciar em desenvolvimento de softwares corportativos. Elas tedem a crescer e torna-se cada vez mais sofisticadas o que faz com que a manutenção seja cada vez mais custosa.

# Solução:
O Padrão Strategy sugere que se produza uma família de classes para cada variação do algoritmo e que se forneça para a classe hospedeira uma instância de Strategy para a qual ela delegará em tempo de execução. Um dos pré-requisitos para o Strategy é uma estrutura de herança onde cada subclasse específica contém uma variação do algoritmo. Assim, o padrão Strategy possui diversos benefícios como clarificar algoritmos ao diminuir ou remover lógica condicional, simplificar uma classe ao mover variações de um algoritmo para uma hierarquia, e habilitar um algoritmo para ser substituído por outro em tempo de execução.

# Aplicação:
*Quando necessita-se de variantes de um algoritmo;
*Quando se precisa ocultar do usuário a exposição das estruturas de dados complexas, específicas do algoritmo;
*Quando uma classe define muitos comportamentos e por sua vez eles aparecem como diversos “IFs”. Com isso esses comandos condicionais são movidos para sua própria classe Strategy.

# Consequências: 
*Entre os benefícios do padrão Strategy pode-se citar a reutilização por parte do Contexto que permite escolher entre uma família de algoritmos que possuem funcionalidades em comum; os algoritmos em classes Strategy possuem variações do seus algoritmos independentemente do seu contexto, assim é mais fácil utilizá-los, trocá-los, compreende-los e estende-los; diminuição ou eliminação da lógica condicional clarificando ainda mais os algoritmos; a Strategy permite que se escolham diferentes implementações do mesmo comportamento; utilizando Strategy há uma grande simplificação na classe ao mover variações de um algoritmo para uma hierarquia; habilita-se que um algoritmo seja substituído por outro em tempo de execução.
*As desvantagens na utilização do Padrão Strategy é a complicação que há de como os algoritmos obtêm ou recebem dados de suas classes de contexto; o cliente deve conhecer como que os Strategies diferem, antes mesmo que ele possa selecionar um mais apropriado para o contexto da aplicação; o custo da comunicação entre o contexto e o Strategy é significativo, dado que os Strategies concretos não necessariamente usarão todas as informações da Strategy abstrata, portanto podem haver situações em que o contexto criará e inicializará parâmetros que nunca serão usados; Strategies aumentam o número de objetos no sistema, que pode ser ruim em determinadas situações em termos de custo e por fim pessoas inexperiente podem ter dificuldade sobre o funcionamento do código por não entender o que é e como funciona o padrão.


