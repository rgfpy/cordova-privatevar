package com.sistepar.cordova.privatevar;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaArgs;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONException;
import org.json.JSONObject;

public class PrivatevarPlugin extends CordovaPlugin {
    @Override
    public boolean execute(String action, final CordovaArgs args, final CallbackContext callback) throws JSONException {

        if (action.equals("get")) {
			cordova.getActivity().runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    JSONObject json = new JSONObject();
					
					/* Editar Json para devolver parámetros */
                    try {
                        json.put("apiUrl", "http://api.sistepar.com");
                        json.put("apiKey", "12345678");
                    } catch (JSONException e) {
                        callback.error("Error al crear Json en PrivatevarPlugin");
                    }

                    PluginResult result = new PluginResult(PluginResult.Status.OK, json);
                    callback.sendPluginResult(result);
                }
            });

            return true;
			
        } else {
            return false;
        }
    }
}