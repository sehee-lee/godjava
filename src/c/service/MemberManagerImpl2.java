package c.service;

import c.model.MemberDTO;

import java.lang.reflect.Member;

public class MemberManagerImpl2 extends MemberManagerAbstract {
    public boolean addMember(MemberDTO member) {
        if (member == null) {
            System.out.println("check member!!");
            return false;
        }

        System.out.println("new member added(" + member.toString() + ")");
        return true;
    }

    public boolean removeMember(String name, String phone) {
        if (name == null || phone == null) {
            System.out.println("check member!!");
            return false;
        }

        System.out.println("new member removed(" + name + "/" + phone + ")");
        return true;
    }

    public boolean updateMember(MemberDTO member) {
        if (member == null) {
            System.out.println("check member!!");
            return false;
        }

        System.out.println("new member updated(" + member.toString() + ")");
        return true;
    }
}
