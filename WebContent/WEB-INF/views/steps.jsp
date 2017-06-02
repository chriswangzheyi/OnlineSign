<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>
<head lang="en">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta http-equiv="Pragma" content="no-cache">
    <meta http-equiv="Cache-Control" content="no-cache">
    <meta http-equiv="Expires" content="0">
    <meta name="renderer" content="webkit">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="apple-mobile-web-app-capable" content="yes" />

    <title>点餐猫商家签约流程详细说明</title>

    <script type="text/javascript" src="resources/js/jquery.min.js"></script>
    <script type="text/javascript" src="resources/js/jquery.nicescroll.min.js"></script>
    <link rel="stylesheet" href="resources/css/SigningP_common.css"/>
    <link rel="stylesheet" href="resources/css/SigningP_mediaStyle.css"/>
    <script type="text/javascript" src="resources/js/SigningP_conmon.js"></script>
    <script type="text/javascript" src="resources/js/jquery.qrcode.min.js"></script>

    <!--[if lt IE 9]>
    <script type="text/javascript" src="resources/js/html5shiv.min.js"></script>
    <script type="text/javascript" src="resources/js/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<div id="stepBar">
    <ul>
        <li class="active">1.同意协议</li>
        <li>2.填写资料</li>
        <li>3.填写结算</li>
        <li>4.支付费用</li>
    </ul>
</div>
<div id="stepContent">
    <form class="step_form" action="submit" method="post" enctype="multipart/form-data">

<!--第一步-->
    <div class="stepBox_01" style="display: block;">
        <div class="dcm_Protocol">
            <p><h4>《点餐猫商家协议》</h4></p>
            <p><br/></p>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. A alias aliquid blanditiis dolores eos excepturi facilis inventore ipsa libero minus molestias natus nisi obcaecati porro, saepe sequi tempora ullam voluptates?</p>
            <p>点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议</p>
            <p><h4>点餐猫商家协议</h4></p>
            <p><br/></p>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. A alias aliquid blanditiis dolores eos excepturi facilis inventore ipsa libero minus molestias natus nisi obcaecati porro, saepe sequi tempora ullam voluptates?</p>
            <p>点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议</p>
            <p><h4>点餐猫商家协议</h4></p>
            <p><br/></p>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. A alias aliquid blanditiis dolores eos excepturi facilis inventore ipsa libero minus molestias natus nisi obcaecati porro, saepe sequi tempora ullam voluptates?</p>
            <p>点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议点餐猫商家协议</p>

        </div>

        <div class="stepForm_item">
            <input class="agreeBtn" type="checkbox" checked="checked"/> &nbsp;&nbsp;我同意并遵守上述的《点餐猫商家协议》
        </div>
        <a class="step_next istrue">下一步</a>
    </div><!--end 第一步-->




