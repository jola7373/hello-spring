package hello.hellospring;

import hello.hellospring.repository.MemberRepository;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigure {

    /*
    private DataSource dataSource;

    @Autowired
    public SpringConfigure(DataSource dataSource){
        this.dataSource = dataSource;
    }
    */

    /*
    private EntityManager em;

    @Autowired
    public SpringConfigure(EntityManager em) {
        this.em = em;
    }
    */

    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfigure(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository);//생성자를 통해서 들어옴(생성자 주입)
    }

    //   @Bean
    //    public MemberRepository memberRepository(){
    //    return new JdbcMemberRepository(dataSource);
    //    return new JpaMemberRepository(em);
//    }
}
