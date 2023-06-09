package jpabook.jpashop.domain.item;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import jpabook.jpashop.domain.Category;

import java.util.ArrayList;
import java.util.List;
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)//한테이블안에 다 넣기
@DiscriminatorColumn(name = "dtype")
@Getter @Setter
public abstract class Item {
    @Id @GeneratedValue
    @Column(name = "item_id")
    private Long id;
    private String name;
    private int price;
    private int stockQuantity;
    @ManyToMany(mappedBy = "items")
    private List<Category> categories = new ArrayList<Category>();
}