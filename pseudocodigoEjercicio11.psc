Algoritmo pseudocodigoEjercicio11
	definir numD, num12, numP,num,promedioPares Como Real
	numDoce=0;
	numMayor=0;
	Para i=1 hasta 10 Hacer
		num=Aleatorio(0,36);
		Escribir num;
		si num>numMayor Entonces
			numMayor=num;
		FinSi
		Si num>12 y num<25 Entonces
			numDoce=numDoce+1;
		FinSi
		si num mod 2=0 y Num<>0 Entonces
			nP=nP+1;
			num=numP+num;
			numP=num;
		sino si num=0 entonces
				canCero=canCero+1	
			SiNo
				nI=nI+1;
			FinSi
			
		FinSi
	FinPara
	promedioPares=numP/nP;
	Escribir "La cantidad de numeros impares es ",nI;
	Escribir "La cantidad de numeros pares es ",nP, " Y el promedio es ",promedioPares;
	EScribir "La cantidad de numeros que estan entre 13 y 24 es ",numDoce;
	Escribir "El numero mayor es ",numMayor;
FinAlgoritmo
