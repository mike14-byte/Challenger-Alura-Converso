# Challenge-ONE-Back-End-Java--Conversor-De-Moneda
# ¡Bienvenido al primer desafío del Challenge Java!

## Descripción del Desafio
En esta oportunidad, a los Devs se nos solicitó crear un conversor de divisas utilizando el lenguaje Java. 
Las características solicitadas por nuestro cliente son las siguientes:

![Challenge Oracle Next Education + Alura Banner](https://raw.githubusercontent.com/EduardoUT/ConversorMoneda-ONE-Alura_Challenge/master/src/Imagenes/challengeImage.jpg)

El convertidor de moneda debe:

      - Convertir de la moneda de tu país a Dólar
      - Convertir de la moneda de tu país  a Euros
      - Convertir de la moneda de tu país  a Libras Esterlinas
      - Convertir de la moneda de tu país  a Yen Japonés
      - Convertir de la moneda de tu país  a Won sul-coreano
      
Recordando que también debe ser posible convertir inversamente.  
Además se solicita añadir al programa otros tipos de conversiones como temperatura por ejemplo.

## Video explicativo del Desafio
[Para ver el video haga clic aquí](https://youtu.be/mj3qYtEABOs")


## Funcionamiento del desafio 

https://user-images.githubusercontent.com/113076640/223848567-e82ffe49-4655-4534-a603-5f551ab606ab.mp4


## Funcionamiento 

Al iniciar la aplicación el usuario podrá elegir entre el conversor de divisas o el conversor de temperatura.


![imagen1](https://user-images.githubusercontent.com/113076640/223850990-e6d2cb69-04f5-4d0b-9774-587c0b17a1e0.png)


saldrá un menú donde se muestran las opciones de conversión de divisas y de temperatura.


![imagen2](https://user-images.githubusercontent.com/113076640/223851829-7c5507d3-401a-4615-a14c-e9fb6d71499e.png)


Una vez elegida la opción deseada, aparece un cuadro de diálogo en el cual se debe que ingresar el monto a convertir.


![imagen3](https://user-images.githubusercontent.com/113076640/223852727-5d82fea4-9e71-4a8c-8d8d-83e7f455912f.png)


En caso de que se ingrese un valor que  no sea válido o no se ingrese ningún valor, se mostrará un mensaje de error y se pregruntará si quiere iniciar de  nuevo .


![imagen4](https://user-images.githubusercontent.com/113076640/223856100-d912170a-7c04-4bb2-8f25-ebe65b420a7f.png)


En caso de que no haya ningún error, se despliega un cuadro de diálogo con la conversión solicitada.


![imagen5](https://user-images.githubusercontent.com/113076640/223857294-05bc930f-dceb-4b0e-8553-d72b51b2f686.png)


Finalizando se muestra un cuadro para elegir si se desea iniciar de nuevo el programa o si desea terminar, en caso de seguir en el programa, se vuelve al comienzo para elegir otra conversión.


![6](https://user-images.githubusercontent.com/113076640/223859442-f432ea4d-5827-4136-885b-55a34bc3b2c3.png)


En el caso de que se decida terminar el programa, se mostrará un mensaje al usuario donde se indique "Programa Terminado"


![7](https://user-images.githubusercontent.com/113076640/223858580-da5a3af6-e7df-4dda-9343-02c9445b560d.png)

## ¿Qué se utilizó?

Se usó  la librería  javax.swing para el manejo de interfaces gráficas.

Se usaron validaciones para visualizar la información ingresada y poder observar la respuesta del programa.

se  usaron Excepciones como NumberFormatException, además de los try - cash para poder evitar problemas de parte del programa o del usuario.

Se usaron los condiciones Switch - Case, para realizar todas las validaciones.





