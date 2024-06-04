package view;

import data.User;

import java.util.List;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);/*{
        for (T user : users)
            System.out.println(user);
    };*/
}
