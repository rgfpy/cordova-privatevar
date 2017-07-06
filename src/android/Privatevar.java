package com.sistepar.privatevar;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Privatevar extends CordovaPlugin {
	/**
     * Constructor.
     */
    public Privatevar() {
    }
	
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {

        if (action.equals("get")) {
            String name = args.getString(0);
            String message = "Hello, " + name;
			
            callbackContext.success(message);

            return true;
			
        } else {
            return false;
        }
    }
}