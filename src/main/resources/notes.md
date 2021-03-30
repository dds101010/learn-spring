# Aspect Oriented Programming


**Common Applications:**
- Logging
- Transaction Management (Spring already provides `@Transactional`)
- Caching (???)
- Security

**Parts of AOP**
- JoinPoint ~ What to execute (represents actual business logic that we are proxying)
- PointCut  ~ Where to execute (for spring to know)
- Advice    ~ How to execute (i.e. Before, AfterThrowing, AfterReturning, Around)

As such if you are defining a logging aspect, JoinPoint method would contain your actual logging related code, PointCut method will help Spring decide for which all methods it needs to consider your logging aspect

## **Pointcut Syntax**
- TODO: check official documentation
```
designator("r p.c.m(arg)")
    - r is return type
    - p is package
    - c is class
    - m is method
    - arg is args
```

### Common Designators
1. execution: expression for matching method execution
2. within: expressions for matching certain types
3. target: expressions for matching a specific type
4. @annotation: expression for matching a specific annotation