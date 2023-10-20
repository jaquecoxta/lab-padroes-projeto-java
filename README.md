# Explorando Padrões de Projetos na Prática com Java

Repositório com as implementações dos padrões de projeto explorados no Lab "Explorando Padrões de Projetos na Prática com Java". Especificamente, este projeto explorou alguns padrões usando Java puro:
- Singleton
- Strategy
- Facade



## Jaqueline Costa - Otimização e Legibilidade do código.

- Descrição das modificações do projeto teste.java:
  
Neste código, a estrutura foi aprimorada para torná-lo mais modular e fácil de entender. Diferentes funcionalidades foram isoladas em métodos específicos, promovendo uma melhor organização do código principal (main). Além disso, a saída no console foi melhorada para fornecer informações contextuais sobre as instâncias de Singleton que estão sendo usadas. Essas alterações melhoram a clareza do código e também facilita a expansão do código no futuro.

- Descrição das modificações do projeto subsistema1.java:
  
Já no projeto subsistema1.java, o método gravarCliente foi refinado para melhorar a segurança e eficiência do código. Adicionei a validação de parâmetros para evitar valores nulos ou vazios. Os parâmetros inválidos foram detectados e uma exceção IllegalArgumentException foi lançada, fornecendo feedback imediato sobre os problemas. E por fim a construção da saída foi otimizada usando StringBuilder, aprimorando o desempenho do código.

- Descrição das modificações do projeto subsistema2.java:
  
No projeto subsistema2.java, fiz melhorias importantes para aumentar a legibilidade e a manutenibilidade do código Java. Introduziram-se constantes para representar valores fixos como "Araraquara" e "SP", permitindo modificações futuras de forma fácil e intuitiva. Os blocos try-catch foram implementados para capturar exceções, garantindo a manipulação adequada de erros. A lógica dentro desses blocos pode ser personalizada conforme necessário para recuperar informações de cidade e estado com base no CEP fornecido.

