package com.users.db;

import com.users.resources.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDB {
    private static Map<Integer,User> users = new HashMap<Integer, User>();

    static{
        users.put(1, new User(1,"User1","User","one"));
        users.put(2, new User(2,"User2","UserTwo","two"));
        users.put(3, new User(2,"User3","UserThree","three"));
    }

    public static List<User> getUsers(){
        List<User> temp = new ArrayList<User>();
        for(Integer index: users.keySet()){
            temp.add(users.get(index));
        }
        return temp;
    }

    public static String saveUser(User usr){
        String status = "";
        if(users.get(usr.getId()) != null){
            status = "User ID:" + usr.getId() + " Updated";
        }else{
            status = "User ID:" + usr.getId() + " Successfully Added";
        }
        users.put(usr.getId(), usr);
        return status;
    }
}
