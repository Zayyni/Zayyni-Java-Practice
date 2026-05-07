class MSWord extends Thread {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        if (name.equals("TYPE")) {
            typing();
        }
        else if (name.equals("SPELL")) {
            spellCheck();
        }else {
            autoSaving();
        }
    }
    public void typing(){
        try {
            for (int i=0; i<3; i++)
            {
                System.out.println("Typing ............");
                Thread.sleep(3000);
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void spellCheck(){
        try {
            for (;;)
            {
                System.out.println("Spell Checking ............");
                Thread.sleep(3000);
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void autoSaving()
    {
        try {
            for (;;)
            {
                System.out.println("Auto-Saving ............");
                Thread.sleep(3000);
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class LaunchThread9
{
    public static void main(String[] args) {
        MSWord mst1=new MSWord();
        MSWord mst2=new MSWord();
        MSWord mst3=new MSWord();

        mst1.setName("TYPE");
        mst2.setName("SPELL");
        mst3.setName("SAVING");

        mst2.setDaemon(true);
        mst3.setDaemon(true);

        mst2.setPriority(3);
        mst3.setPriority(4);

        mst1.start();
        mst2.start();
        mst3.start();
    }
}
