package com.sistepar.plugin;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaArgs;
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
    public boolean execute(String action, final CordovaArgs args, final CallbackContext callback) throws JSONException {

        if (action.equals("get")) {
			cordova.getActivity().runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    String name = "";

                    try {
                        name = args.getString(0);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    final String message = "Hello, " + name;

                    PluginResult result = new PluginResult(PluginResult.Status.OK, message);
                    callback.sendPluginResult(result);
                }
            });

            return true;
			
        } else {
            return false;
        }
    }
}