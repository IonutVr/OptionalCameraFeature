package com.example.optionalcamera;

import android.widget.Toast;
import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class OptionalCameraFeature extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("showToast")) {
            String message = args.getString(0);
            this.showToast(message, callbackContext);
            return true;
        }
        return false;
    }

    private void showToast(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            Toast.makeText(cordova.getActivity(), message, Toast.LENGTH_LONG).show();
            callbackContext.success("Toast shown: " + message);
        } else {
            callbackContext.error("Expected a non-empty string argument.");
        }
    }
}
