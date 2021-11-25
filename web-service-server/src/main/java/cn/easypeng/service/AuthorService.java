package cn.easypeng.service;

import cn.easypeng.repository.AuthorRepository;
import cn.easypeng.webservice.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jeff
 * @date 2021/11/25
 */
@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public Author findAuthor(String name) {
        return authorRepository.findAuthor(name);
    }
}
