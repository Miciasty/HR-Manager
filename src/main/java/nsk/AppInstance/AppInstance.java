package src.main.java.nsk.AppInstance;

import src.main.java.nsk.Application;

public class AppInstance {

    private static Application application;

    public static void setApplication(Application app) { application = app;  }

    public static Application getApplication() { return application; }

}