<!--第二步-->
    <div class="stepBox_02" style="display: none;">
        <p class="SigningP_a"><a href="explain" target="_blank">点餐猫商家签约流程详细说明&gt;&gt;</a></p>
        <!--餐厅名称-->
        <div class="stepForm_item">
            <label>餐厅名称：</label>
            <div class="form_box">
                <input id='shop_name' class=" " type="text" name="restaurant_name"/>
            </div>
        </div>
        <!--所在地区-->
        <div class="stepForm_item">
            <label>所在地区：</label>
            <div class="form_box">
                <select class="shopIp_SS" name="restaurant_province">
                    <option value="-1">请选择省市</option>
                    <option>重庆市</option>
                    <option>上海市</option>
                </select>

                <select class="shopIp_DQ" name="restaurant_city">
                    <option value="-1">全部</option>
                    <option>重庆市</option>
                    <option>上海市</option>
                </select>

                <select class="shopIp_QX" name="restaurant_district">
                    <option value="-1">区/县</option>
                    <option>九龙坡区</option>
                    <option>渝北区</option>
                </select>

                <select class="shopIp_JD" name="restaurant_street">
                    <option value="-1">街道</option>
                    <option>石桥铺</option>
                    <option>渝州路</option>
                </select>
            </div>
        </div>
        <!--餐厅类别-->
        <div class="stepForm_item">
            <label>餐厅类别：</label>
            <div class="form_box">
                <select class="shopClass" name="restaurant_type">
                    <option value="-1">火锅</option>
                    <option>中餐</option>
                    <option>海鲜</option>
                </select>
            </div>
        </div>

        <div class="from_hr"></div>

        <!--餐厅地址-->
        <div class="stepForm_item">
            <label>餐厅地址：</label>
            <div class="form_box"  class="shop_mapBox">
                <input class="shop_map" type="text" name="restaurant_address"/>
                <div class="mapBtn">
                    <img src="resources/img/icon_map_32px.png"/>
                    <i class="closeMap">&times;</i>
                </div>
                <div id="allMap"></div>
            </div>
        </div>
        <!--餐厅电话-->
        <div class="stepForm_item">
            <label>餐厅电话：</label>
            <div class="form_box">
                <input class="shop_call" type="text" name="restaurant_tel"/>
            </div>
        </div>
        <!--营业时间-->
        <div class="stepForm_item">
            <label>营业时间：</label>
            <div class="form_box shopHours">
                <input type="text" readonly="readonly" value="" class="shopHours_start" placeholder="开始时间" name="restaurant_opentime"/><i class="time_bar">—</i><input type="text" readonly="readonly" class=" shopHours_end" placeholder="结束时间" name="restaurant_closetime"/>

                <div class="shopHours_List">
                    <div class="shopHours_timeBox">
                        <div class="timeBox_showtime"><span class="time_hh">00</span>:<span class="time_mm">00</span></div>
                        <ul class="hhLIsit"></ul>
                        <span class="shopHours_format">:</span>
                        <ul class="mmLIsit"></ul>
                        <div class="shopHours_timeBox_btns">
                            <a class="timeBox_btns_canc">
                                取消
                            </a><a class="timeBox_btns_conf">
                            确定
                        </a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!--餐厅介绍-->
        <div class="stepForm_item">
            <label>餐厅介绍：</label>
            <div class="form_box">
                <textarea class="shop_int"  rows="5" name="restaurant_indroduction"></textarea>
            </div>
        </div>

        <!--餐厅实拍-->
        <div class="stepForm_item">
            <label>餐厅实拍：</label>
            <div class="form_box">
                <!--    照片添加    -->
                

               <div class="z_photo">
                    <div class="z_file">
                    	
                        <input type="file" id="file" class="shopimg" multiple="multiple" name="viewfiles" />
                        <br><br><br>
                        <input type="submit" value="提交111111">
                    </div>
                </div>



                
                <!--遮罩层-->
                <div class="z_mask">
                    <!--弹出框-->
                    <div class="z_alert">
                        <p>确定要删除这张图片吗？</p>
                        <p>
                            <span class="z_cancel">取消</span>
                            <span class="z_sure">确定</span>
                        </p>
                    </div>
                </div>
            </div>
        </div><!-- end 餐厅实拍-->
        <div class="from_hr"></div>

        <!--店长手机-->
        <div class="stepForm_item">
            <label>店长手机：</label>
            <div class="form_box">
                <input type="text" class="callInput" name="manager_phone" /><a class="callTest">验证码</a>
                <p class="explain">用于接收流水及结算数据报告</p>
            </div>
        </div>
        <div class="stepForm_item">
            <label>短信验证码：</label>
            <div class="form_box">
                <input type="text" class=""/>
            </div>
        </div>

        <div class="from_hr"></div>

        <!--店长手机-->
        <div class="stepForm_item">
            <label>老板手机：</label>
            <div class="form_box">
                <input type="text" class="callInput"/><a class="callTest" name="boss_phone">验证码</a>
                <p class="explain">餐厅扫码注册推荐关系的所属</p>
            </div>
        </div>
        <div class="stepForm_item">
            <label>短信验证码：</label>
            <div class="form_box">
                <input type="text" class=""/>
            </div>
        </div>

        <div class="from_hr"></div>
        <!--餐厅工商营业执照-->
        <div class="stepForm_item longItem">
            <label>餐厅工商营业执照：</label>
            <div class="form_box">
                <p class="explain">只支持中国大陆工商局或市场监督管理局颁发的工商营业执照，且必须在有效期内。</p>
                <p class="explain">若办理过三证合一的企业，请上传最新的营业执照。</p>
                <p class="explain">格式要求：原件照片、扫描件或者加盖公章的复印件，支持.jpg .jpeg .bmp .gif .png格式照片，大小不超过5M。</p>
                <div class="busLic_Box">
                    <span class="busLic_text">未选择文件</span>
                    <input class="busLic" type="file" name="licensefile" name="licensefile"/>
                    <span class="busLic_name"></span>
                </div>
                <div class="busLic_img"></div>
            </div>
        </div>


        <!--点餐猫商家合同-->
        <div class="stepForm_item longItem">
            <label>点餐猫商家合同：</label>
            <div class="form_box">
                <p class="explain">格式要求：上传加盖企业公章的原件照片或扫描件，支持.jpg .jpeg .bmp .gif .png格式照片，大小不超过5M。</p>

                <a class="DCMcontract_downFile" href="downloadcontract">下载合同</a>
                <div class="DCMcontract_Box">
                    <span class="DCMcontract_text">未选择文件</span>
                    <input class="DCMcontract" type="file" name="files_temp"/>
                    <span class="DCMcontract_name"></span>
                </div>
                <div class="DCMcontract_img"></div>
            </div>
        </div>

        <div class="from_hr"></div>

        <a class="step_next istrue">下一步</a>
    </div><!--end第二步-->




