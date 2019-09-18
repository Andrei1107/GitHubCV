package Exercise5;

import java.util.ArrayList;
import java.util.List;

public class AstericsHorizontal {

    ArrayList<String> lista = new ArrayList<String>();

    public AstericsHorizontal(ArrayList e) {

        this.lista = e;

    }

    @Override
    public String toString() {

        String result = "  ";
        for (int i = 0; i < lista.size(); i++) {
            result = result + lista.get(i);
        }
        return result;

    }



}
