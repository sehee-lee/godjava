package ch12;

import c.service.*;
import c.model.MemberDTO;

public class InterfaceExample {
    public static void main(String args[]) {
        MemberManager manager = new MemberManagerImpl();

        MemberDTO member_1 = new MemberDTO("sehee", "01010102020", "sehee@abc.com");

        manager.addMember(member_1);
        manager.removeMember("sehee","20123");
        manager.updateMember(member_1);

        MemberManagerImpl2 manager2 = new MemberManagerImpl2();

        manager2.addMember(member_1);
        manager2.printLog(member_1.toString());
    }
}
