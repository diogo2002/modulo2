Algoritmo "palavra_maior"
// Autor(a)    : Diogo Gonçalves
// Data atual  : 17/11/2017
Var
remelgado, adeus, ola, maior : caracter


Inicio
Escreval("Qual a 1º palavra?")
leia(ola)
Escreval("Qual a 2º palavra?")
leia(adeus)
Escreval("Qual a 3º palavra?")
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