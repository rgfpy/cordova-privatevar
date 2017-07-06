** Robert Galeano - sistepar.com <@rgfpy>

El plugin sirve para usar como base para crear tus propios plugins para Cordova.

El plugin es sencillo se crea una función "get" que recibe y devuelve parámetros de tipo JSON.

En la sección del código Java en com/sistepar/cordova/plugin/PrivatevarPlugin.java se puede agregar todos los datos 
que uno desea que le devuelva en Json.

	try {
		json.put("apiUrl", "http://api.sistepar.com");
		json.put("apiKey", "12345678");
	} catch (JSONException e) {
		e.printStackTrace();
	}


Para usarlo desde Cordova dentro del evento "deviceredy":

	pVar.get('Robert', getResult);
	
	function getResult(response) {
		alert(JSON.stringify(response));
	}