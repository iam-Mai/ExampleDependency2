package P0;

import P1.C8;
import P2.C10;

public class C1 {
    public void callC1() {
        System.out.println("call P0.C1");

        C3 c3 = new C3();
        c3.callC3();

        C4 c4 = new C4();
        c4.callC4();

        C5 c5 = new C5();
        c5.callC5();

        C6 c6 = new C6();
        c6.callC6();

        C8 c8 = new C8();
        c8.callC8();

        C10 c10 = new C10();
        c10.callC10();
    }
}
