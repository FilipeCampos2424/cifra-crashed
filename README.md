O que significa fazer "saltos de 5"?
R: O índice vai percorrer a string 5 posições por vez. 
Exemplo: 0, (0 + 5 = 5), (5 + 5 = 10)....


O que significa o percurso ser "circular"?
R: Quando você chega no final da String, você volta pro começo, 
Exemplo: tá no 45, soma 5, dá 50, mas a string só vai até 46,
aí você volta usando o módulo: 50 % 47 = 3.


Por que usamos o operador de módulo % na expressão (indice + 5) % 47?
R: o % garante que o índice nunca passe do tamanho da string, reiniciando automaticamente
(lembrando que 47 é apenas o tamanho da string, sendo basicamente (indice + 5) % tamanho).


Por que, com tamanho 47 e salto 5, todos os índices de 0 a 46 são visitados exatamente
uma vez?
R: Porque 5 e 47 são coprimos (não têm divisor comum além de 1),
garantindo que o salto percorra todos os índices sem repetir antes de completar o ciclo.


Apresente os 10 primeiros índices visitados pela regra de salto 5 sobre a string de 47
caracteres, começando do índice 0.
R: índices visitados (primeiros 10) 0, 5, 10, 15, 20, 25, 30, 35, 40, 45





