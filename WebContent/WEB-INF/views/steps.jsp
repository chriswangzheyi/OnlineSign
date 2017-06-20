<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

    <script type="text/javascript" src="resources/css/layui/layer.js"></script>
    <link rel="stylesheet" href="resources/css/setLayerStyle.css"/>

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
            <p><h4>《点餐猫商户服务协议》</h4></p>
            <p><br/></p>
            <p>本协议是您（以下称“甲方”）与重庆浩品峰电子商务有限公司（以下合称“乙方”）就甲方使用点餐猫平台服务相关事项所订立的有效合约。甲方通过网络页面点击确认或以其他乙方认可的方式接受本协议，即表示甲方与乙方就本协议达成一致并同意接受本协议的全部约定内容。如您不同意接受本协议的任意内容，或者无法准确理解相关条款含义的，请不要进行后续操作。</p>
            <p><br/></p>
            <p>目录</p>
            <p>第一条   定义</p>
            <p>第二条   点餐猫服务</p>
            <p>第二条   点餐猫服务</p>
            <p>第三条   一般性权利义务</p>
            <p>第四条   运营合作</p>
            <p>第五条   服务费用及支付方式</p>
            <p>第五条   服务费用及支付方式</p>
            <p>第六条   点餐猫授权条款</p>
            <p>第七条   免责及有限责任</p>
            <p>第八条   违约责任</p>
            <p>第九条   协议终止</p>
            <p>第十条   其他约定</p>
            
            
            <p><br/></p>
            <p>甲方和乙方在平等、自愿、公平的基础上，经过友好协商，就重庆浩品峰电子商务有限公司运营的点餐猫平台合作事宜所达成以下共识：</p>
            <p><br/></p>
            <p><h4>第一条 定义</h4></p>
            <p>1、点餐猫平台，是指乙方提供网络信息服务及相应软件技术服务的平台，点餐猫平台包括但不限于网址www.hme.cn，或乙方根据业务需要不时修改的URL，以及甲方使用的相应点餐猫客户端软件（如有）、点餐猫平台后台系统等，以下简称点餐猫平台。
            </p>
            <p><br/></p>
            <p>2、点餐猫公司，是重庆浩品峰电子商务有限公司的简称。</p>
            <p><br/></p>
            <p>3、交易流量，指由点餐猫公司所统计的甲方通过附件约定点餐猫服务所完成交易的金额。</p>
            <p><br/></p>
            <p>4、商户制度：指点餐猫在点餐猫平台或其他渠道上已发布或将来发布的各类制度、规则及/或规则条款的统称。</p>
           
            <p><br/></p>
            <p><h4>第二条 点餐猫服务</h4></p>
            <p>1、点餐猫平台服务，乙方基于点餐猫平台为甲方提供的网络信息服务及相应软件技术服务。  </p>
            <p><br/></p>
            <p>2、点餐猫运营服务，甲方可通过乙方运营的工具或平台（包括但不限于点餐猫收银系统、点餐猫店小二APP、商户APP、点餐猫商家后台等，具体的运营工具、运营平台，乙方可根据实际情况调整）向用户展示和/或互动相关信息、配置甲方优惠活动等。
