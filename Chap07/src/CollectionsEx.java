import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsEx {
    private static void printList(LinkedList<String> l) {

        Iterator<String> iterator = l.iterator();
        while (iterator.hasNext()) {
            String e = iterator.next();
            String separator;
            if (iterator.hasNext()) {
                separator = "->";
            }
            else {
                separator = "\n";
            }
            System.out.print(e+separator);
        }

    }

    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<String>();
        myList.add("트랜스포머");
        myList.add("스타워즈");
        myList.add("매트릭스");
        myList.add(0, "터미네이터");
        myList.add(2, "아바타");

        Collections.sort(myList);
        printList(myList);
        System.out.println(myList); //myList객체를 프린트하면 []안에 표시되지만 원하는 형식을 맞추려면 toString클래스를 오버라이딩 하거나 다시 매소드를 만들어야할 것 같다
                                    //근데 굳이 toString하기보단 형식이 다른만큼 예제처럼 다시 만드는것도 나쁘지 않은듯.

        Collections.reverse(myList);
        printList(myList);

        int index = Collections.binarySearch(myList, "아바타") + 1;
        System.out.println("아바타는 " + index + "번째 요소입니다.");
    }

}
