package classlevellocking;

public class LaunchObjectLevelLocking {
    public static void main(String[] args) {
        MCBBank bank = new MCBBank();
        MCBBank bank2 = new MCBBank();
        ATM atm = new ATM(bank);
        atm.setName("ATM Thread");
        JazzCash jazzCash = new JazzCash(bank2);
        jazzCash.setName("Jazz Cash Thread");
        EasyPaisa easyPaisa = new EasyPaisa(bank);
        easyPaisa.setName("EasyPaisa Thread");

        atm.start();
        jazzCash.start();
        easyPaisa.start();

    }
}
