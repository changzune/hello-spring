package hello.hellospring.controller;


import hello.hellospring.domain.Member;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

//controller를 설정하면 스프링이 관리
@Controller
public class MemberController {

    //맴버 서비스를 가져다 쓴다.
    private final MemberService memberService;

    @Autowired //스프링이 맴버서비스를 가져와서 연결시켜줍니다.
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/members/new")
    public String CrateForm(){

        return "members/createMemberForm";

    }

    @PostMapping("/members/new")
    public String create(MemberForm form){
        Member member = new Member();
        member.setName(form.getName());

        memberService.join(member);

        return "redirect:/";
    }

    @GetMapping("/members")
    public String list(Model model){
       List<Member> members = memberService.findMembers();
        model.addAttribute("membar", members);
        return "member/memberList";
    }



}