package com.java.fundamentals.nestedclasses;

public class Outer {
    static int outerStaticMember;
    private int outerPrivateMember;

    public static int getOuterStaticMember() {
        return outerStaticMember;
    }

    public static void setOuterStaticMember(int outerStaticMember) {
        Outer.outerStaticMember = outerStaticMember;
    }

    public int getOuterPrivateMember() {
        return outerPrivateMember;
    }

    public void setOuterPrivateMember(int outerPrivateMember) {
        this.outerPrivateMember = outerPrivateMember;
    }

    static class StaticInner {
        static int staticInnerStaticMember;
        private int staticInnerPrivateMember;

        public static int getStaticInnerStaticMember() {
            return staticInnerStaticMember;
        }

        public static void setStaticInnerStaticMember(int staticInnerStaticMember) {
            StaticInner.staticInnerStaticMember = staticInnerStaticMember;
        }

        public int getStaticInnerPrivateMember() {
            return staticInnerPrivateMember;
        }

        public void setStaticInnerPrivateMember(int staticInnerPrivateMember) {
            this.staticInnerPrivateMember = staticInnerPrivateMember;
        }

        void fun() {
            int outerPrivateMember = new Outer().outerPrivateMember;
        }
    }

    // Inner class
    public class PublicInner {
        private int publicInner;
    }

    private class PrivateInner {
        private int privateOuterMember;
    }


}
