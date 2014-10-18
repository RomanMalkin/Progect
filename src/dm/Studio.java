package dm;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by user on 27.09.2014.
 */
public class Studio {

    int width;
    int height;
    int depth;

    // Конструктор
    Studio() {
        width = 10;
        height = 10;
        depth = 10;
    }
    int getV() {
        return width * height * depth;
    }

    static Studio st = new Studio();



    public static void main(String[] args) {
        System.out.println(st.getV());
    }

    }


