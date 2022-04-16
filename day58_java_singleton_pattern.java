import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{
    private Singleton(){}
    public String str;
    private static Singleton instance = null;
    public static Singleton getSingletoninstance(){
        if (istance == null ){
            instance = new Singleton();
        }
        return instance;
    }

}
