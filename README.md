# kafka-demo springboot+kafka实现

 * 使用了相对比较旧的springboot版本1.4.2
 * 想要使用spring-boot-autoconfigure进行自动加载是报错
 * Caused by: java.lang.ClassNotFoundException: org.springframework.boot.context.annotation.DeterminableImports
 * 原因是使用了较高版本的spring-boot-autoconfigure
 * 
 * 因此使用原始的Auto Configuration进行Bean的load
 * 需要配置KafkaTemplate和ConcurrentKafkaListenerContainerFactory
 * 
 * 自动配置版本，check另一个demo kafka-demo-configutaion
