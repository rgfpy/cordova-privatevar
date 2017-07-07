module.exports = {
	get: function (parmPost, successCallback, errorCallback) {
		cordova.exec(successCallback, errorCallback, "PrivatevarPlugin", "get", [parmPost]);
	}
};