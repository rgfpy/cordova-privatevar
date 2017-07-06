package com.sistepar.plugin;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;

public class PrivatevarPlugin extends CordovaPlugin {
	/**
     * Constructor.
     */
    public PrivatevarPlugin() {
    }
	
    @Override
    public boolean execute(String action, JSONArray args, final CallbackContext callback) throws JSONException {

        if (action.equals("get")) {
			cordova.getActivity().runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    final String name = args.getString(0);
					final String message = "Hello, " + name;
					
					callback.getData(message);
                }
            });

            return true;
			
        } else {
            return false;
        }
    }
}