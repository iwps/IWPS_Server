<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String appPath = request.getContextPath(); %>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title>智能游泳馆系统</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="apple-touch-icon" href="./ico/favicon128.ico">

        <link rel="stylesheet" href="./static/css/bootstrap.min.css">
        <link rel="stylesheet" href="./static/css/fontAwesome.css">
        <link rel="stylesheet" href="./static/css/hero-slider.css">
        <link rel="stylesheet" href="./static/css/templatemo-main.css">
        <link rel="stylesheet" href="./static/css/owl-carousel.css">

        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800" rel="stylesheet">

        <script src="./static/js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
    </head>
<body>

    <div class="fixed-side-navbar">
        <ul class="nav flex-column">
            <li class="nav-item"><a class="nav-link" href="#home"><span>简介</span></a></li>
            <li class="nav-item"><a class="nav-link" href="#services"><span>服务</span></a></li>
            <li class="nav-item"><a class="nav-link" href="#portfolio"><span>功能</span></a></li>
            <li class="nav-item"><a class="nav-link" href="#our-story"><span>其他</span></a></li>
            <li class="nav-item"><a class="nav-link" href="#contact-us"><span>反馈</span></a></li>
        </ul>
    </div>

    <div class="parallax-content baner-content" id="home">
        <div class="container">
            <div class="first-content">
                <h1>智能游泳馆系统</h1>
                <span><em>IWPS</em> 信息汇聚系统</span>
                <div class="primary-button">
                    <a href="#services">了解详情</a>
                </div>
                <div class="primary-button">
                    <a href="./html/index.html">立刻登录</a>
                </div>
            </div>
        </div>
    </div>


    <div class="service-content" id="services">
        <div class="container">
            <div class="row">
                <div class="col-md-4">
                    <div class="left-text">
                        <h4>智能游泳馆</h4>
                        <div class="line-dec"></div>
                        <p><a rel="nofollow" href="#">智能游泳馆</a>是一个为游泳馆的游泳池资源管理的平台，web部分可为管理员提供高效的管理服务。</p>
                        <ul>
                            <li>- 超级管理员对总体数据的控制 </li>
                            <li>- 普通管理员对其所在游泳馆的控制 </li>
                            <li>- 用户端查看游泳馆的使用情况 </li>
                            <li>- 误入深水区，入水危险、水温检测以及报警等功能 </li>
                        </ul>
                        <div class="primary-button">
                            <a href="#portfolio">了解我们的更多信息</a>
                        </div>
                    </div>
                </div>
                <div class="col-md-8">
                    <div class="row">
                        <div class="col-md-6">
                            <div class="service-item">
                                <h4>康乃馨</h4>
                                <div class="line-dec"></div>
                                <p>负责文档的撰写与部分的硬件的协调。</p>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="service-item">
                                <h4>李宏辉</h4>
                                <div class="line-dec"></div>
                                <p>负责Android端的开发工作和硬件的协调。</p>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="service-item">
                                <h4>闫烁</h4>
                                <div class="line-dec"></div>
                                <p>负责ZigBee、RFID与传感器的运作和服务器的通信(WIFI)。</p>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="service-item">
                                <h4>金浩</h4>
                                <div class="line-dec"></div>
                                <p>负责服务器的前端与后端的搭建工作.</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div class="tlinks">Collect from <a href="http://www.cssmoban.com/" ></a></div>
    <div class="parallax-content projects-content" id="portfolio">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div id="owl-testimonials" class="owl-carousel owl-theme">
                        <div class="item">
                            <div class="testimonials-item">
                                <a href="./static/img/p1.png" data-lightbox="image-1"><img src="./static/img/p2.png" alt=""></a>
                                <div class="text-content">
                                    <h4>服务器</h4>
                                    <span>spring+springMVC+mybatis</span>
                                </div>
                            </div>
                        </div>
                        <div class="item">
                            <div class="testimonials-item">
                                <a href="./static/img/p2.png" data-lightbox="image-1"><img src="./static/img/p2.png" alt=""></a>
                                <div class="text-content">
                                    <h4>硬件</h4>
                                    <span>多种传感器组合</span>
                                </div>
                            </div>
                        </div>
                        <div class="item">
                            <div class="testimonials-item">
                                <a href="./static/img/p3.png" data-lightbox="image-1"><img src="./static/img/p3.png" alt=""></a>
                                <div class="text-content">
                                    <h4>移动端</h4>
                                    <span>Android端开发</span>
                                </div>
                            </div>
                        </div>
                        <div class="item">
                            <div class="testimonials-item">
                                <a href="./static/img/p4.png" data-lightbox="image-1"><img src="./static/img/p4.png" alt=""></a>
                                <div class="text-content">
                                    <h4>项目简述</h4>
                                    <span>项目的大致作用</span>
                                </div>
                            </div>
                        </div>
                        <div class="item">
                            <div class="testimonials-item">
                                <a href="./static/img/p5.png" data-lightbox="image-1"><img src="./static/img/p5.png" alt=""></a>
                                <div class="text-content">
                                    <h4>截图展示</h4>
                                    <span>效果展示</span>
                                </div>
                            </div>
                        </div>
                        <div class="item">
                            <div class="testimonials-item">
                                <a href="./static/img/p6s.jpg" data-lightbox="image-1"><img src="./static/img/p6s.jpg" alt=""></a>
                                <div class="text-content">
                                    <h4>服务器截图</h4>
                                    <span>后台主页</span>
                                </div>
                            </div>
                        </div>
                        <div class="item">
                            <div class="testimonials-item">
                                <a href="./static/img/p7s.png" data-lightbox="image-1"><img src="./static/img/p7s.png" alt=""></a>
                                <div class="text-content">
                                    <h4>服务器截图</h4>
                                    <span>后台管理</span>
                                </div>
                            </div>
                        </div>
                        <div class="item">
                            <div class="testimonials-item">
                                <a href="./static/img/p8s.jpg" data-lightbox="image-1"><img src="./static/img/p8s.jpg" alt=""></a>
                                <div class="text-content">
                                    <h4>移动端截图</h4>
                                    <span>信息界面</span>
                                </div>
                            </div>
                        </div>
                        <div class="item">
                            <div class="testimonials-item">
                                <a href="./static/img/p9s.jpg" data-lightbox="image-1"><img src="./static/img/p9s.jpg" alt=""></a>
                                <div class="text-content">
                                    <h4>移动端截图</h4>
                                    <span>报警界面</span>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>


    <div class="tabs-content" id="our-story">
        <div class="container">
            <div class="row">
                <div class="col-md-8 mx-auto">
                    <div class="wrapper">
                    <section id="first-tab-group" class="tabgroup">
                      <div id="tab1">
                        <img src="./static/img/1st-tab.jpg" alt="">
                        <p>用户与救生员可在移动平台登录与注册。并在移动端查看响应的信息，能够查看部分游泳池和游泳馆的信息并对一些信息进行。</p>
                      </div>
                      <div id="tab2">
                        <img src="./static/img/2nd-tab.jpg" alt="">
                        <p>服务器能够按照不同角色对不同的模型进行管理，并在线上以可视化的方式对数据进行观测。</p>
                      </div>
                      <div id="tab3">
                        <img src="./static/img/3rd-tab.jpg" alt="">
                        <p>硬件端使用了RFID/ZigBee/温湿度传感器/压力传感器。利用zigBee自组网的特性将终端节点和协调器/路由定义到用户和游泳池上，来做信息标记</p>
                      </div>
                      <div id="tab4">
                        <img src="./static/img/4th-tab.jpg" alt="">
                        <p>web前端方面还有改进的空间，硬件和服务器的通信也有改进空间。</p>
                      </div>
                    </section>
                    <ul class="tabs clearfix" data-tabgroup="first-tab-group">
                      <li><a href="#tab1" class="active">移动端</a></li>
                      <li><a href="#tab2">服务器端</a></li>
                      <li><a href="#tab3">硬件端</a></li>
                      <li><a href="#tab4">其他</a></li>
                    </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>


    <div class="parallax-content contact-content" id="contact-us">
        <div class="container">
            <div class="row">
                <div class="col-md-6">
                    <div class="contact-form">
                        <div class="row">
                            <form id="contact" action="" method="post">
                                <div class="row">
                                    <div class="col-md-12">
                                      <fieldset>
                                        <input name="name" type="text" class="form-control" id="name" placeholder="你的名字..." required="">
                                      </fieldset>
                                    </div>
                                    <div class="col-md-12">
                                      <fieldset>
                                        <input name="email" type="email" class="form-control" id="email" placeholder="你的邮件..." required="">
                                      </fieldset>
                                    </div>
                                    <div class="col-md-12">
                                      <fieldset>
                                        <textarea name="message" rows="6" class="form-control" id="message" placeholder="你的消息..." required></textarea>
                                      </fieldset>
                                    </div>
                                    <div class="col-md-12">
                                      <fieldset>
                                        <button type="submit" id="form-submit" class="btn">发送消息</button>
                                      </fieldset>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
                <div class="col-md-6">
                </div>
            </div>
        </div>
    </div>

    <footer>
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="primary-button">
                        <a href="#home">回到顶部</a>
                    </div>
                    <p>Copyright &copy; 2019 Company IWPS

                </div>
            </div>
        </div>
    </footer>



    <script src="./static/js/vendor/jquery-3.4.1.min.js"></script>
    <script>window.jQuery || document.write('<script src="./static/js/vendor/jquery-1.11.2.min.js"><\/script>')</script>
    <script src="./static/js/vendor/bootstrap.min.js"></script>
    <script src="./static/js/plugins.js"></script>
    <script src="./static/js/main.js"></script>
    <script>
        function openCity(cityName) {
            var i;
            var x = document.getElementsByClassName("city");
            for (i = 0; i < x.length; i++) {
               x[i].style.display = "none";
            }
            document.getElementById(cityName).style.display = "block";
        }
    </script>

    <script>
        $(document).ready(function(){
          // Add smooth scrolling to all links
          $(".fixed-side-navbar a, .primary-button a").on('click', function(event) {

            // Make sure this.hash has a value before overriding default behavior
            if (this.hash !== "") {
              // Prevent default anchor click behavior
              event.preventDefault();

              // Store hash
              var hash = this.hash;

              // Using jQuery's animate() method to add smooth page scroll
              // The optional number (800) specifies the number of milliseconds it takes to scroll to the specified area
              $('html, body').animate({
                scrollTop: $(hash).offset().top
              }, 800, function(){

                // Add hash (#) to URL when done scrolling (default click behavior)
                window.location.hash = hash;
              });
            } // End if
          });
        });
    </script>

</body>
</html>