<!--第三步-->
    <div class="stepBox_03" style="display: none;">
        <p class="SigningP_a"><a href="explain" target="_blank">点餐猫商家签约流程详细说明&gt;&gt;</a></p>
    <!--开户名称-->
        <div class="stepForm_item">
            <label>开户名称：</label>
            <div class="form_box">
                <input class="" type="text" name="bankaccount_name"/>
                <p class="explain">若有对公账户，填写个体工商户对公账户名称。</p>
                <p class="explain">若无对公账户，填写营业执照上经营者个人开户名称。</p>
            </div>
        </div>
    <!--开户银行-->
        <div class="stepForm_item">
            <label>开户银行：</label>
            <div class="form_box">
                <input class="" type="text" name="bankaccount_bank"/>
                <p class="explain">如有个体工商户对公账户，也可填写个体工商户开户银行。</p>
            </div>
        </div>
    <!--开户账号-->
        <div class="stepForm_item">
            <label>开户账号：</label>
            <div class="form_box">
                <input class="" type="text" name="bankaccount_account"/>
                <p class="explain">我们会将本餐厅的线上收款汇入该银行帐号。</p>
            </div>
        </div>

        <div class="from_hr"></div>

        <!--授权委托书-->
        <div class="stepForm_item longItem">
            <label>授权委托书：</label>
            <div class="form_box">
                <p class="explain">格式要求：上传加盖企业公章的原件照片或扫描件，支持.jpg .jpeg .bmp .gif .png格式照片，大小不超过5M。</p>

                <a class="atto_downFile" href="downloadattorney">下载委托书</a>
                <div class="atto_Box">
                    <span class="atto_text">未选择文件</span>
                    <input class="atto" type="file" name="files_temp"/>
                    <span class="atto_name"></span>
                </div>
                <div class="atto_img"></div>
            </div>
        </div>

        <div class="from_hr"></div>

        <a class="step_next istrue">下一步</a>
    </div><!--end第三步-->




<!--第四步-->
    <div class="stepBox_04" style="display: none;">
        <p class="SigningP_a"><a href="explain" target="_blank">点餐猫商家签约流程详细说明&gt;&gt;</a></p>
        <div class="QRcode">
		<div id="payqrcode"></div>
        </div>
        <p class="QR_text"><i class="QR_icon"></i>请使用微信扫描二维码以完成支付。</p>

        <div class="from_hr"></div>
        <div class="moneyBox">
            &yen;1280.00
        </div>
        <div class="from_hr"></div>
        <table class="QR_table">
            <tr>
                <td>交易名称：</td>
                <td>点餐猫合作商家保证金</td>
            </tr>
            <tr>
                <td>
                    创建时间
                </td>
                <td>
                    2017-05-12
                </td>
            </tr>
        </table>
        <div class="from_hr"></div>
        <div class="phone_aboutme">
            <p>客服热线</p>
            <p>400-992-9339</p>
        </div>


    </div><!--end第四步-->

    </form>

