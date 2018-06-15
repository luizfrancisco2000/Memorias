/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function Mudarestado(email) {
    var display = document.getElementById("login").style.display;
    if (display == "none" && email != null)
        document.getElementById("login").style.display = 'block';
    else if (isplay == "none" && email == null)
        document.getElementById("login").style.display = 'none';
}