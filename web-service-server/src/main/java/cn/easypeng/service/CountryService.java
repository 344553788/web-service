package cn.easypeng.service;

import cn.easypeng.repository.CountryRepository;
import cn.easypeng.webservice.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jeff
 * @date 2021/11/25
 */
@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public Country findCountry(String name) {
        return countryRepository.findCountry(name);
    }
}
