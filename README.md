# Spring In Action Travel
---
## 1. Spring之旅

* 依赖注入
* AOP
* bean的初始化过程
* spring容器
* Spring还有很多值得学习的框架

**Run Project:** [spring-start](https://github.com/DeceiverWu/Spring-In-Action/tree/master/spring-start)

## 2. 装配Bean

* “initialization on demand holder”创建单例模式的理解,参考 [Initialization-on-demand holder idiom](https://en.wikipedia.org/wiki/Initialization-on-demand_holder_idiom)
* 声明bean
* 构造器注入和Setter方法注入
* 装配bean
* 控制bean的创建和销毁

**Run Project:** [spring-ioc](https://github.com/DeceiverWu/Spring-In-Action/tree/master/spring-ioc)

## 3. 高级装配

* Spring pofile
* 条件化的bean声明
* 自动装配与歧义性(Primary、Qualifier)
* bean的作用域(Singleton、Prototype、Session、Request)
* Spring的表达语言(SpEL)

**Run Project:** [spring-ioc-autodiscovery](https://github.com/DeceiverWu/Spring-In-Action/tree/master/spring-ioc-autodiscovery)

## 4. 面向切面的Spring

* Spring对AOP的支持局限于方法拦截
* 注入式AspectJ切面(适用于任何版本)
* Spring AOP 应用场景
* Before、After、Around Advice

**Run Project(xml):** [spring-aop-xml](https://github.com/DeceiverWu/Spring-In-Action/tree/master/spring-aop-xml)

**Run Project(config):** [spring-aop-aspectj](https://github.com/DeceiverWu/Spring-In-Action/tree/master/spring-aop-aspectj)

## 5. 利用Spring Mvc构建Web应用程序

* 映射请求到Spring控制器
* 透明地绑定表单参数
* 校验表单提交

**Run Project:** [spitter-web](https://github.com/DeceiverWu/Spring-In-Action/tree/master/spitter-web)

## 6. Springboot 之旅

* 基于maven、spring，依赖已封装
* Restful风格注解
* 配置文件更替为properties，不再使用xml作为web配置文件
* 资源整合

**Run Project:** [springboot-start](https://github.com/DeceiverWu/Spring-In-Action/tree/master/springboot-start)

## 7. Springboot使用Jdbc构建Web应用

* Jdbc Template的使用

**Run Project:** [springboot-jdbc](https://github.com/DeceiverWu/Spring-In-Action/tree/master/springboot-jdbc)
