package com.unionpay.acp.demo;

import java.util.HashMap;
import java.util.Map;

import com.unionpay.acp.sdk.AcpService;
import com.unionpay.acp.sdk.LogUtil;

public class CheckSign {

	public static void main(String[] args) {
		Map<String, String> parmMap = new HashMap<String, String>();
		parmMap.put("accessType", "0");
		parmMap.put("bizType", "000000");
		parmMap.put("currencyCode", "156");
		parmMap.put("encoding", "UTF-8");
		parmMap.put("issInsCode", "04233310");
		parmMap.put("merId", "852333053119986");
		parmMap.put("orderId", "20180110164727");
		parmMap.put("queryId", "20180110369106144740");
		parmMap.put("respCode", "00");
		parmMap.put("respMsg", "成功[0000000]");
		parmMap.put("settleAmt", "1");
		parmMap.put("settleCurrencyCode", "156");
		parmMap.put("settleDate", "0110");
		parmMap.put("signMethod", "01");
		parmMap.put("signPubKeyCert", "-----BEGIN CERTIFICATE-----\nMIIEIDCCAwigAwIBAgIFEDRVM3AwDQYJKoZIhvcNAQEFBQAwITELMAkGA1UEBhMC\nQ04xEjAQBgNVBAoTCUNGQ0EgT0NBMTAeFw0xNTEwMjcwOTA2MjlaFw0yMDEwMjIw\nOTU4MjJaMIGWMQswCQYDVQQGEwJjbjESMBAGA1UEChMJQ0ZDQSBPQ0ExMRYwFAYD\nVQQLEw1Mb2NhbCBSQSBPQ0ExMRQwEgYDVQQLEwtFbnRlcnByaXNlczFFMEMGA1UE\nAww8MDQxQDgzMTAwMDAwMDAwODMwNDBA5Lit5Zu96ZO26IGU6IKh5Lu95pyJ6ZmQ\n5YWs5Y+4QDAwMDE2NDkzMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA\ntXclo3H4pB+Wi4wSd0DGwnyZWni7+22Tkk6lbXQErMNHPk84c8DnjT8CW8jIfv3z\nd5NBpvG3O3jQ/YHFlad39DdgUvqDd0WY8/C4Lf2xyo0+gQRZckMKEAId8Fl6/rPN\nHsbPRGNIZgE6AByvCRbriiFNFtuXzP4ogG7vilqBckGWfAYaJ5zJpaGlMBOW1Ti3\nMVjKg5x8t1/oFBkpFVsBnAeSGPJYrBn0irfnXDhOz7hcIWPbNDoq2bJ9VwbkKhJq\nVz7j7116pziUcLSFJasnWMnp8CrISj52cXzS/Y1kuaIMPP/1B0pcjVqMNJjowooD\nOxID3TZGfk5V7S++4FowVwIDAQABo4HoMIHlMB8GA1UdIwQYMBaAFNHb6YiC5d0a\nj0yqAIy+fPKrG/bZMEgGA1UdIARBMD8wPQYIYIEchu8qAQEwMTAvBggrBgEFBQcC\nARYjaHR0cDovL3d3dy5jZmNhLmNvbS5jbi91cy91cy0xNC5odG0wNwYDVR0fBDAw\nLjAsoCqgKIYmaHR0cDovL2NybC5jZmNhLmNvbS5jbi9SU0EvY3JsMjI3Mi5jcmww\nCwYDVR0PBAQDAgPoMB0GA1UdDgQWBBTEIzenf3VR6CZRS61ARrWMto0GODATBgNV\nHSUEDDAKBggrBgEFBQcDAjANBgkqhkiG9w0BAQUFAAOCAQEAHMgTi+4Y9g0yvsUA\np7MkdnPtWLS6XwL3IQuXoPInmBSbg2NP8jNhlq8tGL/WJXjycme/8BKu+Hht6lgN\nZhv9STnA59UFo9vxwSQy88bbyui5fKXVliZEiTUhjKM6SOod2Pnp5oWMVjLxujkk\nWKjSakPvV6N6H66xhJSCk+Ref59HuFZY4/LqyZysiMua4qyYfEfdKk5h27+z1MWy\nnadnxA5QexHHck9Y4ZyisbUubW7wTaaWFd+cZ3P/zmIUskE/dAG0/HEvmOR6CGlM\n55BFCVmJEufHtike3shu7lZGVm2adKNFFTqLoEFkfBO6Y/N6ViraBilcXjmWBJNE\nMFF/yA==\n-----END CERTIFICATE-----");
		parmMap.put("traceNo", "331580");
		parmMap.put("traceTime", "0110164921");
		parmMap.put("txnAmt", "1");
		parmMap.put("txnSubType", "07");
		parmMap.put("txnTime", "20180110164727");
		parmMap.put("txnType", "01");
		parmMap.put("version", "5.1.0");
		
		parmMap.put("signature", "PMxMZoFWWanxv1d2CmE7zupd6IrtsabVsiAeZYJEyDeAHjXQvpDvEqX2iDEQRGHMkRJDYSnY+4Skraut1SMz0vAYRq0Oq+0/H2YqaZy3rBBmyPx29ropM8xw/dD7XLHvFJ3igb405Sld0OwX+97g0wD6VnpaAqOo1TrksRVlcKzUULdUQ+hRrH4pF2vApBT57GuZGRyjvWf/hgrEb40DcXdnLZOmTDP16LDrGAH5XMb/DbkOb0jHd7uMU6ngjT0yKeuyfbJaElyJodqR9MWm+BnvBhgTn8OWsU2NyZrRfQcsrV6ItpGmOVA1lbJlkaeoslBRRcukiQbpwBY8iNopCw==");
		
		//重要！验证签名前不要修改reqParam中的键值对的内容，否则会验签不过
		if (!AcpService.validate(parmMap, parmMap.get("encoding"))) {
			LogUtil.writeLog("验证签名结果[失败].");
			//验签失败，需解决验签问题
			
		} else {
			LogUtil.writeLog("验证签名结果[成功].");
			//【注：为了安全验签成功才应该写商户的成功处理逻辑】交易成功，更新商户订单状态
			
			String orderId =parmMap.get("orderId"); //获取后台通知的数据，其他字段也可用类似方式获取

			String respCode = parmMap.get("respCode");
			//判断respCode=00、A6后，对涉及资金类的交易，请再发起查询接口查询，确定交易成功后更新数据库。
			System.out.println(orderId + " | TCH | " + respCode);
		}
	}

}
