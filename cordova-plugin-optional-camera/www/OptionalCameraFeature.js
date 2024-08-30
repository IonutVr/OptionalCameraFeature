var exec = require('cordova/exec');

var OptionalCameraFeature = {
    showToast: function(message, success, error) {
        exec(success, error, 'OptionalCameraFeature', 'showToast', [message]);
    }
};

module.exports = OptionalCameraFeature;
