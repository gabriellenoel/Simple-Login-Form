

window.onload = function () {

if (window.location.pathname == "/simpleLoginForm/login"){
	console.log("does this work1");
    const errorMsg = document.getElementById("errormsg");
    errorMsg.innerText = "Error! Username or Password was incorrect.";
} else {
	console.log("does this work2");
	const noErrorMsg = document.getElementById("errormsg");
    noErrorMsg.innerText = "";
}
};