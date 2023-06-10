//package ecpay.payment.integration.service;
//
//import org.springframework.stereotype.Service;
//
//import ecpay.payment.integration.AllInOne;
//import ecpay.payment.integration.domain.AioCheckOutALL;
//
//@Service
//public class OrderService {
//
//	public String ecpayCheckout() {
//
//		AllInOne all = new AllInOne("");
//
//		AioCheckOutALL obj = new AioCheckOutALL();
//		obj.setMerchantTradeNo("testCompany0004");
//		obj.setMerchantTradeDate("2017/01/01 08:05:23");
//		obj.setTotalAmount("50");
//		obj.setTradeDesc("test Description");
//		obj.setItemName("TestItem");
//		// 交易結果回傳網址，只接受 https 開頭的網站，可以使用 ngrok
//		// obj.setReturnURL("http://211.23.128.214:5000");
//		obj.setNeedExtraPaidInfo("N");
//		// 商店轉跳網址 (Optional)
//		obj.setClientBackURL("https://www.youtube.com");
//		String form = all.aioCheckOut(obj, null);
//
//		return form;
//	}
//}