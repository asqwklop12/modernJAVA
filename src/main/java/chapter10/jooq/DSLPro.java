package chapter10.jooq;

import java.sql.SQLException;

public class DSLPro {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        Class.forName("org.h2.Driver");
//
//        try(Connection c = getConnection("","sa","")) {
//            DSL.using(c)
//               .select(BOOK.AUTHOR,BOOK.TITLE)
//               .where(BOOK.PUBLISHED_IN.eq(2016))
//               .orderBy(BOOK.TITLE)
//              .fetch()
//              .stream()
//              .collect(groupingBy(r -> r.getValue(BOOK.AUTHOR),
//                      LinkedHashMap::new,
//                      Collectors.mapping(r -> r.getValue(BOOK.TITLE), Collectors.toList())))
//                    .forEach((author,titles) -> System.out.println(author + " is author of " + titles));
//        }
    }
}
