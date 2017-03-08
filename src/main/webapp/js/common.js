//设置cookie
function setCookie(name, value, expiredays) {
	var exDay = new Date();
	exDay.setDate(exDay.getDate() + expiredays);
	document.cookie = name + "=" + escape(value)
			+ ((expiredays == null) ? "" : ";expires=" + exDay.toGMTString());
}

//根据用户名获取cookie
function getCookie(name){
	//存在cookie
	if(document.cookie.length > 0){
		start = document.cookie.indexOf(name + "=");
		if(start != -1){
			start = start + name.length + 1;
			end = document.cookie.indexOf(";", start);
			if(end == -1)
				end = document.cookie.length;
			return unescape(document.cookie.substring(start, end));
		}
	}
}

//检测cookie是否存在
function checkCookie() {
	username = getCookie('user')
	if (username != null && username != "") {
		return true;
	} else {
		return false;
	}
}