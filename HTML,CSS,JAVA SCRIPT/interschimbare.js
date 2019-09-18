function interschimbare(){
		var element1=parseFloat(document.getElementById("nr1").value);
		var element2=parseFloat(document.getElementById("nr2").value);
		
		element1=element1+element2;
		element2=element1-element2;
		element1=element1-element2;
		
		operand1=document.getElementById("nr1");
		operand2=document.getElementById("nr2");
		
	
		operand1.value=element1;
		operand2.value=element2;
		
		}
		var array=[];
	
		
		
		function adaugare(){
			
			var element=parseFloat(document.getElementById("numarul").value);
			
			array.push(element);
			
			console.log(array);
			
		}
		
		function afiseaza(){
			
		
			
			document.getElementById("vectorul").innerHTML=array.toString();
			
			
		
			
		}
		
		
		function sortareBule(){
			//creeaza tabel cu iteratiile sortarii
			
			var body=document.getElementsByTagName("body")[0];
			var tb1=document.createElement("table");
			tb1.style.width="100%";
			tb1.border=1;
			var tabelBody=document.createElement("tbody");
			
			
			var sortat=true;
			
			do{
				var tr=tb1.insertRow();
				
				
				sortat=true;
				for(var i=0;i<array.length-1;i++){
					if(array[i] < array[i+1]){
						var temp=array[i];
						array[i]=array[i+1];
						array[i+1]=temp;
						sortat =false;
					}
					
				}
				
				for(var i=0;i<array.length;i++){
					var td=tr.insertCell();
					td.appendChild(document.createTextNode(array[i].toString()));
					
				}
				
				
				
			}while(!sortat);
			
			console.log(array);
			
			tb1.appendChild(tabelBody);
			body.appendChild(tb1);
			
		}
		
		
		
		