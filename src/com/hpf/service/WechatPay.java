package com.hpf.service;

import java.util.SortedMap;
import java.util.TreeMap;

import com.hpf.model.PayModel;
import com.hpf.util.Generator;
import com.hpf.util.WeChatSignature;
import com.hpf.util.XStreamUtil;


public class WechatPay {
	
	
	
	public static String Wchatpayment(){
		
		//参数
	    String appid="11";//公众号id
		String mch_id="11"; //商户号
		String nonce_str=Generator.getRandomNonceStr(20); //随机字符串
		String body="11"; //商品描述
		String out_trade_no="11"; //订单号
		int total_fee=1; //总金额,单位为分
		String spbill_create_ip="11";//终端ip
		String trade_type="NATIVE"; //交易类型
		String notifyrl="www.sss.com";
		String key="111";
	
	
		SortedMap<Object, Object> parameters = new TreeMap<Object, Object>();
		parameters.put("appid", appid);
		parameters.put("mch_id", mch_id);
		parameters.put("nonce_str", nonce_str);
		parameters.put("body", body);
		parameters.put("out_trade_no", out_trade_no);
		parameters.put("total_fee", total_fee);
		parameters.put("spbill_create_ip", spbill_create_ip);
		parameters.put("trade_type", trade_type);
		parameters.put("notifyrl", notifyrl);

		String sign =WeChatSignature.sign(parameters, key);
		System.out.println("&&&&&&&sign="+sign);
		
		PayModel payModel = new PayModel();
		payModel.setAppid(appid);
		payModel.setBody(body);
		payModel.setMch_id(mch_id);
		payModel.setNonce_str(nonce_str);
		payModel.setOut_trade_no(out_trade_no);
		payModel.setSpbill_create_ip(spbill_create_ip);
		payModel.setTotal_fee(total_fee);
		payModel.setTrade_type(trade_type);
		XStreamUtil.xstream.alias("xml", PayModel.class);
		String requestxml=XStreamUtil.xstream.toXML(payModel);
		System.out.println("xml="+requestxml);
		
		return "pay";
	}
	
	public static void main(String[] args) {
		Wchatpayment();
	}
	
}