</p>

            <p><br/></p>
            <p><h4>第三条 一般性权利义务</h4></p>
            <p>1、本协议项下，重庆浩品峰电子商务有限公司向甲方提供与点餐猫平台相关网络技术及软件技术服务及与点餐猫平台相关的网络信息服务。  </p>
            <p><br/></p>
            <p>2、甲方应保证其为一家合法成立并有效存续的法人或其它商事主体，能够独立承担法律责任，并具有履行本合同所需的一切权利及能力；同时甲方应当按乙方要求提供有效身份资料。</p>
            <p><br/></p>
            <p>3、甲方同意，对于甲方在使用点餐猫平台过程中提供、上传、形成的信息（包括经营情况、优惠信息、优惠核销信息、图片、评价、文字等），乙方具有所有权和使用权，且乙方有权将上述信息传递给点餐猫等其他相关服务提供者。同时，甲方仍可无条件继续使用上述信息。</p>
            <p><br/></p>
            <p>4、甲方同意，乙方可将甲方数据与其他商户数据进行比较分析，并在不向其他商户透露甲方具体信息的情况下，将分析结果（包括但不限于某一区域内点餐猫平台商户的折扣券核销率等）提供给其他商户和甲方。但分析结果仅供甲方参考，如甲方使用分析结果而产的任何损失与乙方无关。</p>
            <p><br/></p>
            <p>5、甲方不得向乙方或乙方关联公司的员工、顾问提供任何形式的不正当利益，不得贿赂或以其他不正当方式收买、企图收买乙方或乙方关联企业之员工、顾问为甲方提供不正当利益。</p>
            <p><br/></p>
            <p>6、因甲方使用点餐猫平台服务的收款账户有多个，故甲方承诺如乙方需要按照本协议约定从甲方及其甲方设定的甲方门店收款账户中扣取款项的，甲方已就此获得了甲方设定的甲方门店收款账户的账户持有人同意。</p>
            <p>7、甲方理解并同意，并非所有行业的商户都可以在点餐猫平台上展示线上门店，具体可展示线上门店的行业以点餐猫平台实际开放的为准。</p>
            
            <p><br/></p>
            <p><h4>第四条  运营合作</h4></p>
            <p>1、甲乙双方将在合作期间内不定期开展运营活动，运营活动形式包括但不限于一方提供资源、甲乙双方共同投入资源等，具体以甲乙双方通过本协议约定的指定邮箱方式确认或另行签署活动协议确认的活动内容为准。  </p>
            <p><br/></p>
            <p>2、甲方同意，无论甲乙双方任何一方投入资源，只要活动已经对外展示了，甲方均应按照其活动承诺（包括在点餐猫平台的展示、实体门店物料展示等）向用户提供服务，且该类服务的质量不低于甲方提供的其他任何服务。</p>
 			<p><br/></p>
            <p>3、如活动由乙方或关联公司投入资源的，甲方保证其向乙方或点餐猫用户提供的优惠力度不低于甲方在其他渠道或平台（含甲方自有渠道或平台）上发布的优惠力度。如存在特殊情况的，甲方应事先获得乙方同意。</p>
 			<p><br/></p>
            <p>4、在活动中，任何一方及员工不得以任何形式自行或者协助他人套取活动资源、参与作弊、开展虚假交易等，否则守约方有权要求违约方返还已经套取的活动资源或向守约方赔偿同等价值的款项。同时，活动一旦发现有套现、作弊、虚假交易、洗钱等风险的，守约方有权立即停止活动和资源投入并向违约方追回相应损失。</p>
            <p>5、甲方应保留具体运营活动期间的活动资料，包括但不限于活动海报、网站/APP活动截图、现场照片/视频等，且资料内容应当清晰可供辨识，如：提供现场照片的，照片应能够清晰显示活动规则文案。甲方保留前述活动资料应不少于活动结束后六个月，并可根据乙方需要随时配合提供</p>
 			<p><br/></p>
            <p>6、甲方理解并同意，并非所有行业的商户都可以在点餐猫平台上展示线上门店，具体可展示线上门店的行业以点餐猫平台实际开放的为准。</p>
   
            <p><br/></p>
            <p><h4>第五条 服务费用及支付方式</h4></p>
            <p>1、甲方应按照甲方使用附件约定的点餐猫服务所产生的交易流量向乙方支付软件技术服务费（简称“服务费”），服务费的计算标准为：每笔交易流量的20%。  </p>
            <p><br/></p>
            <p>2、服务费的支付方式：甲方不可撤销地授权点餐猫公司在用户使用附件约定点餐猫服务完成交易时，实时从甲方点餐猫账户或甲方设定的甲方门店收款账户中按照本条第1款约定扣取服务费，并支付到重庆浩品峰电子商务有限公司指定的账户。</p>
            <p><br/></p>
            <p>3、甲方同意，在本协议有效期内乙方可通过网站公告或邮件方式通知甲方后，按照调整后的费率向甲方收取服务费，但调整的费率不得损害甲方利益。</p>
            <p><br/></p>
            <p>4、甲方确认服务费和交易流量以乙方和点餐猫系统记录的数据为准。</p>
   
            <p><br/></p>
            <p><h4>第六条  点餐猫授权条款</h4></p>
            <p>本协议一旦生效，即表示甲方已充分理解并同意不可撤销地授权点餐猫公司可根据乙方指令对甲方点餐猫账户或甲方设定的甲方门店收款账户中的保证金（如有）、余额进行如下操作，包括但不限于对保证金、账户余额进行冻结、解冻、划扣。 </p>


            <p><br/></p>
            <p><h4>第七条   免责及有限责任</h4></p>
            <p>（1）点餐猫平台系统停机维护； </p>
            <p>（2）因通信公司有线或无线通信系统、设备的检修、维护或不稳定，或黑客攻击，或电力部门技术调整或故障，或银行方面的问题等原因，或由于不可抗力事件导致乙方服务中断或不稳定，不视为乙方违约。</p>
            <p><br/></p>
            <p>2、乙方不对甲方产品或服务的真实性、合法性和有效性作任何明示或暗示的担保，也不承担任何责任。</p>

            <p><br/></p>
            <p><h4>第七条   免责及有限责任</h4></p>
            <p>（1）点餐猫平台系统停机维护； </p>
            <p>（2）因通信公司有线或无线通信系统、设备的检修、维护或不稳定，或黑客攻击，或电力部门技术调整或故障，或银行方面的问题等原因，或由于不可抗力事件导致乙方服务中断或不稳定，不视为乙方违约。</p>
            <p><br/></p>
            <p>2、乙方不对甲方产品或服务的真实性、合法性和有效性作任何明示或暗示的担保，也不承担任何责任。</p>


            <p><br/></p>
            <p><h4>第八条   违约责任</h4></p>
            <p>1、在使用点餐猫平台的过程中，如甲方存在侵犯第三方（如用户、知识产权权利人）权益、违反国家法律法规或其他违反本协议的行为时，除根据本协议应向乙方支付违约金（如有）外，还应赔偿乙方因此遭受的直接损失，包括但不限于因遭受行政处罚或需向第三方承担民事责任造成的损失。</p>
            <p><br/></p>
            <p>2、乙方因故意或重大过失导致甲方利益受损时，乙方对甲方的违约和/或赔偿责任以甲方遭受的直接损失为限。</p>

       
            <p><br/></p>
            <p><h4>第九条  协议终止</h4></p>
            <p>1、提前解除：甲乙双方均可以提前解除本协议，但须通过合理方式提前30天通知对方。 </p>
            <p><br/></p>
            <p>2、甲方发生下述情形时，乙方有权单方解除本协议：</p>
            <p>（1）违反商户制度规定且达到终止合作的程度；</p>
            <p>（2）提交的信息或文件不真实、不合法、已失效或甲方无法证明其信息或文件的真实性、合法性、有效性；</p>
            <p>（3）不具备销售其商品或服务的必备资质或其必备资质过期、被注销；</p>
            <p>（4）甲方保证金（如有）不足额，且未能自行补齐，经乙方催缴后仍未能在指定时间内补足；</p>
            <p>（5）甲方存在违反本协议或商户制度的情形，经乙方通知后，在限定的期限内未能改正；</p>
            <p>（6）点餐猫公司终止向甲方提供附件约定的服务的。</p>
            <p><br/></p>
            <p>3、甲方同意在本协议终止后，如甲方仍存在未解决的纠纷，乙方有权将甲方的点餐猫账户余额冻结30天作为保证金，用于解决服务协议终止后的履约纠纷或对消费者投诉进行赔付；待纠纷解决后，乙方将冻结款项解冻。</p>
            
            <p><br/></p>
            <p><h4>第十条  其他约定</h4></p>
            <p>1、甲乙双方合作期间，基于本协议目的，甲乙双方可以合理地使用对方的相应知识产权，包括但不限于商标、标识、产品或服务名称、LOGO等知识产权；但未经一方授权，另一方不得将一方的知识产权用于本协议目的之外的场合。  </p>
            <p><br/></p>
            <p>2、就本协议的签订、履行或解释发生争议的，甲乙双方同意由重庆浩品峰电子商务有限公司住所地（重庆市两江新区）人民法院管辖审理。</p>
            <p><br/></p>
            <p>3、本协议自甲方和乙方签字或盖章之日起生效，有效期一年。协议到期前三十日内，除非甲乙双方任意一方有异议的，否则本协议将自动续签一年，以此类推，反复适用。</p>
            <p><br/></p>
            <p>4、乙方有权根据业务调整的需要，终止履行本项协议，在不影响甲方利益的前提下，乙方应安排具备履约能力的第三方继续履行本项协议下的权利义务，乙方应事先通过网站公告、邮件通知等方式通知甲方。</p>
            <p><br/></p>
            <p>5、本协议所称的“通知”，包括纸质盖章文件形式，或通过甲方在乙方或乙方关联公司平台上预留的邮箱（或通过本协议约定的指定邮箱）发送邮件，或通过甲方在签约过程中在乙方或乙方关联公司平台上预留的手机号码发送短信，或通过网站、APP页面公告等方式。</p>
            <p><br/></p>
            <p>6、本协议自甲方在乙方或乙方关联公司平台点击确认的方式来确认本协议之日起生效，且该点击确认行为与甲方加盖公章或签字的行为具有相同法律效力。</p>
            <p><br/></p>
            <p>7、乙方有权随时对本协议内容进行单方面的变更，并以在www.hme.cn网站或点餐猫收银系统予以公布，无需另行通知甲方；若甲方在本协议内容变更公告后继续使用点餐猫平台服务，则表示甲方已充分阅读、理解并接受修改后的协议，也将遵循修改后的协议；若甲方不同意修改后的协议内容，甲方应停止使用点餐猫平台服务。</p>
            <p><br/></p>
            <p>8、双方签订本线上协议或其他在线协议后，甲方因内部管理等原因需要签订纸质协议进行确认或存档的，双方可再行签订纸质协议，但不能因此视为双方存在两个协议关系，纸质协议的内容必须与在线签署的协议内容一致，协议的生效与履行依照在线签署的协议约定执行，在线签署的协议内容与纸质协议的约定不一致的，以前者的约定为准。</p>
            <p><br/></p>
              
           
        </div>
        <div class="stepForm_item">
            <input class="agreeBtn" type="checkbox" checked="checked"/> &nbsp;&nbsp;我同意并遵守上述的《点餐猫商户服务协议》
        </div>
        <a class="step_next">下一步</a>
    </div><!--end 第一步-->


 <!--第二步-->
    <div class="stepBox_02" style="display: none;">
        <p class="SigningP_a"><a href="explain" target="_blank">点餐猫商家签约流程详细说明&gt;&gt;</a></p>

    <!--产品选择-->
    <div class="stepForm_item">
        <label>产品选择：</label>
        <div class="form_box">
            <div class="checkBox">
                <div class="checkboxitem">
                    <i class="checkbox_icon act"></i>
                    <input type="checkbox" checked="checked" name="light_pay"/>
                    <span>轻量付收款码</span>
                </div>
                <div class="checkboxitem">
                    <i class="checkbox_icon"></i>
                    <input type="checkbox" name="casher_system"/>
                    <span>点餐猫智能收银系统</span>
                </div>
                <a class="click_a" href="explain_product.html" target="_Blank">产品详情说明&gt;&gt;</a>

            </div>
        </div>
    </div>


    <!--合作方式-->
    <div class="stepForm_item">
        <label>合作方式：</label>
        <div class="form_box">
            <div class="checkBox">
                <div class="checkboxitem">
                    <i class="radio_icon act"></i>
                    <input name="cooperate" type="radio" checked="checked" value="A"/>
                    <span>20%佣金方案</span>
                </div>
                <div class="checkboxitem">
                    <i class="radio_icon"></i>
                    <input name="cooperate" type="radio" value="B"/>
                    <span>15%佣金方案</span>
                </div>

                <a class="click_a">佣金方案详情说明&gt;&gt;</a>
                
            </div>
        </div>
    </div>


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
                </select>

                <select class="shopIp_DQ" name="restaurant_city">
                    <option value="-1">全部</option>
                    <option value="重庆">重庆</option>
                </select>

                <select class="shopIp_QX" name="restaurant_district">
                    <option value="-1">区/县</option>
                </select>

                <select class="shopIp_JD" name="restaurant_street">
                    <option value="-1">街道</option>
                </select>
                <a class="ip_update" href="javascript:void(0);" onclick="updateRegion()"></a>
                <span class="ip_prompt">如果餐厅所在地区未在列表内，请致电:400-992-9339</span>
            </div>
        </div>
        <!--餐厅类别-->
        <div class="stepForm_item">
            <label>餐厅类别：</label>
            <div class="form_box">
                <select class="shopClass" name="restaurant_type">
                    <c:forEach var="value" items="${typelist}">  
                                <option value="${value.name}">  
                                ${value.name}  
                                </option>  
                                </c:forEach>  
                   
                </select>
            </div>
        </div>

        <div class="from_hr"></div>

        <!--餐厅地址-->
        <div class="stepForm_item">
            <label>餐厅地址：</label>
            <div class="form_box shop_mapBox">
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
                <input type="text" class="callInput" name="manager_phone" id="manager_phone"/><a class="callTest managerBtn" >验证码</a>
                <p class="explain">用于接收流水及结算数据报告</p>
            </div>
        </div>
                
        <div class="stepForm_item">
            <label>短信验证码：</label>
            <div class="form_box">
                <input type="text" class="" name="manager_phone_code"/>
            </div>
        </div>

        <div class="from_hr"></div>

        <!--店长手机-->
        <div class="stepForm_item">
            <label>老板手机：</label>
            <div class="form_box">
                <input type="text" class="callInput" name="boss_phone" id="boss_phone"/><a class="callTest bossBtn">验证码</a>
                <p class="explain">餐厅扫码注册推荐关系的所属</p>
            </div>
        </div>
        <div class="stepForm_item">
            <label>短信验证码：</label>
            <div class="form_box">
                <input type="text" class="" name="boss_phone_code"/>
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
                    <input class="busLic" type="file" name="licensefile"/>
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
                    <input class="DCMcontract" type="file" name="contractfile"/>
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
                    <input class="atto" type="file" name="attorneyfile"/>
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
                   ${currentDate}
                </td>
            </tr>
        </table>
        <div class="from_hr"></div>
        <div class="phone_aboutme">
            <p>客服热线</p>
            <p>400-992-9339</p>
        </div>
   <!--                      <input type="submit" value="测试用提交按钮"> -->

        <input type="submit" class="finish" value="完成"/>

    </div><!--end第四步-->
    
    
  	<!--   传值用 -->
    <input type="hidden" id="qrcodeurl" name="qrcodeurl" value="${qrcodeurl}" />
    <input type="hidden" id="outtradeno" name="out_trade_no" value="${out_trade_no}" />
    <input type="hidden" id="payresult" name="payresult" value="${payresult}" />
    <input type="hidden" id="boss_phone_validation" name="boss_phone_validation" value="${boss_phone_validation}"/>
    <input type="hidden" id="manager_phone_validation" name="manager_phone_validation" value="${manager_phone_validation}"/>

