<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	    <meta name="description" content="Colorlib Templates">
	    <meta name="author" content="Colorlib">
	    <meta name="keywords" content="Colorlib Templates">
		<link rel="icon" href="login/images/Main.png" type="image/x-icon">
	    <title>Edit your Details</title>
	
	    <link href="NewRegistration/vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
	    <link href="NewRegistration/vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">

	    <link href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
	
	    <link href="NewRegistration/vendor/select2/select2.min.css" rel="stylesheet" media="all">
	    <link href="NewRegistration/vendor/datepicker/daterangepicker.css" rel="stylesheet" media="all">
	
	    <link href="NewRegistration/css/main.css" rel="stylesheet" media="all">
		<!-- <link href="webjars/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet">   -->
	</head>
	
<body>
    
    <!-- 
    <div class="w3-content w3-section" style="align-items: center;">
        <img class="mySlides" src="img/background.png" style="width:100%">
        <img class="mySlides" src="img/background2.png" style="width:100%">
        <img class="mySlides" src="img/background3.png" style="width:100%">
    </div>
    <script>
        var myIndex = 0;
        carousel();

        function carousel() {
            var i;
            var x = document.getElementsByClassName("mySlides");
            for (i = 0; i < x.length; i++) {
                x[i].style.display = "none";
            }
            myIndex++;
            if (myIndex > x.length) {
                myIndex = 1
            }
            x[myIndex - 1].style.display = "block";
            setTimeout(carousel, 2000); // Change image every 4 seconds
        }
    </script>

    <table border="0" width='480px' cellpadding='0' cellspacing='0' align="center">
        <center><tr><td><h2>New Registration</h2></td></tr></center>
        <form action="/NewRegistration" method="POST">
            <table border="0" width='480px' align="center">
                <tr>
                    <td align='center'>Name:</td>
                    <td><input type='text' name='name'></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td align='center'>Enrollment Number:</td>
                    <td><input type='text' name='enrollment'></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td align='center'>Email Address:</td>
                    <td><input type='email' name='email'></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td align='center'>Phone Number:</td>
                    <td><input type='text' name='phone_number'></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td align='center'>WhatsApp Number:</td>
                    <td><input type='text' name='whatsapp_number'></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td align='center'>College:</td>
                    <td><input type='text' name='college'></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                </tr>
                <table border='0' cellpadding='0' cellspacing='0' width='480px' align='center'>
                    <tr>
                        <td align='center'><button class="btn btn-success" type="submit">Submit</button></td>
                    </tr>
                </table>
        </form>
        </table>
    </table> -->
    
    <div class="page-wrapper bg-gra-02 p-t-130 p-b-100 font-poppins">
        <div class="wrapper wrapper--w680">
            <div class="card card-4">
                <div class="card-body">
                    <h2 class="title">Editing Form</h2>
                    <form action="/Edit" method="POST">
                        <div class="input-group">
                            <label class="label">name</label>
                            <input class="input--style-4" type="text" name="name">
                        </div>
                        <div class="input-group">
                            <label class="label">enrollment number</label>
                            <input class="input--style-4" type="text" name="enrollment">
                        </div>
                        <div class="input-group">
                            <label class="label">phone number</label>
                            <input class="input--style-4" type="text" name="phone_number">
                        </div>
                        <div class="input-group">
                            <label class="label">whatsapp number</label>
                            <input class="input--style-4" type="text" name="whatsapp_number">
                        </div>
                        <div class="input-group">
                            <label class="label">Email</label>
                            <input class="input--style-4" type="email" name="email">
                        </div>
                        <div class="input-group">
                            <label class="label">college</label>
                            <input class="input--style-4" type="text" name="college">
                        </div>
                        <div class="p-t-15">
                            <button class="btn btn--radius-2 btn--blue" type="submit">Submit</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

    <!-- Jquery JS-->
    <script src="NewRegistration/vendor/jquery/jquery.min.js"></script>
    <!-- Vendor JS-->
    <script src="NewRegistration/vendor/select2/select2.min.js"></script>
    <script src="NewRegistration/vendor/datepicker/moment.min.js"></script>
    <script src="NewRegistration/vendor/datepicker/daterangepicker.js"></script>

    <!-- Main JS-->
    <script src="NewRegistration/js/global.js"></script>
    
    
    <!-- <script src="webjars/jquery/3.4.1/jquery.min.js"></script>
    <script src="webjars/bootstrap/4.4.1/js/bootstrap.min.js"></script>  -->
</body>
</html>