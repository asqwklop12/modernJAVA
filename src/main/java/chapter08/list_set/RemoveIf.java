package chapter08.list_set;

import chapter08.Transaction;

import java.util.Iterator;
import java.util.List;

public class RemoveIf {

    public void removeIfE(List<Transaction> transactions) {
        for (Transaction transaction : transactions) {
            if (Character.isDigit(transaction.getReferenceCode().charAt(0))) {
                transactions.remove(transaction);
            }
        }
    }

    // 다음과 같이 해석됨
    public void removeIfS(List<Transaction> transactions) {
        for (Iterator<Transaction> iterator = transactions.iterator(); iterator.hasNext(); ) {
            Transaction transaction = iterator.next();
            if (Character.isDigit(transaction.getReferenceCode().charAt(0))) {
                transactions.remove(transaction);
            }

        }
    }

    //하지만 문제가 밣생한다.
    // 두개의 개별 객체,next(), hasNext()를 이용해 소스를 질의한다.
    // Collection 객체 자체, remove()를 호출해 요소를 삭제한다.

    public void removeIfT(List<Transaction> transactions) {
        for (Iterator<Transaction> iterator = transactions.iterator(); iterator.hasNext(); ) {
            Transaction transaction = iterator.next();
            if (Character.isDigit(transaction.getReferenceCode().charAt(0))) {
                iterator.remove();
            }

        }
    }

    // 자바 8
    public void removeIf(List<Transaction> transactions) {
        transactions.removeIf(transaction ->
                Character.isDigit(transaction.getReferenceCode().charAt(0)));
    }

}
