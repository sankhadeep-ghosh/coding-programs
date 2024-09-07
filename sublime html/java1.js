var w=7;
var a1="7";
var b2=7;
if (w==a1 && a1==b2) 
{
	w==b2;
	document.write("<br><br>therefore w equals b2: "+b2);
}
else
{
	document.write("<br>no, w not equal to a1");
}
var p=(w===a1)? "<br><br>Yes" : "<br><br>No";
document.write(p);
function newFunction(q,t) 
{
	document.write("<br>"+q+" "+t+"<br>"); 
}
newFunction("John","Cena");
newFunction("Cristiano","Ronaldo");

function returningvalue(q)
{
	return q;
}
document.write(returningvalue("John<br>"));
function myname(u,v)
{
	document.write("<br>My name is "+u);
}
function myage(u,v)
{
	document.write("<br>My age is "+v);
	myname(u,v);
}
myage("Sankha","20");
var x=13;
function local()
{
	x = 5;
	document.write("<br><br>"+x+"<br>");
}
local();
document.write(x+"<br><br>");

//way1 of declaring array
var myarray = new Array("Sankha","kjcdecd","hdcvud","hdvhud");
document.write(myarray[1]);

//way2
var fruits = new Array(5);
fruits[0] = "<br>mango1";
fruits[1] = "<br>mango2";
fruits[2] = "<br>mango3";
fruits[3] = "<br>mango4";
fruits[4] = "<br>mango5";
document.write(fruits[1]);

//way3
var hobbies = new Array();
hobbies.push("<br>cricket");
hobbies.push("<br>football");
hobbies.push("<br>basketball");
hobbies.push("<br>basketball1");
hobbies.push("<br>basketball2");
hobbies.push("<br>basketball3");

for (var i = 0; i < hobbies.length; i++) 
{
	document.write(hobbies[i]);
}

hobbies.pop();
for (var i = 0; i < hobbies.length; i++) 
{
	document.write("<br>"+hobbies[i]);
}

hobbies.shift();
for (var i = 0; i < hobbies.length; i++) 
{
	document.write(hobbies[i]);
}

hobbies.unshift("<br>cricket"); 
for (var i = 0; i < hobbies.length; i++) 
{
	document.write(hobbies[i]);
}

var laptop = {price : 60000 , brand : "HP", ram : "8gb"};
//document.write("<br>"+laptop.brand);
var l;
for(l in laptop)
{
	document.write("<br><i>"+l+"</i> : <b>"+laptop[l]+"</b>");
}