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

    <div class="tlinks">Collect from <a href="http://www.cssmoban.com/" >建站模板</a></div>
    <div class="parallax-content projects-content" id="portfolio">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div id="owl-testimonials" class="owl-carousel owl-theme">
                        <div class="item">
                            <div class="testimonials-item">
                                <a href="./static/img/1st-big-item.jpg" data-lightbox="image-1"><img src="./static/img/1st-item.jpg" alt=""></a>
                                <div class="text-content">
                                    <h4>很棒的笔记本</h4>
                                    <span>$18.00</span>
                                </div>
                            </div>
                        </div>
                        <div class="item">
                            <div class="testimonials-item">
                                <a href="./static/img/2nd-big-item.jpg" data-lightbox="image-1"><img src="./static/img/2nd-item.jpg" alt=""></a>
                                <div class="text-content">
                                    <h4>古董装饰照片</h4>
                                    <span>$27.00</span>
                                </div>
                            </div>
                        </div>
                        <div class="item">
                            <div class="testimonials-item">
                                <a href="./static/img/3rd-big-item.jpg" data-lightbox="image-1"><img src="./static/img/3rd-item.jpg" alt=""></a>
                                <div class="text-content">
                                    <h4>工作手包</h4>
                                    <span>$36.00</span>
                                </div>
                            </div>
                        </div>
                        <div class="item">
                            <div class="testimonials-item">
                                <a href="./static/img/4th-big-item.jpg" data-lightbox="image-1"><img src="./static/img/4th-item.jpg" alt=""></a>
                                <div class="text-content">
                                    <h4>智能手表</h4>
                                    <span>$45.00</span>
                                </div>
                            </div>
                        </div>
                        <div class="item">
                            <div class="testimonials-item">
                                <a href="./static/img/5th-big-item.jpg" data-lightbox="image-1"><img src="./static/img/5th-item.jpg" alt=""></a>
                                <div class="text-content">
                                    <h4>PC平板电脑绘图</h4>
                                    <span>$63.00</span>
                                </div>
                            </div>
                        </div>
                        <div class="item">
                            <div class="testimonials-item">
                                <a href="./static/img/6th-big-item.jpg" data-lightbox="image-1"><img src="./static/img/6th-item.jpg" alt=""></a>
                                <div class="text-content">
                                    <h4>健康的奶昔</h4>
                                    <span>$77.00</span>
                                </div>
                            </div>
                        </div>
                        <div class="item">
                            <div class="testimonials-item">
                                <a href="./static/img/2nd-big-item.jpg" data-lightbox="image-1"><img src="./static/img/2nd-item.jpg" alt=""></a>
                                <div class="text-content">
                                    <h4>古董装饰照片</h4>
                                    <span>$84.50</span>
                                </div>
                            </div>
                        </div>
                        <div class="item">
                            <div class="testimonials-item">
                                <a href="./static/img/1st-big-item.jpg" data-lightbox="image-1"><img src="./static/img/1st-item.jpg" alt=""></a>
                                <div class="text-content">
                                    <h4>令人敬畏的笔记本</h4>
                                    <span>$96.75</span>
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
                        <p>请不要在模板收集站点上重新分发我们的模板ZIP文件。 您可以制作屏幕截图并返回我们网站的链接。 此模板可供最终用户用于个人或商业目的。</p>
                      </div>
                      <div id="tab2">
                        <img src="./static/img/2nd-tab.jpg" alt="">
                        <p>测试测试 测试测试测试测试 测试测试测试测试 测试测试测试测试 测试测试测试测试 测试测试测试测试 测试测试测试测试 测试测试测试测试 测试测试测试测试 测试测试.</p>
                      </div>
                      <div id="tab3">
                        <img src="./static/img/3rd-tab.jpg" alt="">
                        <p>测试测试 测试测试测试测试 测试测试测试测试 测试测试测试测试 测试测试测试测试 测试测试测试测试 测试测试测试测试 测试测试测试测试 测试测试测试测试 测试测试.</p>
                      </div>
                      <div id="tab4">
                        <img src="./static/img/4th-tab.jpg" alt="">
                        <p>测试测试 测试测试测试测试 测试测试测试测试 测试测试测试测试 测试测试测试测试 测试测试测试测试 测试测试测试测试 测试测试测试测试 测试测试测试测试 测试测试.</p>
                      </div>
                    </section>
                    <ul class="tabs clearfix" data-tabgroup="first-tab-group">
                      <li><a href="#tab1" class="active">2008 - 2014</a></li>
                      <li><a href="#tab2">2014 - 2016</a></li>
                      <li><a href="#tab3">2016 - 2019</a></li>
                      <li><a href="#tab4">2019 - Now</a></li>
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
                    <ul>
                        <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                        <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                        <li><a href="#"><i class="fa fa-linkedin"></i></a></li>
                        <li><a href="#"><i class="fa fa-google"></i></a></li>
                        <li><a href="#"><i class="fa fa-dribbble"></i></a></li>
                    </ul>
                    <p>Copyright &copy; 2019 Company Name

            		- Design: <a rel="nofollow noopener" href="#"><em>TemplateMo</em></a> - More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">测试测试测试</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></p>
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