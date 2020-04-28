Template for a very simple Jersey REST application.

When started there is a greeter service at root and the same service at /hello.

Calling:

    http://host/bob

Will return:

    hi bob

Calling:

    http://host/hello/bob

Will return the same.

There is also a simple class called AppSingleton to demonstrate how to bind and inject it to the resources.

Initial setup based on:

https://medium.com/@madhawacperera/simple-java-restful-web-service-with-jersey-jax-rs-implementation-615739857961

And this one to get Tomcat running in the IDE etc:

https://medium.com/@madhawacperera/how-to-run-debug-your-web-application-with-intellij-idea-and-tomcat-ea30c3d15ba0
