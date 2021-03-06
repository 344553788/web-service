//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.3.2 生成的
// 请访问 <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2021.11.25 时间 12:07:20 PM CST 
//


package cn.easypeng.webservice;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cn.easypeng.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cn.easypeng.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AuthorRequest }
     * 
     */
    public AuthorRequest createAuthorRequest() {
        return new AuthorRequest();
    }

    /**
     * Create an instance of {@link AuthorResponse }
     * 
     */
    public AuthorResponse createAuthorResponse() {
        return new AuthorResponse();
    }

    /**
     * Create an instance of {@link Author }
     * 
     */
    public Author createAuthor() {
        return new Author();
    }

    /**
     * Create an instance of {@link AuthorListRequest }
     * 
     */
    public AuthorListRequest createAuthorListRequest() {
        return new AuthorListRequest();
    }

    /**
     * Create an instance of {@link AuthorListResponse }
     * 
     */
    public AuthorListResponse createAuthorListResponse() {
        return new AuthorListResponse();
    }

    /**
     * Create an instance of {@link GetCountryRequest }
     * 
     */
    public GetCountryRequest createGetCountryRequest() {
        return new GetCountryRequest();
    }

    /**
     * Create an instance of {@link GetCountryResponse }
     * 
     */
    public GetCountryResponse createGetCountryResponse() {
        return new GetCountryResponse();
    }

    /**
     * Create an instance of {@link Country }
     * 
     */
    public Country createCountry() {
        return new Country();
    }

}
