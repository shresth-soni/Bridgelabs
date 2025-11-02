// File: com/access/one/Base.java
package com.access.one;

public class Base {
    public void publicMethod() { System.out.println("Public method"); }
    protected void protectedMethod() { System.out.println("Protected method"); }
    void defaultMethod() { System.out.println("Default method"); }
    private void privateMethod() { System.out.println("Private method"); }
}
// File: com/access/two/Derived.java
package com.access.two;

import com.access.one.Base;

public class Derived extends Base {
    public void testAccess() {
        publicMethod();
        protectedMethod();
        // defaultMethod(); // ❌ Not accessible
        // privateMethod(); // ❌ Not accessible
    }
}
// File: com/access/two/Derived.java
package com.access.two;

import com.access.one.Base;

public class Derived extends Base {
    public void testAccess() {
        publicMethod();
        protectedMethod();
        // defaultMethod(); // ❌ Not accessible
        // privateMethod(); // ❌ Not accessible
    }
}
// File: MainApp.java
import com.access.two.Derived;

public class MainApp {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.testAccess();
    }
}
