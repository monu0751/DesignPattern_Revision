package DesignPattern.Facade.helper;

import DesignPattern.Facade.UserService;

public class UserHelper {
    UserService userService = new UserService();
    public void processUser(){
        userService.validateUser();
        userService.fetchUserDetail();
    }
}
