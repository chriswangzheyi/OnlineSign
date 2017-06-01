package com.hpf.service;

import java.util.SortedMap;
import java.util.TreeMap;

import com.hpf.model.PayModel;
import com.hpf.util.Generator;
import com.hpf.util.WeChatSignature;
import com.hpf.util.XStreamUtil;


public class WechatPay {
	
	
	
	public static String Wchatpayment(){
		
		//����
	    String appid="11";//���ں�id
		String mch_id="11"; //�̻���
		String nonce_str=Generator.getRandomNonceStr(20); //����ַ���
		String body="11"; //��Ʒ����
		String out_trade_no="11"; //������
		int total_fee=1; //�ܽ��,��λΪ��
		String spbill_create_ip="11";//�ն�ip
		String trade_type="NATIVE"; //��������
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
