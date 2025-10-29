package musterrrs.SorterApp.linkedlist;

public class ListApp {
    public static void main(String[] args) {
        System.out.println("###MYLinkedList<String> Test####");
        PrivLinkedList<String> list = new PrivLinkedList<>();
        System.out.println("######################");
        System.out.println("\n 1.Add(Element) und Size() ");
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("erwartetes Ergebnis --> [A -> B -> C ] ");
        System.out.println("Ergebnis " + list);
        System.out.println("Erwartetes Size : 3 , Ergebnis : " + list.size());

        System.out.println("############################");
        System.out.println();
        System.out.println("\n 2.get(index) Testet");
        System.out.println("Erwartete für Index 1 : B");
        System.out.println("Ergebnis : " + list.get(1));

        System.out.println("#######################");
        System.out.println();
        System.out.println("\n 3. add(index , element) test");
        list.addIndex(1, "X");
        System.out.println("Erwrtetes Ergebnis ->>> [A -> X -> B -> C->)");
        System.out.println("Ergebnis " + list);

        System.out.println();
        System.out.println("Erwartete Size ; 4 ||| Size = " + list.size());
        list.addIndex(0, " Start ");
        System.out.println("Das Wort „start“ wurde an den Anfang der Liste gesetzt. " + list);
        list.addIndex(5, "Ende");
        System.out.println("Das Wort „ende“ wurde an den Ende der Liste gesetzt." + list);
        System.out.println("Erwartete Size ; 6 || Size == " + list.size());

        System.out.println("####################");
        System.out.println();
        System.out.println("\n 4.Remove ( Int Index )  test ");
        String removed = list.remove(2);
        System.out.println("Index 2 ist loschen : INDEX(2) = " + removed);
        System.out.println("Erwartetes Ergebnis : [Start-> A -> B -> C -> Ende]");
        System.out.println("Ergebnis : " + list);

        removed = list.remove(0);
        System.out.println("Erste Element wird geloscht ! Erste Element == " + removed);
        System.out.println("Erwartetes Ergebnis :  [ A -> B -> C -> Ende]");
        System.out.println("Ergebnis ; " + list);

        System.out.println("\n### Test beendet ###");

    }}

