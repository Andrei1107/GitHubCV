package Exercise5;

import java.util.ArrayList;

public class AstericsHorizontal2 extends ArrayList {


    @Override
    public String toString() {
        String result="  ";
        for(int i=0;i<super.size();i++){
            result+=super.get(i);
        }
        return result;
    }
}
