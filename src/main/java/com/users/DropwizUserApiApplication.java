package com.users;

import com.users.api.UserService;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class DropwizUserApiApplication extends Application<DropwizUserApiConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DropwizUserApiApplication().run(args);
    }

    @Override
    public void run(final DropwizUserApiConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
        final UserService userApp = new UserService();
        environment.jersey().register(userApp);
    }

}
