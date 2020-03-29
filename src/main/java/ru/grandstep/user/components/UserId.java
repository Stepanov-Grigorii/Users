package ru.grandstep.user.components;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserId {
    private static List<String> id = new ArrayList<>();
    static final int min = 0;
    static final int max = 9;
    static String getUserId(String fName, String lName){
        String uniqId = String.valueOf(fName.charAt(0)) + lName.charAt(0);
        uniqId += new Random().nextInt(10);
        uniqId += new Random().nextInt(9) + 1;
        uniqId += (char)(new Random().nextInt(26) + 'A');
        uniqId += (char)(new Random().nextInt(26) + 'A');
        uniqId += (char)(new Random().nextInt(26) + 'A');
        if(!id.isEmpty() && id.contains(uniqId)){
            return getUserId(fName, lName);
        }
        id.add(uniqId);
        return uniqId;
    }
}
