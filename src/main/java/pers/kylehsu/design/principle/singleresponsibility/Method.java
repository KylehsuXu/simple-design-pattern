package pers.kylehsu.design.principle.singleresponsibility;

/**
 * Created by kylehsu
 */
public class Method {
    private void updateUserInfo(String userName,String address){
        userName = "kylehsu";
        address = "beijing";
    }

    private void updateUserInfo(String userName,String... properties){
        userName = "kylehsu";
//        address = "beijing";
    }

    private void updateUsername(String userName){
        userName = "kylehsu";
    }
    private void updateUserAddress(String address){
        address = "beijing";
    }

    private void updateUserInfo(String userName,String address,boolean bool){
        if(bool){
            //todo something1
        }else{
            //todo something2
        }


        userName = "kylehsu";
        address = "beijing";
    }


}
