package cn.easypeng.repository;

import cn.easypeng.webservice.Author;
import cn.easypeng.webservice.Country;
import cn.easypeng.webservice.Currency;
import cn.easypeng.webservice.Sex;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author jeff
 * @date 2021/11/25
 */
@Component
public class AuthorRepository {

    private static final Map<String, Author> authors = new HashMap<>();

    @PostConstruct
    public void initData() {
        Author gongFu = new Author();
        gongFu.setBirthday("1988-01-31");
        gongFu.setName("gongFu");
        gongFu.setSex(Sex.FEMALE);
        gongFu.getHobby().addAll(Arrays.asList("程式", "桌遊", "旅遊", "電影"));
        gongFu.setDescription("描述：每天一文章筆記，加油。現在時間：" + new Date().getTime());
        authors.put(gongFu.getName(), gongFu);
        Author xiandai = new Author();
        xiandai.setBirthday("1988-01-31");
        xiandai.setName("xiandai");
        xiandai.setSex(Sex.FEMALE);
        xiandai.getHobby().addAll(Arrays.asList("程式", "桌遊", "旅遊", "電影"));
        xiandai.setDescription("描述：每天一文章筆記，加油。現在時間：" + new Date().getTime());
        authors.put(xiandai.getName(), xiandai);

    }

    public Author findAuthor(String name) {
        Assert.notNull(name, "The country's name must not be null");
        return authors.get(name);
    }
}
