package P0;

import P3.C14;
import P3.C15;

public class C0 {
    public void callC0() {
        System.out.println("call P0.C0");
        C1 c1 = new C1();
        c1.callC1();

        C2 c2 = new C2();
        c2.callC2();

        C3 c3 = new C3();
        c3.callC3();

        C4 c4 = new C4();
        c4.callC4();

        C6 c6 = new C6();
        c6.callC6();

        C14 c14 = new C14();
        c14.callC14();

        C15 c15 = new C15();
        c15.callC15();
    }
}
