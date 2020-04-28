package com.sodonnell.jerseySample;

import org.glassfish.jersey.internal.inject.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;
import javax.inject.Singleton;

public class TestApplication extends ResourceConfig {
    public TestApplication() {
      super(TestApplication.class);

      register(new MyBinder());
      packages(true, "com.sodonnell.s3OnHdfs");
    }

    /* Bind is used to let jersey know what can be injected */
    private static class MyBinder extends AbstractBinder {
      @Override
      protected void configure() {
        bind(AppSingleton.class).to(AppSingleton.class).in(Singleton.class);
      }
    }
}