<!-- <a href="javascript:void(0);" onclick="getPayResult()">测试 pay result</a> -->

    </form>

</div>




<script>



//得到支付状态
function getPayResult(){
	
 		 $.ajax({
	        type: "GET",
	        url: "paynotify",
	        success: function(data) {
	        	var pay_result= data;
	        	alert(pay_result)
	        }	       	        
		}) 
}

//更新地区
function updateRegion(){
 		 $.ajax({
	        type: "POST",
	        url: "updateregion",
	        success: function() {
	        }	       	        
		}) 
}


$(function () {
//TODO 第二步里的城市四级联动：
    //ajax加载省市
    $.ajax({
        type: "POST",
        url: "resources/data/cityJson.json",
        data: "json",
        success: function(data) {
            $.each(data, function(idx, obj) {
                if (obj.regLevel == 1) {
                    var optionEL = $('<option data-id="' +
                        obj.id + '" ' +
                        'data-pid="' + obj.pid + '"' +
                        'value="'+obj.pid+'-'+obj.id+','+obj.name+'">' +
                        obj.name + '' +
                        '</option>');
                    $('.shopIp_SS').append(optionEL);
                }
            });
        }
    });


    //点击省市时加载地区
    $('.shopIp_SS').on('change', function() {
        $('.shopIp_DQ').html('<option value="-1">全部</option>'); //清空城市
        $('.shopIp_QX').html('<option value="-1">区/县</option>'); //清空区县
        $('.shopIp_JD').html('<option value="-1">街道</option>'); //清空街道
        if (this.value !== '-1') {
            var datPid = $(this).val().substring(
                    $(this).val().indexOf('-')+1,
                    $(this).val().indexOf(',')
            );
            var optionHTML = '<option value="-1">全部</option>';
            $.ajax({
                type: "POST",
                url: "resources/data/cityJson.json",
                data: "json",
                success: function(data) {
                    $.each(data, function(idx, obj) {
                        if (obj.pid == datPid) {
                            optionHTML +=
                            '<option data-id="' +
                            obj.id + '" ' +
                            'data-pid="' + obj.pid + '"' +
                            'value="'+obj.pid+'-'+obj.id+','+obj.name+'">' +
                            obj.name + '' +
                            '</option>';
                        }
                    });
                    $('.shopIp_DQ').html(optionHTML);
                }
            });
        }
    });


    //点击地区时加载区县
    $('.shopIp_DQ').on('change', function() {
        $('.shopIp_QX').html('<option value="-1">区/县</option>'); //清空区县
        $('.shopIp_JD').html('<option value="-1">街道</option>'); //清空街道
        if (this.value !== '-1') {
            var datPid = $(this).val().substring(
                    $(this).val().indexOf('-')+1,
                    $(this).val().indexOf(',')
            );
            var optionHTML = '<option value="-1">区/县</option>';
            $.ajax({
                type: "POST",
                url: "resources/data/cityJson.json",
                data: "json",
                success: function(data) {
                    $.each(data, function(idx, obj) {
                        if (obj.pid == datPid) {
                            optionHTML +=
                            '<option data-id="' +
                            obj.id + '" ' +
                            'data-pid="' + obj.pid + '"' +
                            'value="'+obj.pid+'-'+obj.id+','+obj.name+'">' +
                            obj.name + '' +
                            '</option>';
                        }
                    });
                    $('.shopIp_QX').html(optionHTML);
                    }
            });
        }
    });


    //点击区县时加载街道
    $('.shopIp_QX').on('change', function() {
        $('.shopIp_JD').html('<option value="-1">街道</option>'); //清空街道
        if (this.value !== '-1') {
            var datPid = $(this).val().substring(
                    $(this).val().indexOf('-')+1,
                    $(this).val().indexOf(',')
            );
            var optionHTML = '<option value="-1">街道</option>';
            $.ajax({
                type: "POST",
                url: "resources/data/cityJson.json",
                data: "json",
                success: function(data) {
                    $.each(data, function(idx, obj) {
                        if (obj.pid == datPid) {
                            optionHTML +=
                            '<option data-id="' +
                            obj.id + '" ' +
                            'data-pid="' + obj.pid + '"' +
                            'value="'+obj.pid+'-'+obj.id+','+obj.name+'">' +
                            obj.name + '' +
                            '</option>';
                        }
                    });
                    $('.shopIp_JD').html(optionHTML);
                }
            });
        }
    });





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
        var myIcon_dcm = new BMap.Icon("resources/img/map_icon.png", new BMap.Size(30,30));

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
    	var url= document.getElementById('qrcodeurl').value
	jQuery('#payqrcode').qrcode(url);
	})
    
});
</script>
</body>
</html>