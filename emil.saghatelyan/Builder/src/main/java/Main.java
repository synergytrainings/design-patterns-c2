import com.synisys.builder.Query;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        Query query = new Query.QueryBuilder().select("id").select("name").from("Users").where("name=Jone").where("id>5").build();
        System.out.println(query.getQuery().toString());

    }
}
