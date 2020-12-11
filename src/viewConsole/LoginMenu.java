package viewConsole;
import java.util.List;

public class LoginMenu extends BaseMenu{

    public LoginMenu(List<MenuItem> menu) {
        super(menu);
    }

    @Override
    public int show() {
        System.out.println("********************");
        System.out.println("Login menu");
        showItems(menu);
        System.out.println("--------------------");
        System.out.println("0. Exit from program");
        System.out.println("********************");
        System.out.print("Make your choice: ");
        String choice =  scanner.nextLine();
        if(isNumeric(choice)) return Integer.parseInt(choice);
        else return -1;
    }

//    @Override
//    public void exit() {
//        System.exit(0);
//    }

}
