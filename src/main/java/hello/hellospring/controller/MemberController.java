package hello.hellospring.controller;


import hello.hellospring.service.MemberService;
import org.springframework.stereotype.Controller;

//controller를 설정하면 스프링이 관리
@Controller
public class MemberController {

    //맴버 서비스를 가져다 쓴다.
    private final MemberService memberService;


    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }





}