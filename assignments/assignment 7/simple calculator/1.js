function calculate()
{
            var x = Number(document.getElementById('value1').value);
            var y =Number(document.getElementById('value2').value)  
            var z =document.getElementById('sign').value;

            if(z=="-") {
                document.getElementById('result').value=x-y;
            }
            else if(z=="+"){
                document.getElementById('result').value=x+y;
           } 
           else if (z=="*"){
               document.getElementById('result').value=x*y;
           }
           else if(z=="/"){
               document.getElementById('result').value=x/y;
           }
           else{
               window.alert("please enter option")
           }
}