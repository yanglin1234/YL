package com;

import java.util.List;

/**
 * Created by lin.yang on 2017-09-08.
 */
public class Client {

    public Client() {
        System.out.println("Client");//3
    }

    static {



        System.out.println("static");//1
    }

    {
        System.out.println("空");//2
    }

    public static void main(String[] args) {
        new Client();
    }
}
