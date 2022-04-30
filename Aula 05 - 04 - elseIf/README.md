# Aprendendo sobre o Else If

## Incluindo novas perguntas no else de cada if

> Não há limites em relação a aumentos de condições em if's, porém deve-se ter cuidado com a quantidade
> Pois fica a pergunta (Não seria melhor um switch?)
>
> Porém quando utilizamos else if ()
> Se faz necessário fechar essa cadeia com um else final (mesmo que vazio), por questões de boa prática

````java

if (condição1){
	//se atender condição1
}else if (condição2) { //so entra aqui se atender a condição
	//se atender condição2
}else if (condiçãoN) { //so entra aqui se atender a condição
	//se atender condiçãoN
}else {
	//pode ter alguma ação, mas mesmo que não tenha escreva mesmo assim
}
