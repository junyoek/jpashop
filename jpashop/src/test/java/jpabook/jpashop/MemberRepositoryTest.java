package jpabook.jpashop;


import jpabook.jpashop.domain.Member;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.FactoryBasedNavigableListAssert;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
//@ExtendWith(SpringExtension.class)
@SpringBootTest
public class MemberRepositoryTest {
//    @Autowired MemberRepository memberRepository;
//    @Test
//    @Transactional
//    @Rollback(false)
//    public void testMember() throws Exception{
//        Member member = new Member();
//        member.setUsername("memberA");
//
//        Long savedId = memberRepository.save(member);
//        Member findMember = memberRepository.find(savedId);
//
//        Assertions.assertThat(findMember.getId()).isEqualTo(member.getId());
//
//        Assertions.assertThat(findMember.getUsername()).isEqualTo(member.getUsername());
//        Assertions.assertThat(findMember).isEqualTo(member); //JPA 엔티티 동일성보장
//
//        System.out.println("findMember == member :"+(findMember == member));
//    }
}