package com.users.api;

import com.codahale.metrics.annotation.Timed;
import com.users.db.UserDB;
import com.users.resources.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/user")
public class UserService {

    public UserService(){

    }

    @GET
    @Timed
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> getUsers(){
        return UserDB.getUsers();
    }

    @POST
    @Timed
    @Path("/add")
    @Consumes({MediaType.APPLICATION_JSON})
    public String addUser(User usr){
        return UserDB.saveUser(usr);
    }
}
