El plugin sirve para usar como base para crear tus propios plugins para Cordova.

El plugin es sencillo se crea una función "get" que recibe parámetros de tipo JSON String.

Luego devuelve ese parametro de la posición 0 concatenado con un Texto.

Para usarlo desde Cordova:
	privatevar.get('Robert', getResult);
	
	function getResult(response) {
		alert(response);
	}