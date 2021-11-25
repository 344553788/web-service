package cn.easypeng.resource;

import cn.easypeng.constant.SinoConstant;
import cn.easypeng.service.AuthorService;
import cn.easypeng.webservice.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.Arrays;
import java.util.Date;

/**
 * @author jeff
 * @date 2021/11/24
 */
@Endpoint
public class AuthorEndpoint {

    @Autowired
    private AuthorService authorService;


    @PayloadRoot(namespace = SinoConstant.NAMESPACE_URI, localPart = "authorRequest")
    @ResponsePayload
    public AuthorResponse getAuthor(@RequestPayload AuthorRequest authorReq) {
        AuthorResponse resp = new AuthorResponse();
        resp.setAuthor(authorService.findAuthor(authorReq.getName()));
        return resp;
    }

    @PayloadRoot(namespace = SinoConstant.NAMESPACE_URI, localPart = "authorListRequest")
    @ResponsePayload
    public AuthorListResponse getAuthorList(@RequestPayload AuthorListRequest request) {
        AuthorListResponse resp = new AuthorListResponse();
        Author author = new Author();
        author.setBirthday("1988-01-31");
        author.setName("姓名：J.J.Huang");
        author.setSex(Sex.FEMALE);
        author.getHobby().addAll(Arrays.asList("程式", "桌遊", "旅遊", "電影"));
        author.setDescription("描述：每天一文章筆記，加油。現在時間：" + new Date().getTime());
        resp.getAuthor().add(author);
        resp.getAuthor().add(author);
        resp.getAuthor().add(authorService.findAuthor(request.getNonce()));
        return resp;
    }
}
