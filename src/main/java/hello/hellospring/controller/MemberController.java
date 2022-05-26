package hello.hellospring.controller;


import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//controller를 설정하면 스프링이 관리
@Controller
public class MemberController {

    //맴버 서비스를 가져다 쓴다.
    private final MemberService memberService;

    @Autowired //스프링이 맴버서비스를 가져와서 연결시켜줍니다.
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }





}