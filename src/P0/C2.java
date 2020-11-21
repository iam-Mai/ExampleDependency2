package P0;

import P3.C13;

public class C2 {
    public void callC2() {
        System.out.println("call P0.C2");
        C3 c3 = new C3();
        c3.callC3();
    }
}
