package io.maxilog.config;

import io.maxilog.service.dto.UserHolder;
import io.maxilog.web.rest.OrderResource;
import org.eclipse.microprofile.jwt.JsonWebToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;

//@ApplicationScoped
public class WebConfiguration {


    private static final Logger LOGGER = LoggerFactory.getLogger(OrderResource.class);

    @RequestScoped
    @Produces
    public UserHolder userHolder(JsonWebToken jsonWebToken){
        LOGGER.debug("Creating UserHolder of {}", jsonWebToken.getName());
        return new UserHolder(jsonWebToken.getName());
    }
}
