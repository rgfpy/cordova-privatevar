module.exports = {
	get: function (parmPost, successCallback, errorCallback) {
		exec(successCallback, errorCallback, "PrivatevarPlugin", "get", [parmPost]);
	}
};