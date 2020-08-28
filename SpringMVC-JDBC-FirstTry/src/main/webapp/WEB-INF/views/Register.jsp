<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
	    <title>Event Registration Form</title>
	    <link rel="icon" href="login/images/Main.png" type="image/x-icon">
		<!-- <link href="webjars/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet">   -->
	</head>
	<body>
		<!-- <div id="slides " class="carousel slide " data-ride="carousel " style="text-align: center;">
        <ul class="carousel-indicators ">
            <li data-target="#slides " data-slide-to="0 "></li>
            <li data-target="#slides " data-slide-to="1 "></li>
            <li data-target="#slides " data-slide-to="2 "></li>
        </ul>
        <div class="carousel-inner ">
            <div class="carousel-item active ">
                <img src="img/background.png ">
            </div>
            <div class="carousel-item ">
                <img src="img/background2.png ">
            </div>
            <div class="carousel-item ">
                <img src="img/background3.png ">
            </div>
        </div>
    </div>
    <div class="container">
        <br>Welcome, ${name }<br><br>Enrollment: ${enrollment}<br><br>Email Address: ${email}<br><br>Phone Number: ${phone_number}
        <br><br>WhatsApp Number: ${whatsapp_number}<br><br>College: Jaypee Institute of Information Technology, Sector ${college}.
        <br><br>Event Registered:<br><br> ${event1} <br><br>${event2}<br><br> ${event3}<br> <br>${event4}<br><br><br>
        <a href="/login" class="btn btn-danger" role="button">Exit</a>
    </div> -->
    
    <!-- Wrapper -->
    <div id="wrapper">

        <!-- Header -->
        <header id="header">
            <h1>Welcome</h1><br> ${name }<br><br>Enrollment: ${enrollment}<br><br>Email Address: ${email}<br><br>Phone Number: ${phone_number}
                <br><br>WhatsApp Number: ${whatsapp_number}<br><br>College: ${college}.
                <br><br>Event Registered:<br><br> ${event1} <br><br>${event2}<br><br> ${event3}<br> <br>${event4}<br><br><br>
        <a href="/login" class="btn btn-danger" role="button">Exit</a>
        </header>

        <!-- Main -->
        <section id="main">

            <!-- Thumbnails -->
            <section class="thumbnails">
                <div>
                    <a href="welcome/images/fulls/01.jpg">
                        <img src="welcome/images/thumbs/01.jpg" alt="" />
                    </a>
                    <a href="welcome/images/fulls/02.jpg">
                        <img src="welcome/images/thumbs/02.jpg" alt="" />
                    </a>
                </div>
                <div>
                    <a href="welcome/images/fulls/03.jpg">
                        <img src="welcome/images/thumbs/03.jpg" alt="" />
                    </a>
                    <a href="welcome/images/fulls/04.jpg">
                        <img src="welcome/images/thumbs/04.jpg" alt="" />
                    </a>
                    <a href="welcome/images/fulls/05.jpg">
                        <img src="welcome/images/thumbs/05.jpg" alt="" />
                    </a>
                </div>
                <div>
                    <a href="welcome/images/fulls/06.jpg">
                        <img src="welcome/images/thumbs/06.jpg" alt="" />
                    </a>
                    <a href="welcome/images/fulls/07.jpg">
                        <img src="welcome/images/thumbs/07.jpg" alt="" />
                    </a>
                </div>
            </section>

        </section>
    </div>

    <!-- Scripts -->
    <script src="welcome/assets/js/jquery.min.js"></script>
    <script src="welcome/assets/js/jquery.poptrox.min.js"></script>
    <script src="welcome/assets/js/skel.min.js"></script>
    <script src="welcome/assets/js/main.js"></script>
    
    
    
    <!-- <script src="webjars/jquery/3.4.1/jquery.min.js"></script>
    <script src="webjars/bootstrap/4.4.1/js/bootstrap.min.js"></script>  -->
</body>
</html>