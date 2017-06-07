package com.hpf.service;


import java.util.SortedMap;
import java.util.TreeMap;



import com.hpf.model.PayModel;
import com.hpf.util.Generator;
import com.hpf.util.HttpsRequest;
import com.hpf.util.WeChatSignature;
import com.hpf.util.XMLDecoder;
import com.hpf.util.XStreamUtil;


public class WechatPay {
	
	
	
	public static void Wchatpayment(){
		
		//参数
		String service="pay.weixin.native";
		String mch_id="7551000001"; //商户号
		String out_trade_no=Generator.getRandomNonceStr(32); //订单号
		String body="测试"; //商品描述
		int total_fee=1; //总金额,单位为分
		String mch_create_ip="218.70.106.206";
		String notify_url="/notify";
		String key="9d101c97133837e13dde2d32a5054abb";
		String nonce_str=Generator.getRandomNonceStr(32);

	
		SortedMap<Object, Object> parameters = new TreeMap<Object, Object>();
		parameters.put("service", service);
		parameters.put("mch_id", mch_id);
		parameters.put("out_trade_no", out_trade_no);
		parameters.put("body", body);
		parameters.put("total_fee", total_fee);
		parameters.put("mch_create_ip", mch_create_ip);
		parameters.put("notify_url", notify_url);
		parameters.put("nonce_str", nonce_str);
		
		
		String sign =WeChatSignature.sign(parameters, key);
		System.out.println("签名="+sign);

		//设置service
		PayModel payModel = new PayModel();
		payModel.setService(service);

		payModel.setMch_id(mch_id);
		payModel.setOut_trade_no(out_trade_no);
		payModel.setTotal_fee(total_fee);
		payModel.setSign(sign);
		payModel.setService(service);
		payModel.setMch_create_ip(mch_create_ip);
		payModel.setNotify_url(notify_url);
		payModel.setBody(body);
		payModel.setNonce_str(nonce_str);
		
		XStreamUtil.xstream.alias("xml", PayModel.class);
		String requestxml=XStreamUtil.xstream.toXML(payModel);
	    requestxml=requestxml.replace("__", "_"); 
		System.out.println("xml="+requestxml);
		
		//发送https请求生成二维码
		try {
			System.out.println("开始生成二维码");
			String responsexml = HttpsRequest.HttpsRequest("https://pay.swiftpass.cn/pay/gateway", "POST", requestxml);
			System.out.println("responsexml="+responsexml);
			XMLDecoder.getXMLInfo(responsexml);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		Wchatpayment();
	}
	
}