</div>


<script>
$(function () {
    //TODO 地图
    //动态引入百度地图api.js

    function loadScript() {
        var script = document.createElement("script");
        script.src = "http://api.map.baidu.com/api?v=2.0&ak=VUOoSQQRO6Asz3EO1P26STSGRsoZX0Fb&callback=initialize";
        document.body.appendChild(script);
        var script01 = document.createElement("script");
        script01.src = "http://developer.baidu.com/map/jsdemo/demo/convertor.js";
        document.body.appendChild(script01);

    }
    window.onload = loadScript;


    function initialize(){
        /**************************百度地图API************************/
        // 百度地图API功能
        var x = 106.576547;
        var y = 29.646387;
        //地图初始化
        var map = new BMap.Map("allMap",{
            enableMapClick: false       //禁止百度自己的InfoWindow(信息窗口弹出)
        });
        var point = new BMap.Point(x,y);
        map.centerAndZoom(point, 18);

        map.addControl(new BMap.NavigationControl());

        //创建点餐猫地标
        var myIcon_dcm = new BMap.Icon("img/map_icon.png", new BMap.Size(30,30));

        // 将标注添加到地图中
        map.addOverlay(new BMap.Marker(point));

        var geoc = new BMap.Geocoder();

        map.addEventListener("click", function(e){
            var pt = e.point;
            var lng = e.point.lng;
            var lat = e.point.lat;
            $(".shop_map").attr('data-lng',lng);
            $(".shop_map").attr('data-lat',lat);
            geoc.getLocation(pt, function(rs){
                var addComp = rs.addressComponents;
                $('.shop_map').val(addComp.province + "" + addComp.city + "" + addComp.district + "" + addComp.street + "" + addComp.streetNumber);
                var allOverlay = map.getOverlays();
                for (var i = 0; i < allOverlay.length; i++){
                    map.removeOverlay(allOverlay[i]); //删除标注点
                }

                var marker_DCM01 = new BMap.Marker(
                        new BMap.Point(lng,lat),
                        {icon:myIcon_dcm,offset: new BMap.Size(3.75, -15)});  // 创建标注

                map.addOverlay(marker_DCM01);              // 将标注添加到地图中
                //marker_DCM01.enableDragging();          //可拖拽
            });
        });


        $(".shop_map").on('input propertychange', function () {
            console.log($(this).val());
            var myGeo = new BMap.Geocoder();
            myGeo.getPoint($(this).val(), function(point){
                if (point) {
                    var lng = point.lng;
                    var lat = point.lat;
                    map.centerAndZoom(point, 16);
                    var marker_DCM02 = new BMap.Marker(
                            new BMap.Point(lng,lat),
                            {icon:myIcon_dcm,offset: new BMap.Size(3.75, -15)});  // 创建标注
                    map.clearOverlays();
                    map.addOverlay(marker_DCM02);

                    $(".shop_map").attr('data-lng',lng);
                    $(".shop_map").attr('data-lat',lat);
                }else{
                    //alert("您选择地址没有解析到结果!");
                }
            }, "重庆市");

        });

    }

    function openMapFun(){//开启地图
        $('.closeMap').fadeIn(200);
        $('#allMap').slideDown(200);
        setTimeout(function () {
            if($('#allMap:visible').size()>0){
                initialize();
            }
        },200);

    }
    function closeMapFun(){//关闭地图
        $('.closeMap').fadeOut(200);
        $('#allMap').slideUp(200);

    }

    $('.mapBtn').on('click', function (e) {
        if(e.target.nodeName == 'IMG'){
            if($('#allMap:visible').size()<=0){
                openMapFun();//开启地图
            }
        }
        if(e.target.nodeName == 'I'){
            closeMapFun();//关闭地图
        }
    });
    //当地图地址输入框获得焦点时
    $(".shop_map").bind('focus',function () {
        openMapFun();//开启地图
    });
    
    //生成二维码
    jQuery(function(){
	jQuery('#payqrcode').qrcode("http://baidu.com");
	})



});
</script>
</body>
</html>