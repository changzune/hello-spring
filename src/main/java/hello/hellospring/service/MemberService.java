package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;

<<<<<<< HEAD
import java.util.List;
=======
>>>>>>> origin/main
import java.util.Optional;

public class MemberService {

    private  final MemberRepository memberRepository = new MemoryMemberRepository();

    /**
     * 회원 가입
     */
    public long join(Member member){
        //같은 이름이 있는 중복 회원 X
<<<<<<< HEAD
       ValidateDupliccateMember(member); // 중복 회원 검증
=======
        memberRepository.findByName(member.getName())
                .ifPresent(m -> {
            throw new IllegalStateException("이미존재하는 회원입니다.");

        });

>>>>>>> origin/main
        memberRepository.save(member);
        return member.getId();
    }

<<<<<<< HEAD
    private void ValidateDupliccateMember(Member member) {
        memberRepository.findByName(member.getName())
                .ifPresent(m -> {
            throw new IllegalStateException("이미존재하는 회원입니다.");
        });
    }

    /**
     * 전체 회원조회     */

    public List<Member> findMembers(){
        return memberRepository.findAll();

    }

    public Optional<Member> findOne(Long memberId){
        return memberRepository.findById(memberId);
    }


=======
>>>>>>> origin/main
}
