package chapter10.spring;

import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

//    @Bean
//    public MessageSource<?> integerMessageSource() {
//        MethodInvokingMessageSource source =
//                new MethodInvokingMessageSource();
//        source.setObject(new AtomicInteger());
//        source.setMethodName("getAndIncrement");
//        return source;
//    }
//
//    @Bean
//    public DirectChannel inputChannal() {
//        return new DirectChannel();
//    }
//
//    @Bean
//    public IntegrationFlow myFlow() {
//        return IntegerationFlows
//                .from(this.integerMessageSource(),
//                        c -> c.poller(Pollers.fixedRate(10)))
//                .channel(this.inputChannal())
//                .filter((Integer p) -> p % 2 == 0 )
//                .transform(Object::toString)
//                .channel(MessageSources.queue("queueChannel"))
//                .get();
//    }
//
//    @Bean
//    public IntegrationFlow myFlow2() {
//        return flow -> flow.filter((Integer p) -> p %2 == 0)
//                           .transform(Object::toString)
//                            .handle(System.out::println);
//    }
}
