var labels=new Array();
	labels[0]="eroareNume"; //OK!
	labels[1]="eroareEmail"; //OK!
	labels[2]="eroareParola"; //OK!
	labels[3]="eroareConfirmare"; //OK!
	
function validare(){
	var inputs=new Array();
		inputs[0]=document.getElementById("nume").value;
		inputs[1]=document.getElementById("email").value;
		inputs[2]=document.getElementById("parola").value;
		inputs[3]=document.getElementById("confirmare").value;
	
	var erori=new Array();
		erori[0]="<span style='color:red'>Va rog sa introduceti un nume!</span>";
		erori[1]="<span style='color:red'> Va rog sa introduceti un email!</span>";
		erori[2]="<span style='color:red'>Va rog sa introduceti o parola!</span>";
		erori[3]="<span style='color:red'>Va rog sa confirmati parola!</span>";
		
		for(i in inputs){
			var label=labels[i];
			var err=erori[i]
			if(inputs[i]==""){
				document.getElementById(label).innerHTML=err;
			}else if(i==1){
				var atpos=inputs[i].indexOf("@");
				var dotpos=inputs[i].indexOf(".");
				// a@as.as
				if(atpos<1 || dotpos<atpos+2 || dotpos+3>inputs[i].length){
					document.getElementById(label).innerHTML="<span style='color:red'>Introduceti o adresa valida</span>";
				}else{
					document.getElementById(label).innerHTML="OK!";
				}					
			}else if(i==3){
				//testam daca parola si confirmarea sunt egale
				var prim=document.getElementById("parola").value;
				var doi=document.getElementById("confirmare").value;
				if(prim!=doi){
					document.getElementById(label).innerHTML="<span style='color:red'>Parola si confirmarea nu sunt identice</span>";
				}else{
					document.getElementById(label).innerHTML="OK!";
				}
			}else{
				document.getElementById(label).innerHTML="OK!";
			}				
		}
}

function validareFinala(){
	var cont=0;
    for(i=0;i<4;i++){
        var label = labels[i];
        if(document.getElementById(label).innerHTML == "OK!"){
			cont++;
		}
    }
    if(cont == 4){
        document.getElementById("validareFinala").innerHTML = "Toate datele sunt corecte";
	}
}