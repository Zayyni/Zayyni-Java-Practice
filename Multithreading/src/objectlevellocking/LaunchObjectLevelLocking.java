package objectlevellocking;

public class LaunchObjectLevelLocking {
    public static void main(String[] args) {
        MCBBank bank = new MCBBank(4000);
        ATM atm = new ATM(bank);
        atm.setName("ATM Thread");
        JazzCash jazzCash = new JazzCash(bank);
        jazzCash.setName("Jazz Cash Thread");
        EasyPaisa easyPaisa = new EasyPaisa(bank);
        easyPaisa.setName("EasyPaisa Thread");
        
    }
}
