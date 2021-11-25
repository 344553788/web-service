package cn.easypeng.client;

import cn.easypeng.webservice.GetCountryRequest;
import cn.easypeng.webservice.GetCountryResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import static cn.easypeng.constant.SinoConstant.COUNTRY_NAMESPACE_URI;

/**
 * @author jeff
 * @date 2021/11/25
 */
public class WsClient extends WebServiceGatewaySupport {

    public GetCountryResponse getCountry(String name) {

        GetCountryRequest request = new GetCountryRequest();
        request.setName(name);

        GetCountryResponse response = (GetCountryResponse) getWebServiceTemplate().marshalSendAndReceive(
                COUNTRY_NAMESPACE_URI, request);

        return response;
    }
}