package objectlevellocking;


public class LaunchObjectLevelLocking {
    public static void main(String[] args) {
        MCBBank bank = new MCBBank(4000);
        ATM atm = new ATM();
        atm.setName("ATM Thread");
        JazzCash jazzCash = new JazzCash();
        jazzCash.setName("Jazz Cash Thread");
        EasyPaisa easyPaisa = new EasyPaisa();
        easyPaisa.setName("EasyPaisa Thread");

        atm.start();
        jazzCash.start();
        easyPaisa.start();

    }
}
