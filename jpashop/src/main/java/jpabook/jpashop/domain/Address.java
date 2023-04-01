package jpabook.jpashop.domain;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
public class Address {

    private String city;
    private String street;

    private String zipcode;

    protected Address(){

    }//기본 생성자 함부로 new로 생성하지 않게함

    public Address(String city,String street,String zipcode){
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }//setter제거
}
