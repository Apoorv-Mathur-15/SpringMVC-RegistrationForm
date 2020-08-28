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
	    <title>Event Registration Form</title>
	
	    <link href="EventRegister/vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
	    <link href="EventRegister/vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">

	    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i" rel="stylesheet">
	
	    <link href="EventRegister/vendor/select2/select2.min.css" rel="stylesheet" media="all">
	    <link href="EventRegister/vendor/datepicker/daterangepicker.css" rel="stylesheet" media="all">
	
	    <link href="EventRegister/css/main.css" rel="stylesheet" media="all">
	    <!-- <link href="webjars/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet">   -->
	
	</head>
	
<body>
    <!-- <div class="w3-content w3-section" style="align-items: center;">
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
            setTimeout(carousel, 2000);
        }
    </script>

	<form action="/EventRegister" method="POST"></form>
    <table border="0" width='480px' align="center">
        <center><tr><td><h2>Event Registration</h2></td></tr></center>
        <table border="0" width='480px' cellpadding='0' cellspacing='0' align="center">
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
            <tr>
                <td align='center'><input type="checkbox" name="event1" value="Event1">
                    <label for="event2"> Event1</label><br>
                </td>
            </tr>
            <tr>
                <td align='center'><input type="checkbox" name="event2" value="Event2">
                    <label for="event2"> Event2</label><br>
                </td>
            </tr>
            <tr>
                <td align='center'><input type="checkbox" name="event3" value="Event3">
                    <label for="event2"> Event3</label><br>
                </td>
            </tr>
            <tr>
                <td align='center'><input type="checkbox" name="event4" value="Event4">
                    <label for="event2"> Event4</label><br>
                </td>
            </tr>
            <table border='0' cellpadding='0' cellspacing='0' width='480px' align='center'>
                <tr>
                    <td align='center'><button class="btn btn-success" type="submit">Submit</button></td>
                </tr>
            </table>
            </form>
        </table>
    </table> -->
    
    <div class="page-wrapper bg-gra-03 p-t-45 p-b-50">
        <div class="wrapper wrapper--w790">
            <div class="card card-5">
                <div class="card-heading">
                    <h2 class="title">Event Registration Form</h2>
                </div>
                <div class="card-body">
                    <form action="/EventRegister" method="POST">
                        <div class="form-row m-b-55">
                            <div class="name">Name</div>
                            <div class="value">
                                <div class="input-group-desc">
                                    <input class="input--style-5" type="text" name="name">
                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="name">Enrollment</div>
                            <div class="value">
                                <div class="input-group">
                                    <input class="input--style-5" type="text" name="enrollment">
                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="name">Email</div>
                            <div class="value">
                                <div class="input-group">
                                    <input class="input--style-5" type="email" name="email">
                                </div>
                            </div>
                        </div>
                        <div class="form-row m-b-55">
                            <div class="name">Phone Number</div>
                            <div class="value">
                                <div class="input-group">
                                    <input class="input--style-5" type="text" name="phone_number">
                                </div>
                            </div>
                        </div>
                        <div class="form-row m-b-55">
                            <div class="name">WhatsApp Number</div>
                            <div class="value">
                                <div class="input-group">
                                    <input class="input--style-5" type="text" name="whatsapp_number">
                                </div>
                            </div>
                        </div>
                        <div class="form-row m-b-55">
                            <div class="name">College</div>
                            <div class="value">
                                <div class="input-group">
                                    <input class="input--style-5" type="text" name="college">
                                </div>
                            </div>
                        </div>
                        <div>
                            <button class="btn btn--radius-2 btn--red" type="submit">Register</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

    <!-- Jquery JS-->
    <script src="EventRegister/vendor/jquery/jquery.min.js"></script>
    <!-- Vendor JS-->
    <script src="EventRegister/vendor/select2/select2.min.js"></script>
    <script src="EventRegister/vendor/datepicker/moment.min.js"></script>
    <script src="EventRegister/vendor/datepicker/daterangepicker.js"></script>

    <!-- Main JS-->
    <script src="EventRegister/js/global.js"></script>
    
    <script src="webjars/jquery/3.4.1/jquery.min.js"></script>
    <script src="webjars/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</body>
    
    <!-- <script src="webjars/jquery/3.4.1/jquery.min.js"></script>
    <script src="webjars/bootstrap/4.4.1/js/bootstrap.min.js"></script>  -->
</body>

</html>