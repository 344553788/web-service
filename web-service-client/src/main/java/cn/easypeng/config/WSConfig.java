package cn.easypeng.config;

import cn.easypeng.client.WsClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import static cn.easypeng.constant.SinoConstant.COUNTRY_NAMESPACE_URI;

/**
 * @author jeff
 * @date 2021/11/25
 */
@Configuration
public class WSConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("cn.easypeng.webservice");
        return marshaller;
    }

    @Bean
    public WsClient wsClient(Jaxb2Marshaller marshaller) {
        WsClient client = new WsClient();
        client.setDefaultUri(COUNTRY_NAMESPACE_URI);
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
