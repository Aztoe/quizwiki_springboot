window.addEventListener('load', () => {
  const forms = document.getElementsByClassName('validation-form');
   Array.prototype.filter.call(forms, (form) => {
    form.addEventListener('submit', function (event) {
      if (form.checkValidity() === false) {
         event.preventDefault();
         event.stopPropagation();
        }
        form.classList.add('was-validated');
       }, false);
     });
 }, false);


	
    
/*function passcheck_signup(){
	 // pass1 : 비밀번호
	 const pass1 = document.querySelector('input[name="pass"]');
	 // pass2 : 비밀번호 확인
	 const pass2 = document.querySelector('input[name="pass_check"]');
	 
	 if(pass1===pass2){
		 console.log("일치");
	 } 
}*/
