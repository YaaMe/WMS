<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<!doctype html>
<html>

<head>
  <title>unquote</title>
  <meta name="viewport" content="width=device-width, minimum-scale=1.0, initial-scale=1.0, user-scalable=yes">
  <script src="../components/platform/platform.js"></script>
  <link rel="import" href="../boot">
  <link href="../../style/bootstrap.css" rel="stylesheet">
  <link href="../../style/font-awesome.css" rel="stylesheet">
  <link href="../../style/style.css" rel="stylesheet">
  <link href="../../style/bootstrap-responsive.css" rel="stylesheet">
  <link rel="stylesheet" href="../../bootstrap/bootstrap.css">
  <link rel="shortcut icon" href="../../img/favicon/favicon.png">
  <link rel="import" href="../components/paper-checkbox/paper-checkbox.html">
  <link rel="import" href="../components/font-roboto/roboto.html">
  <link rel="import"
    href="../components/core-header-panel/core-header-panel.html">
  <link rel="import"
    href="../components/core-toolbar/core-toolbar.html">
  <link rel="import"
    href="../components/paper-input/paper-input.html" >
  <link rel="import" href="../components/core-input/core-input.html">
  <link rel="import" href="../components/paper-button/paper-button.html">
  <link rel="import"
    href="../components/paper-tabs/paper-tabs.html">
  <style>
    .widget-content{
        border-style: hidden;
    }
      label{
          font-family: "Cabin", Arial, sans-serif;
          color: rgba(145, 153, 211, 1);
      }
    BODY{
        background: url("http://hanyu.iciba.com/upload/encyclopedia_2/d9/bb/bk_d9bbeb4427a7e803450fbaf236e0ac07_ibaCSK.jpg");

    }
  </style>
