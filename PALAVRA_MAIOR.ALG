Algoritmo "palavra_maior"
// Autor(a)    : Diogo Gon�alves
// Data atual  : 17/11/2017
Var
remelgado, adeus, ola, maior : caracter


Inicio
Escreval("Qual a 1� palavra?")
leia(ola)
Escreval("Qual a 2� palavra?")
leia(adeus)
Escreval("Qual a 3� palavra?")
leia(remelgado)
se (ola > adeus) entao
maior <- ola
senao
maior <- adeus
fimse
se (maior < remelgado) entao
maior <- remelgado
fimse
escreva ("Palavra maior: ",maior)

Fimalgoritmo