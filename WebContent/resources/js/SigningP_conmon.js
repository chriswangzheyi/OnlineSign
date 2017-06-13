/**
 *点餐猫商家签约流程
 * **/

//TODO 判断当前浏览器版本(对不支持FileReader()的低版本浏览器 进行提示)
function BrowserFun(){
    var Sys = {};
    var ua = navigator.userAgent.toLowerCase();
    var s;
    (s = ua.match(/msie ([\d.]+)/)) ? Sys.ie = s[1] :
        (s = ua.match(/firefox\/([\d.]+)/)) ? Sys.firefox = s[1] :
            (s = ua.match(/chrome\/([\d.]+)/)) ? Sys.chrome = s[1] :
                (s = ua.match(/opera.([\d.]+)/)) ? Sys.opera = s[1] :
                    (s = ua.match(/version\/([\d.]+).*safari/)) ? Sys.safari = s[1] : 0;

    //以下对不支持FileReader()的低版本浏览器 进行提示
    //支持FileReader()参考网址——http://caniuse.mojijs.com/Home/Html/item/key/filereader/index.html
    var SysT="浏览器版本过低！请升级浏览器或者更换其他浏览器。";
    if (Sys.ie){parseFloat(Sys.ie)<10 && alert(SysT);}
    if (Sys.firefox){parseFloat(Sys.firefox)<3.6 && alert(SysT);}
    if (Sys.chrome){parseFloat(Sys.chrome)<6 && alert(SysT);}
    if (Sys.opera){parseFloat(Sys.opera)<11.1 && alert(SysT);}
    if (Sys.safari){parseFloat(Sys.safari)<6 && alert(SysT);}
}
BrowserFun();

//决定定位的div 可以通过drag() 拖动元素。（封装到$）
$.fn.extend({
    drag: function(){
        this.on('mousedown',function(e){
            $(this).css('position','absolute');
            var disX = e.clientX - $(this).position().left,
                disY = e.clientY - $(this).position().top,
                $self = $(this);
            $(document).on('mousemove',function(e){
                $self.css('left',e.clientX - disX);
                $self.css('top',e.clientY - disY);
            })
            $(document).on('mouseup',function(){
                $(document).off();
            })
        });
    }
});
// TODO 自定义滚动条样式
function windowHeigthChange(){
    //$("html").niceScroll({
    //    cursorborder:"",            //滚动条边框，默认“1px solid #fff”
    //    cursorcolor:"#363f45",      //滚动条颜色，默认“#424242”
    //    cursorwidth:"8px",          //滚动条宽度，默认“5px”
    //    zindex:"2000",              //滚动条位置层级显示，默认“auto”
    //    cursoropacitymax:0.5        //滚动条不透明度，默认“1”
    //});
    $(".hhLIsit").size()>0 && $(".hhLIsit").niceScroll({cursorborder:"",cursoropacitymax:0.5,cursorcolor:"#363f45"});
    $(".mmLIsit").size()>0 && $(".mmLIsit").niceScroll({
        cursorborder:"",
        cursoropacitymax:0.5,
        cursorcolor:"#363f45",
        horizrailenabled:false,
        zindex:"2000"
    });
    $(".shopHours_List ul").size()>0 && $(".shopHours_List ul").niceScroll({
        cursorborder:"",
        cursoropacitymax:0.5,
        cursorcolor:"#363f45",
        horizrailenabled:false,
        zindex:"2000"
    });
}


