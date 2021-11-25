//package cn.easypeng.controller;
//
//import cn.easypeng.client.WsClient;
//import cn.easypeng.webservice.ws.GetCountryResponse;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * @author jeff
// * @date 2021/11/25
// */
//@RestController
//public class IndexController {
//
//    @Autowired
//    private WsClient wsClient;
//
//    @RequestMapping("callws")
//    public Object callWs(String name) {
//        GetCountryResponse response = wsClient.getCountry(name);
//        return response.getCountry();
//    }
//}