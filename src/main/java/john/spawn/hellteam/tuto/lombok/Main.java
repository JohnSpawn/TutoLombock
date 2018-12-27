package john.spawn.hellteam.tuto.lombok;

/**
 * Test class
 */
public class Main {

    public static void main(String[] args){

        UserBean user = new UserBean();
        UserBean user2 = new UserBean(25, "nom", "prenom");

        UserBean.UserBeanBuilder user3 = UserBean.builder()
                .nom("user3");

        System.out.println(user2.toString());
    }

}