</head>
<body screen_capture_injected="true">
<div id="inputContainer" style="">
    <div class="admin-form">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <!-- Widget starts -->
                    <div class="widget worange">
                        <!-- Widget head -->
                        <div class="widget-head">
                            <i class="icon-lock"></i> Login
                        </div>

                        <div class="widget-content">
                            <div class="padd">
                                <!-- Login form -->
                                <p class="validatetips"></p>   <!--to show the error -->
                                <form class="form-horizontal" action="login.do" method="post">
                                    <!-- Email -->
                                    <div class="form-group control-group">
                                        <label  class="control-label col-lg-3" >Username</label>

                                        <div class="col-lg-9">
                                            <paper-input floatinglabel="" label="Type only numbers... (floating)" id="username" validate="^[0-9]*$" error="Input is not a number!" class="">

                                                <div id="floatedLabel" class="hidden"><span id="floatedLabelSpan">Type only numbers... (floating)</span></div>

                                                <div id="container" on-transitionend="{{ transitionEndAction }}" on-webkittransitionend="{{ transitionEndAction }}">

                                                    <div id="label" class="" style="-webkit-transform: none;"><span id="labelSpan">Type only numbers... (floating)</span></div>

                                                    <div id="inputContainer">

                                                        <div id="inputClone">
                                                            <span id="inputCloneSpan" aria-hidden="true">&nbsp;</span>
                                                        </div>

                                                        <template if="{{multiline}}"></template>


                                                        <template if="{{multiline}}"></template>

                                                        <template if="{{!multiline}}"></template>
                                                        <input id="input" type="text" placeholder="" aria-labelledby="placeholder" aria-invalid="false" on-change="{{ inputChangeAction }}" on-focus="{{ focusAction }}" on-blur="{{ blurAction }}">




                                                    </div>

                                                    <div id="underlineContainer">
                                                        <div id="underline"></div>
                                                        <div id="underlineHighlight" class="focusedColor" style="-webkit-transform-origin-x: 226px;"></div>
                                                    </div>

                                                    <div id="caret" style="left: 4px;" class="">
                                                        <div id="caretInner" class="focusedColor"></div>
                                                    </div>

                                                </div>

                                                <div id="errorContainer">
                                                    <div id="error" role="alert" aria-hidden="true">Input is not a number!</div>
                                                    <div id="errorIcon"></div>
                                                </div>

                                            </paper-input>
                                        </div>
                                    </div>
                                    <!-- Password -->
                                    <div class="form-group control-group">
                                        <label  class="control-label col-lg-3" >Password</label>
                                        <div class="col-lg-9">
                                            <paper-input floatinglabel="" label="Type only numbers... (floating)" validate="[a-zA-Z0-9_]{1,15}$" id="password" error="Input is not a number!" class="">



                                                <div id="floatedLabel" class="hidden"><span id="floatedLabelSpan">Type only numbers + letters... (floating)</span></div>

                                                <div id="container" on-transitionend="{{ transitionEndAction }}" on-webkittransitionend="{{ transitionEndAction }}">

                                                    <div id="label" class="" style="-webkit-transform: none;"><span id="labelSpan">Type only numbers + letters... (floating)</span></div>

                                                    <div id="inputContainer">

                                                        <div id="inputClone">
                                                            <span id="inputCloneSpan" aria-hidden="true">&nbsp;</span>
                                                        </div>

                                                        <template if="{{multiline}}"></template>





                                                        <template if="{{multiline}}"></template>

                                                        <template if="{{!multiline}}"></template>
                                                        <input id="input" type="text" placeholder="" aria-labelledby="placeholder" aria-invalid="false" on-change="{{ inputChangeAction }}" on-focus="{{ focusAction }}" on-blur="{{ blurAction }}">




                                                    </div>

                                                    <div id="underlineContainer">
                                                        <div id="underline"></div>
                                                        <div id="underlineHighlight" class="focusedColor" style="-webkit-transform-origin-x: 226px;"></div>
                                                    </div>

                                                    <div id="caret" style="left: 4px;" class="">
                                                        <div id="caretInner" class="focusedColor"></div>
                                                    </div>

                                                </div>

                                                <div id="errorContainer">
                                                    <div id="error" role="alert" aria-hidden="true">Input is not a number plus letters!</div>
                                                    <div id="errorIcon"></div>
                                                </div>

                                            </paper-input>                                        </div>
                                    </div>
                                    <!-- Remember me checkbox and sign in button -->
                                    <div class="form-group">
                                        <div class="col-lg-8 col-lg-offset-3">
                                            <div horizontal="" layout="">
                                                <paper-checkbox role="checkbox" tabindex="0" aria-checked="false">



                                                    <div id="checkboxContainer" class="">

                                                        <paper-ripple id="ink" class="circle recenteringTouch" checked="">



                                                            <canvas id="canvas" width="152px" height="152px"></canvas></paper-ripple>

                                                        <div id="checkbox" on-animationend="{{ checkboxAnimationEnd }}" on-webkitanimationend="{{ checkboxAnimationEnd }}"></div>

                                                    </div>

                                                    <div id="checkboxLabel" hidden=""></div>

                                                </paper-checkbox>
                                                <div vertical="" layout="" id="remembe">
                                                    <h4>Remember me</h4>
                                                   <!-- <div>Remove all the searches you have ever performed</div> -->
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-lg-9 col-lg-offset-2">
                                        <paper-button raisedbutton="" label="focused" role="button" tabindex="0" class="" id="sign" aria-label="focused">



                                            <template if="{{raisedButton}}"></template>
                                            <div fit="" id="shadow-container" style="overflow: visible;"><div class="paper-shadow paper-shadow-animated paper-shadow-bottom-z-1"></div><div class="paper-shadow paper-shadow-animated paper-shadow-top-z-1"></div>
                                                <paper-shadow id="shadow" z="1" animated=""></paper-shadow>
                                            </div>


                                            <div id="clip">
                                                <div id="focusBg"></div>
                                                <paper-ripple id="ripple">



                                                    <canvas id="canvas" width="320px" height="70px"></canvas></paper-ripple>
                                                <div id="sign">
                                                    <template if="{{iconSrc || icon}}"></template>
                                                    <template if="{{label}}"></template>
                                                    <span>Login</span>

                                                </div>
                                            </div>

                                        </paper-button>

                                        <paper-button raisedbutton="" label="focused" role="button" tabindex="0" class="" aria-label="focused" id="reset">

                                            <template if="{{raisedButton}}"></template>
                                            <div fit="" id="shadow-container" style="overflow: visible;"><div class="paper-shadow paper-shadow-animated paper-shadow-bottom-z-1"></div><div class="paper-shadow paper-shadow-animated paper-shadow-top-z-1"></div>
                                                <paper-shadow id="shadow" z="1" animated=""></paper-shadow>
                                            </div>


                                            <div id="reset">
                                                <div id="focusBg"></div>
                                                <paper-ripple id="ripple">

                                                    <canvas id="canvas" width="320px" height="70px"></canvas></paper-ripple>
                                                <div id="content_reset">
                                                    <template if="{{iconSrc || icon}}"></template>
                                                    <template if="{{label}}"></template>
                                                    <span>Reset</span>
                                                </div>
                                            </div>

                                        </paper-button>
                                    </div>
                                  <br />
                                </form>

                            </div>
                        </div>

                        <div class="widget-foot">
                            copyright reserved by <a href="javascript:void(0)">bicycle</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

</div>

<script src="../../js/jquery.js"></script>
<script src="../../js/bootstrap.js"></script>
<script>
    var tabs = document.querySelector('paper-tabs');
    tabs.addEventListener('core-select', function() {
      console.log("Selected: " + tabs.selected);
    });
  </script>
  <script>
    $(document).ready(function(){
        $("#sign").click(function(){
           $.post("http://localhost:8080/WMS/login.do",
           {
              username:$("#username").val(),
              password:$("#password").val()
           },
           function(data,status){
            if(<%=request.getSession().getAttribute("status")%>==1){
             location.href="checker.jsp";
            }
            else{
            	alert("something wrong!");
            }
           }
           )
        })
    })
  </script>

</body>

</html>
