   //Find the values added in form using the id of each fields. The ".val()" function finds the value added in the form fields.
  var fullname = $('#name').val();
  var address = $('#address').val();
  var mobileno = $('#phoneno').val();
  var email = $('#email').val();
  var indexat = email.indexOf("@"); //Index of "@" in the email field
  var indexdot = email.indexOf("."); //Index of "." in the email field
  var password = $('#password').val();
  var repassword = $('#confirm_password').val();
  
  //Function will execute when the button "Click to Submit" is clicked.
  $('#submit').click(function() {
	  
    //Blank field validation of fullname, mobile no and address. The function will generate an alert message if "fullname" or "mobile no" or "address" field is blank  
    if(fullname == '')
    {
	  alert('Please enter your Full Name');
	  $('#name').focus(); //The focus function will move the cursor to "fullname" field
    }
    else if(address == '')
    {
	  alert('Please enter your Address');
	  $('#address').focus();
    }
    else if(mobileno == '')
    {
	  alert('Please enter your Mobile Number');
	  $('#address').focus();
    }
    
    //Validation of valid email address. The function will generate an alert message if "email" field is blank or incorrect
    else if(indexat < 1 || (indexdot-indexat) < 2)
    {
	  alert('Please enter a valid Email Id');
	  $('#email').focus();
    }
    
    //Validation of password. The function will generate an alert message if "password" field is not same as "retype password".
    else if(password == '' && password != repassword)
    {
	  alert('Password and Retype password donot match');
	  $('#confirm_password').focus();
    }
  });
    
 