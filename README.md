# Cordova - Private Variable

El plugin sirve para usar como base para crear tus propios plugins para Cordova.

El plugin es sencillo se crea una función "get" que recibe y devuelve parámetros de tipo JSON.

* Para agregar desde el CLI de Cordova:

	cordova plugin add https://github.com/rgfpy/cordova-privatevar.git

En la sección del código Java en com/sistepar/cordova/plugin/PrivatevarPlugin.java se puede agregar todos los datos 
que uno desea que le devuelva en Json.
	
	/* Editar Json para devolver parámetros */
	json.put("apiUrl", "http://api.sistepar.com");
	json.put("apiKey", "12345678");

Para usarlo desde Cordova dentro del evento "deviceredy":

	pVar.get('Robert', getResult);
	
	function getResult(response) {
		alert(JSON.stringify(response));
	}


# By <a href="http://sistepar.com">sistepar.com</a>

# License
The MIT License