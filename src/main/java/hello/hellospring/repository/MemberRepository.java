package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {


    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    //id와 name가져오는데 null수도 있다.
    List<Member> findAll();
}