$(function () {

    // 获取窗口高度
    var winHeight=500;
    function getWinHeightFun(){
        if (window.innerHeight){
            winHeight = window.innerHeight;
        } else if ((document.body) && (document.body.clientHeight)){
            winHeight = document.body.clientHeight;
        }

        //第一步的“商家协议”DIV高度随浏览器高度自适应
        $('.dcm_Protocol').height(winHeight-230);
        $('.dcm_Protocol').css({
            'minHeight':'200px'
        });
    }
    getWinHeightFun();
    windowHeigthChange();//自定义滚动条
    $(window).resize(function () {
        getWinHeightFun();
        windowHeigthChange();//自定义滚动条

    });


    //当前闪烁特效方法
    function twinkleFun(el){
        var timer=null;
        var i=0;
        clearInterval(timer);
        timer=setInterval(function(){
            $(el).css('visibility',(i++%2?"hidden":"visible"));
            i>8&&clearInterval(timer);
        },80);
    }

    //点击下一步的交互效果
    function nextClickFun(el){
        el.slideUp(200);
        el.next().fadeIn(200);
        setTimeout(function () {
            $('#stepBar ul .active').removeClass('active')
                .next().addClass('active');
        },200);

        $('html, body').animate({scrollTop:0}, 200);//滚动条滚动至顶部
    }

    //第一步里 的同意协议勾选状态与“下一步”按钮状态交互
    function step01TestFun(){
        if($('.agreeBtn')[0].checked == false){
            $('.step_next').removeClass('istrue');
        }else{
            $('.step_next').addClass('istrue');
        }
    }
    step01TestFun();
    $('#stepContent').on('change','.agreeBtn',function () {
        step01TestFun();
    });


// TODO 第二步里的时间弹层
    //TODO 营业时间
    //时间列表生成方法
    function listTimeFun(ul_elem/*添加的ul*/,min/*最小时间*/,max/*最大时间*/){
        if(ul_elem.size()>0){
            var _html='';
            for(var i=min;i<=max;i++){
                i = i<10?'0'+i:i;
                _html += ('<li>'+i+'</li>');
            }
            ul_elem.html(_html);
        }
    }

    //根据时间的传值再定格式的值
    function hhmmFun(str){
        if(str ==null ||str==""){
            return '00:00';
        }else{
            var arry = str.split(':');
            return arry[0]+':'+arry[1];
        }
    }

    //点击输入框弹出时间弹层
    var elem;
    $('.shopHours').on('click','input', function () {
        elem = $(this);
        var inputV = $(this).val();

        var input_start = $('.shopHours_start').val();//点击时 “开始”输入框里的值
        var input_end = $('.shopHours_end').val();//点击时 “结束”输入框里的值

        //分钟列表生成
        listTimeFun($('.mmLIsit'),0,59);
        listTimeFun($('.hhLIsit'),0,23);

        if(inputV ==null ||inputV==""){
            $('.time_hh').text($('.hhLIsit li:first-of-type').text());
            $('.time_mm').text($('.mmLIsit li:first-of-type').text());
        }else{
            var timeAR = inputV.split(':');
            $('.time_hh').text(timeAR[0]);
            $('.time_mm').text(timeAR[1]);
        }

        $('.hhLIsit li').each(function () {
            if($(this).text() == $('.time_hh').text()){
                $(this).addClass('active');
            }
        });
        $('.mmLIsit li').each(function () {
            if($(this).text() == $('.time_mm').text()){
                $(this).addClass('active');
            }
        })
        $('.shopHours_List').show();
        console.log($(".hhLIsit li.active").index());
        $('.hhLIsit').animate({
            scrollTop: $(".hhLIsit li.active").index()*35+'px'
        }, 500);
        $('.mmLIsit').animate({
            scrollTop: $(".mmLIsit li.active").index()*35+'px'
        }, 500);
    });

    //选择时间功能
    $('.shopHours_timeBox ul').on('click','li', function () {
        $(this).siblings('.active').removeClass('active');
        $(this).addClass('active');
        var t = $(this).text();
        if( $(this).parent()[0].className == 'hhLIsit' ){
            $('.time_hh').text(t);
            twinkleFun($('.time_hh'));
        }
        if( $(this).parent()[0].className == 'mmLIsit' ){
            $('.time_mm').text(t);
            twinkleFun($('.time_mm'));
        }
    });

    // 弹层退出后 传值
    function timeBoxExitFun(){
        return $('.time_hh').text()+':'+$('.time_mm').text();
    }
    //时间选择弹层取消 退出
    $('.shopHours_timeBox').on('click','.timeBox_btns_canc', function () {

        $('.shopHours_List').hide();
    });
    //时间选择弹层确定 退出
    $('.shopHours_timeBox').on('click','.timeBox_btns_conf', function () {
        elem.val(timeBoxExitFun());
        $('.shopHours_List').hide();
    });

    $('.shopHours_timeBox').drag();//可拖动


//TODO end 时间弹层


//TODO 点击下一步交互
    $('#stepContent').on('click','.step_next',function () {
        //按钮非点击状态
        if(!$(this).hasClass('istrue')){
            //第一步不能点击的闪烁提示点
            twinkleFun($('.stepBox_01 .stepForm_item'));

            return false;
        }
        var parentCl = $(this).parent();
        nextClickFun(parentCl);
//  如果当前是第一步
//        if(parentCl.hasClass('stepBox_01')){
//            step01TestFun();
//        }

    });



//TODO 多图片上传（餐厅实拍）
    function imgChange(obj1, obj2) {
        //获取点击的文本框
        var file = document.getElementById("file");
        //存放图片的父级元素
        var imgContainer = document.getElementsByClassName(obj1)[0];
        //获取的图片文件
        var fileList = file.files;
        console.log(1231);
        //文本框的父级元素
        var input = document.getElementsByClassName(obj2)[0];
        var imgArr = [];
        //遍历获取到得图片文件
        for (var i = 0; i < fileList.length; i++) {
            var imgUrl = window.URL.createObjectURL(file.files[i]);
            if(!/\.(gif|jpg|jpeg|png|GIF|JPG|PNG)$/.test(file.files[i].name)){
                alert("您上传的图片格式不正确，请重新选择!");
                return false;
            }else{
                imgArr.push(imgUrl);
                var img = document.createElement("img");
                img.setAttribute("src", imgArr[i]);
                var imgAdd = document.createElement("div");
                imgAdd.setAttribute("class", "z_addImg");
                imgAdd.appendChild(img);
                imgContainer.appendChild(imgAdd);
            }
        }
        imgRemove();
    };

    function imgRemove() {
        var imgList = document.getElementsByClassName("z_addImg");
        var mask = document.getElementsByClassName("z_mask")[0];
        var cancel = document.getElementsByClassName("z_cancel")[0];
        var sure = document.getElementsByClassName("z_sure")[0];
        for (var j = 0; j < imgList.length; j++) {
            imgList[j].index = j;
            imgList[j].onclick = function() {
                var t = this;
                mask.style.display = "block";
                cancel.onclick = function() {
                    mask.style.display = "none";
                };
                sure.onclick = function() {
                    mask.style.display = "none";
                    t.style.display = "none";
                };

            }
        };
    };

    $('#stepContent').on('change','.shopimg',function () {
        imgChange('z_photo','z_file');
    });

//TODO 餐厅工商营业执照
    $('#stepContent').on('change','.busLic',function () {
        var _Url = window.URL.createObjectURL(this.files[0]);//图片地址
        var img_name = this.files[0].name;//选择的图片的名称
        if (!/\.(gif|jpg|jpeg|png|GIF|JPG|PNG)$/.test(img_name)){
            alert("您上传的图片格式不正确，请重新选择!");
            return false;
        }else{
            $('.busLic_text').html('已选择文件');
            $('.busLic_name').html(img_name);
            if($('.busLic_img img').size()>0){
                $('.busLic_img img')[0].src = _Url;
            }else{
                $('.busLic_img').append('<img src="'+_Url+'">');
            }
            $('.busLic_img').css({
                'marginTop' : '10px',
                'width'     :'150px',
                'height'    :'150px'
            });
        }
    });

//TODO 点餐猫商家合同
    $('#stepContent').on('change','.DCMcontract',function () {
        var _Url = window.URL.createObjectURL(this.files[0]);//图片地址
        var img_name = this.files[0].name;//选择的图片的名称
        if (!/\.(gif|jpg|jpeg|png|GIF|JPG|PNG)$/.test(img_name)){
            alert("您上传的图片格式不正确，请重新选择!");
            return false;
        }else{
            $('.DCMcontract_text').html('已选择文件');
            $('.DCMcontract_name').html(img_name);
            if($('.DCMcontract_img img').size()>0){
                $('.DCMcontract_img img')[0].src = _Url;
            }else{
                $('.DCMcontract_img').append('<img src="'+_Url+'">');
            }
            $('.DCMcontract_img').css({
                'marginTop' : '10px',
                'width'     :'150px',
                'height'    :'150px'
            });
        }
    });

    //“选择文件”按钮的hover交互
    $('.busLic,.atto,.DCMcontract').size()> 0 && $('.busLic,.atto,.DCMcontract').bind('mouseover mouseout',function (e) {
        if(e.type == 'mouseover'){
            $(this).prev().css({'backgroundColor':'#b3b3b3'});
        }
        if(e.type == 'mouseout'){
            $(this).prev().css({'backgroundColor':'#ccc'});
        }
    });

    //产品选择的交互
    $('.checkboxitem').on('change','input[type="checkbox"]', function () {
        if(this.checked){
            $(this).prev('i.checkbox_icon').addClass('act');
        }else{
            $(this).prev('i.checkbox_icon').removeClass('act');
        }
    });

    //合作方式的交互
    $('.checkboxitem').on('change','input[type="radio"]', function () {
        $('.checkboxitem i.radio_icon').removeClass('act');
        $(this).prev('i.radio_icon').addClass('act');
    });

});

