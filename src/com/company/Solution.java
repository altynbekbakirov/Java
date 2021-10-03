package com.company;

import java.io.*;
import java.net.SocketException;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {


    }

    static class MyException extends NullPointerException {
    }

    static class MyException2 extends FileNotFoundException {
    }

    static class MyException3 extends MyException {
    }

    static class MyException4 extends MyException2 {
    }

}


