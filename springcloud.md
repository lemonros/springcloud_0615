**微服务介绍**

优点：1.各服务的开发、测试、部署都相互独立，当用户量很大时，我们可以很容易对其进行负载；2.微服务可以跳过考虑新需求的兼容性、影响度等等问题；3.在微服务进行拆分后，只需要保证对外提供的接口正常可用，不需要考虑语言和框架

缺点：1.微服务的拆分基于业务，对于团队协作沟通带来挑战；2.修改接口时由于跨部门，沟通成本高；3.各服务之间相互独立，数据也是独立的，这使得保证数据的一致性成为难点

**SpringCloud**

服务追踪Zipkin
服务监控Actuator
服务配置Config
服务容错Hystrix
服务治理Eureka
服务通信Ribbon
服务通信Feign
服务网关Zuul

**服务网关Zuul**
Zuul是Netflix提供的一个开源API网关服务器，是客户端和网站后端所有请求的中间层，对外开放一个API，将所有
请求导入统一的入口，屏蔽了服务端的具体实现逻辑，Zuul可以实现反向代理的功能，在网关内部里实现动态路由、身
份认证、IP过滤、数据监控等。 zuul自带负载均衡功能

**Ribbon负载均衡**
Spring Cloud Ribbon是一个负载解决方案，Ribbon是Netflix发布的负载均衡器，Spring Cloud Ribbon是基
于Netflix Ribbon实现的，是一个用于对HTTP请求进行控制的负载均衡客户端。 在注册中心对Ribbon进行注册之后，
Ribbon就可以基于某种负载均衡算法，如轮询、随机、加权轮询、加权随机等自动帮助服务消费者调用接口。开发者也可
以根据具体业务需求自定义Ribbon负载均衡算法。在实际开发中，Spring Cloud Ribbon需要结合Spring Cloud 
Eureka来使用，Eureka Server提供所有可以调用的服务提供者列表，Ribbon基于特定的负载均衡算法从这些服务提
供者选择要调用的具体实例。

**Feign**
和Ribbon一样，Feign也是有Netflix提供的，Feign是一个声明式、模板化的Web Service客户端，它简化了开发
者编写Web服务客户端的操作，开发者可以通过简单的接口和注解来调用HTTP API,Spring Cloud Feign整合了
Ribbon 和 Hystrix，具有可插拔、基于注解、负载均衡、服务熔断等一系列的便捷功能。
相比较于Ribbon+RestTemplate的方式，Feign大大简化了代码的开发，Feign支持多种注解，包括Feign注解、
JAX-RS注解、Spring MVC注解等。Spring Cloud对Feign进行了优化，整合了Ribbon和Eureka，从而使Feign
更加便捷。

**Hystrix容错机制**
在不改变各个微服务调用关系的前提下，针对错误情况进行预先处理。

设计原则：1.服务隔离机制；2.服务降级机制；3.熔断机制；4.提供实时的监控和报警功能；5.提供实时的配置修改功能

Hystrix数据监控需要结合Spring Boot Actuator来使用，Actuator提供了对服务的健康监控、数据统计，可以通
过hystrix.stream节点获取监控的请求数据，提供了可视化的监控界面。

**Spring Cloud 配置中心**
Spring Cloud Config，通过服务端可以为多个客户端提供配置服务。Spring Cloud Config可以将配置文件存储
在本地，也可以将配置文件存储在远程Git仓库。创建Config Server组件。通过它管理所有配置文件。

本地文件系统