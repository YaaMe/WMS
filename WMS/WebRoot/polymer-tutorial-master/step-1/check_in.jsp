
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="support.GetData;"%>
<html lang="en"><head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <!-- Title and other stuffs -->
    <title>WMS</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="author" content="">
    <!-- Stylesheets -->
    <link rel="stylesheet" href="../../style/bootstrap.css" >
    <!-- Font awesome icon -->
    <link rel="stylesheet" href="../../style/font-awesome.css">
    <!-- jQuery UI -->
    <link rel="stylesheet" href="../../style/jquery-ui.css">
    <!-- Calendar -->
    <link rel="stylesheet" href="../../style/fullcalendar.css">
    <!-- prettyPhoto -->
    <link rel="stylesheet" href="../../style/prettyPhoto.css">
    <!-- Star rating -->
    <link rel="stylesheet" href="../../style/rateit.css">
    <!-- Date picker -->
    <link rel="stylesheet" href="../../style/bootstrap-datetimepicker.min.css">
    <!-- CLEditor -->
    <link rel="stylesheet" href="../../style/jquery.cleditor.css">
    <!-- Uniform -->
    <link rel="stylesheet" href="../../style/uniform.default.css">
    <!-- Bootstrap toggle -->
    <link rel="stylesheet" href="../../style/bootstrap-switch.css">
    <!-- Main stylesheet -->
    <link href="../../style/style.css" rel="stylesheet">
    <!-- Widgets stylesheet -->
    <link href="../../style/widgets.css" rel="stylesheet">

    <!-- HTML5 Support for IE -->
    <!--[if lt IE 9]>
    <script src="../../js/html5shim.js"></script>
    <![endif]-->

    <!-- Favicon -->
    <link rel="shortcut icon" href="../../img/favicon/favicon.png">
    <style type="text/css">
        .jqstooltip {
            position: absolute;
            left: 0px;
            top: 0px;
            visibility: hidden;
            background: rgb(0, 0, 0) transparent;
            background-color: rgba(0,0,0,0.6);
            filter:progid:DXImageTransform.Microsoft.gradient(startColorstr=#99000000, endColorstr=#99000000);
            -ms-filter: "progid:DXImageTransform.Microsoft.gradient(startColorstr=#99000000, endColorstr=#99000000)";
            color: white;
            font: 10px arial, san serif;text-align: left;white-space: nowrap;padding: 5px;border: 1px solid white;z-index: 10000;}
        .jqsfield {
            color: white;
            font: 10px arial, san serif;text-align: left;}
    </style>
</head>
<body style="">

<div class="navbar navbar-fixed-top bs-docs-nav" role="banner">

    <div class="conjtainer">
        <!-- Menu button for smallar screens -->
        <div class="navbar-header">
            <button class="navbar-toggle btn-navbar" type="button" data-toggle="collapse" data-target=".bs-navbar-collapse">
                <span>Menu</span>
            </button>
            <!-- Site name for smallar screens -->
            <a href="index.html" class="navbar-brand hidden-lg">MacBeth</a>
        </div>



        <!-- Navigation starts -->
        <nav class="collapse navbar-collapse bs-navbar-collapse" role="navigation">
            <!-- Search form -->
            <!-- Links -->
            <ul class="nav navbar-nav pull-right">
                <li class="dropdown pull-right">
                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                        <i class="icon-user"></i> Admin <b class="caret"></b>
                    </a>

                    <!-- Dropdown menu -->
                    <ul class="dropdown-menu">
                        <li><a href="#"><i class="icon-user"></i> Profile</a></li>
                        <li><a href="#"><i class="icon-cogs"></i> Settings</a></li>
                        <li><a href="login.html"><i class="icon-off"></i> Logout</a></li>
                    </ul>
                </li>

            </ul>
        </nav>
    </div>
    
    
    
    
    
    
</div>


<!-- Header starts -->
<header>
    <div class="container">
        <div class="row">

            <!-- Logo section -->
            <div class="col-md-4">
                <!-- Logo. -->
                <div class="logo">
                    <h1><a href="#">WMS<span class="bold"></span></a></h1>
                </div>
                <!-- Logo ends -->
            </div>

            <!-- Button section -->
            <div class="col-md-4">

                <!-- Buttons -->
                <ul class="nav nav-pills">

                    <!-- Comment button with number of latest comments count -->

                    <!-- Message button with number of latest messages count-->
                    <li class="dropdown dropdown-big">
                        <a class="dropdown-toggle" href="#" data-toggle="dropdown">
                            <i class="icon-envelope-alt"></i> Inbox <span class="label label-primary"><%
                            	
                            %></span>
                        </a>

                        <ul class="dropdown-menu">
                            <li>
                                <!-- Heading - h5 -->
                                <h5><i class="icon-envelope-alt"></i> Info</h5>
                                <!-- Use hr tag to add border -->
                                <hr>
                            </li>
                        </ul>
                    </li>
                    <!-- Members button with number of latest members count -->
                </ul>

            </div>

            <!-- Data section -->

            <div class="col-md-4">
                <div class="header-data">

                    <!-- Traffic data -->
                    <div class="hdata">
                        <div class="mcol-left">
                            <!-- Icon with red background -->
                            <i class="icon-signal bred"></i>
                        </div>
                        <div class="mcol-right">
                            <!-- Number of visitors -->
                            <p><a href="#">7000</a> <em>visits</em></p>
                        </div>
                        <div class="clearfix"></div>
                    </div>

                    <!-- Members data -->
                    <div class="hdata">
                        <div class="mcol-left">
                            <!-- Icon with blue background -->
                            <i class="icon-user bblue"></i>
                        </div>
                        <div class="mcol-right">
                            <!-- Number of visitors -->
                            <p><a href="#">3000</a> <em>users</em></p>
                        </div>
                        <div class="clearfix"></div>
                    </div>

                    <!-- revenue data -->
                    <div class="hdata">
                        <div class="mcol-left">
                            <!-- Icon with green background -->
                            <i class="icon-money bgreen"></i>
                        </div>
                        <div class="mcol-right">
                            <!-- Number of visitors -->
                            <p><a href="#">5000</a><em>orders</em></p>
                        </div>
                        <div class="clearfix"></div>
                    </div>

                </div>
            </div>

        </div>
    </div>
</header>

<!-- Header ends -->

<!-- Main content starts -->

<div class="content">

    <!-- Sidebar -->
    <div class="sidebar">
        <div class="sidebar-dropdown"><a href="#">Navigation</a></div>

        <!--- Sidebar navigation -->
        <!-- If the main navigation has sub navigation, then add the class "has_sub" to "li" of main navigation. -->
        <ul id="nav">
            <!-- Main menu with font awesome icon -->
            <li><a href="index.html" ><i class="icon-home"></i> Home</a>
                <!-- Sub menu markup
                <ul>
                  <li><a href="#">Submenu #1</a></li>
                  <li><a href="#">Submenu #2</a></li>
                  <li><a href="#">Submenu #3</a></li>
                </ul>-->
            </li>
            <li><a href="javascript:void(0)"  class="open" id="check" ><i class="icon-bar-chart"></i> Check</a></li>
            <li><a href="forms.html"><i class="icon-tasks"></i> Validate</a></li>
        </ul>
    </div>

    <!-- Sidebar ends -->

    <!-- Main bar -->
    <div class="mainbar">

        <!-- Page heading -->
        <div class="page-head">
            <h2 class="pull-left"><i class="icon-table"></i> Tables</h2>

            <!-- Breadcrumb -->
            <div class="bread-crumb pull-right">
                <a href="index.html"><i class="icon-home"></i> Home</a>
                <!-- Divider -->
                <span class="divider">/</span>
                <a href="#" class="bread-current">home</a>
            </div>

            <div class="clearfix"></div>

        </div>
        <!-- Page heading ends -->

        <!-- Matter -->

        <div class="matter" >
       
            <div class="container">

                <!-- Table -->

                <div class="row">

                    <div class="col-md-12">   <!--the right to show content -->
                        <table class="table">   <!--table to show data -->
                           <tr>
                           <td>trackingno</td>
                           <td>original place</td>
                           <td>destination place</td>
                           <td>kg</td>
                           <td>isintact?</td>
                           <td></td>
                           </tr>
                           <%
                              GetData data=new GetData("vw_readycheck");
                              for(int i=0;i<data.getSize();i++){
                              	out.print("<tr>");
                              	for(int j=0;j<data.getColumnCounts();j++){
                              		out.print("<td id=data"+i+j+">"+data.get(i,j)+"</td>");
                              	}
                              	out.print("<td><input class=input-mini type=text  id=kg"+i+"/></td>");
                              	out.print("<td><input type=checkbox id=c"+i+"  /></td>");
                                out.print("<td><textarea id=text"+i+" rows=3 ></textarea></td>");
                                out.print("<td><a value="+i+" type=button class=btn-warning href=#myModal> <span class=glyphicon-pencil></span>check in</a></td>");
                              	out.print("</tr>"); 
                              }
                               
                            %>
                        </table>
                    </div>

                </div>
			
            </div>
        </div>
    </div>
      
      
      
    <!-- Matter ends -->

    <!-- Mainbar ends -->
    <div id="myModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				   <div class="modal-header">
				    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				  	</div>
				  	<div class="modal-body">
				  	</div>
					<div class="modal-footer">
					    <button class="btn" data-dismiss="modal" aria-hidden="true">关闭</button>
					    <button class="btn btn-primary">Save changes</button>
					</div>
	</div>
  
</div>
<!-- Content ends -->

<!-- Footer starts -->
<footer>
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <!-- Copyright info -->
                <p class="copy">Copyright 2014 | <a href="javascript:void(0)">WMS</a> </p>
            </div>
        </div>
    </div>
</footer>

<!-- Footer ends -->

<!-- Scroll to top -->
<span class="totop" style="display: none;"><a href="#"><i class="icon-chevron-up"></i></a></span>

<!-- JS -->
<script src="../../js/jquery.js"></script> <!-- jQuery -->
<script src="../../js/bootstrap.js"></script> <!-- Bootstrap -->
<script src="../../js/jquery-ui-1.9.2.custom.min.js"></script> <!-- jQuery UI -->
<script src="../../js/fullcalendar.min.js"></script> <!-- Full Google Calendar - Calendar -->
<script src="../../js/jquery.rateit.min.js"></script> <!-- RateIt - Star rating -->
<script src="../../js/jquery.prettyPhoto.js"></script> <!-- prettyPhoto -->

<!-- jQuery Flot -->
<script src="../../js/excanvas.min.js"></script>
<script src="../../js/jquery.flot.js"></script>
<script src="../../js/jquery.flot.resize.js"></script>
<script src="../../js/jquery.flot.pie.js"></script>
<script src="../../js/jquery.flot.stack.js"></script>

<!-- jQuery Notification - Noty -->
<script src="../../js/jquery.noty.js"></script> <!-- jQuery Notify -->
<script src="../../js/themes/default.js"></script> <!-- jQuery Notify -->
<script src="../../js/layouts/bottom.js"></script> <!-- jQuery Notify -->
<script src="../../js/layouts/topRight.js"></script> <!-- jQuery Notify -->
<script src="../../js/layouts/top.js"></script> <!-- jQuery Notify -->
<script src="../../js/jquery-session.js"></script>
<!-- jQuery Notification ends -->

<script src="../../js/sparklines.js"></script> <!-- Sparklines -->
<script src="../../js/jquery.cleditor.min.js"></script> <!-- CLEditor -->
<script src="../../js/bootstrap-datetimepicker.min.js"></script> <!-- Date picker -->
<script src="../../js/jquery.uniform.min.js"></script> <!-- jQuery Uniform -->
<script src="../../js/bootstrap-switch.min.js"></script> <!-- Bootstrap Toggle -->
<script src="../../js/filter.js"></script> <!-- Filter for support page -->
<script src="../../js/custom.js"></script> <!-- Custom codes -->
<script src="../../js/charts.js"></script> <!-- Charts & Graphs -->
<script type="text/javascript">
    $(document).ready(function () {

        /* Bar Chart starts */
        $("").click(function(){
        
        })
        
        

        var d1 = [];
        for (var i = 0; i <= 20; i += 1)
            d1.push([i, parseInt(Math.random() * 30)]);

        var d2 = [];
        for (var i = 0; i <= 20; i += 1)
            d2.push([i, parseInt(Math.random() * 30)]);


        var stack = 0, bars = true, lines = false, steps = false;

        function plotWithOptions() {
            $.plot($("#bar-chart"), [ d1, d2 ], {
                series: {
                    stack: stack,
                    lines: { show: lines, fill: true, steps: steps },
                    bars: { show: bars, barWidth: 0.8 }
                },
                grid: {
                    borderWidth: 0, hoverable: true, color: "#777"
                },
                colors: ["#ff6c24", "#ff2424"],
                bars: {
                    show: true,
                    lineWidth: 0,
                    fill: true,
                    fillColor: { colors: [ { opacity: 0.9 }, { opacity: 0.8 } ] }
                }
            });
        }

        plotWithOptions();

        $(".stackControls input").click(function (e) {
            e.preventDefault();
            stack = $(this).val() == "With stacking" ? true : null;
            plotWithOptions();
        });
        $(".graphControls input").click(function (e) {
            e.preventDefault();
            bars = $(this).val().indexOf("Bars") != -1;
            lines = $(this).val().indexOf("Lines") != -1;
            steps = $(this).val().indexOf("steps") != -1;
            plotWithOptions();
        });

        /* Bar chart ends */

    });


    /* Curve chart starts */

    $(function () {
        var sin = [], cos = [];
        for (var i = 0; i < 14; i += 0.5) {
            sin.push([i, Math.sin(i)]);
            cos.push([i, Math.cos(i)]);
        }

        var plot = $.plot($("#curve-chart"),
                [ { data: sin, label: "sin(x)"}, { data: cos, label: "cos(x)" } ], {
                    series: {
                        lines: { show: true, fill: true},
                        points: { show: true }
                    },
                    grid: { hoverable: true, clickable: true, borderWidth:0 },
                    yaxis: { min: -1.2, max: 1.2 },
                    colors: ["#1eafed", "#1eafed"]
                });

        function showTooltip(x, y, contents) {
            $('<div id="tooltip">' + contents + '</div>').css( {
                position: 'absolute',
                display: 'none',
                top: y + 5,
                left: x + 5,
                border: '1px solid #000',
                padding: '2px 8px',
                color: '#ccc',
                'background-color': '#000',
                opacity: 0.9
            }).appendTo("body").fadeIn(200);
        }

        var previousPoint = null;
        $("#curve-chart").bind("plothover", function (event, pos, item) {
            $("#x").text(pos.x.toFixed(2));
            $("#y").text(pos.y.toFixed(2));

            if ($("#enableTooltip:checked").length > 0) {
                if (item) {
                    if (previousPoint != item.dataIndex) {
                        previousPoint = item.dataIndex;

                        $("#tooltip").remove();
                        var x = item.datapoint[0].toFixed(2),
                                y = item.datapoint[1].toFixed(2);

                        showTooltip(item.pageX, item.pageY,
                                        item.series.label + " of " + x + " = " + y);
                    }
                }
                else {
                    $("#tooltip").remove();
                    previousPoint = null;
                }
            }
        });

      

        $("#curve-chart").bind("plotclick", function (event, pos, item) {
            if (item) {
                $("#clickdata").text("You clicked point " + item.dataIndex + " in " + item.series.label + ".");
                plot.highlight(item.series, item.datapoint);
            }
        });
       

    });

    /* Curve chart ends */
</script>
</body></html>

