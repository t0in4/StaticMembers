import staticmember.OtherClass;
import staticmember.SomeClass;

import java.awt.desktop.OpenFilesHandler;

public class Main {
    public static void main(String[] args) {

        SomeClass.staticIntField = 10;
        //SomeClass.staticStringField = "it's a static member";
        SomeClass someClass1 = new SomeClass();
        someClass1.staticStringField = "it's a static member";
        SomeClass someClass3 = new SomeClass();
        someClass3.nonStaticStringField = "it's a non static member";

        System.out.println(SomeClass.staticIntField);
        System.out.println(SomeClass.staticStringField);
        // создали без экземпляра класса, напрямую
        System.out.println(OtherClass.lastCreated);

        OtherClass otherClass1 = new OtherClass();
        // предварительно создали экземпляр класса otherClass1
        System.out.println(otherClass1.lastCreated);

        // без экземпляра (или инстанса) класса ThirdClass
        System.out.println(ThirdClass.lastCreated);

        // предварительно создали экземпляр класса thirdClass1
        ThirdClass thirdClass1 = new ThirdClass();
        System.out.println(thirdClass1.lastCreated);

        SomeClass someClass2 = new SomeClass();
        System.out.println(someClass2.staticStringField);
        SomeClass someClass4 = new SomeClass();
        System.out.println(someClass4.nonStaticStringField);
    }
}