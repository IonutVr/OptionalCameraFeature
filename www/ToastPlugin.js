var exec = require('cordova/exec');

var ToastPlugin = {
    showToast: function(message, success, error) {
        exec(success, error, 'ToastPlugin', 'showToast', [message]);
    }
};

module.exports = ToastPlugin;
