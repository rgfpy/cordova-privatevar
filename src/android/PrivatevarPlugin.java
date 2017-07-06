package com.sistepar.plugin;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaArgs;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONException;
import org.json.JSONObject;

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
                    JSONObject json = new JSONObject();

                    try {
                        json.put("apiUrl", "http://api.sistepar.com");
                        json.put("apiKey", "12345678");
                    } catch (JSONException e) {
                        e.printStackTrace();
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