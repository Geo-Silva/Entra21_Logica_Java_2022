# Aprendendo sobre o Else If

## Incluindo novas perguntas no else de cada if

> N�o h� limites em rela��o a aumentos de condi��es em if's, por�m deve-se ter cuidado com a quantidade
> Pois fica a pergunta (N�o seria melhor um switch?)
>
> Por�m quando utilizamos else if ()
> Se faz necess�rio fechar essa cadeia com um else final (mesmo que vazio), por quest�es de boa pr�tica

````java

if (condi��o1){
	//se atender condi��o1
}else if (condi��o2) { //so entra aqui se atender a condi��o
	//se atender condi��o2
}else if (condi��oN) { //so entra aqui se atender a condi��o
	//se atender condi��oN
}else {
	//pode ter alguma a��o, mas mesmo que n�o tenha escreva mesmo assim
}
