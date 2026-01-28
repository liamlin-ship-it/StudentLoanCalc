class Phone {

    String brand;
    private int battery;
    int original;

    //屬性：要有什麼資料？
    Phone(String b , int bat){
         brand = b;
         battery = bat;
         original = bat;
    }

    //建構子：這個物件「出生」時要發生的事
    void playGame(){
        System.out.println(brand + " 正在玩遊戲，好耗電啊！");
        battery = battery - 10;
    }

    void charge(){
        System.out.println(brand + " 插上電源充電中...");
        battery = 100;
    }

    void showOriginal(){
        System.out.println("原本的電量 : " + original);
    }

    void showInfo(){
        System.out.println("目前 " + brand + " 的電量是 : " + battery);
    }

    boolean isDead(){
        if (battery <= 0){
            return  true;
        }else {
            return false;
        }
        //也可以只寫這樣 return battery <= 0;
    }

    void call(Phone otherPhone){
        System.out.println(this.brand + "正在打電話給" + otherPhone.brand);
        this.battery -= 5;   //自己耗電

        otherPhone.ring();
    }

    void ring(){
        System.out.println("叮鈴鈴！" + brand + "的電話響了！");
    }

    public void setBattery(int newBat){
        if (newBat < 0 || newBat > 100){
            System.out.println("錯誤：無效的電量數值！拒絕修改。");
        }else {
            battery = newBat;
            System.out.println("維修模式：電量已強制調整為" + battery);
        }
    }

    public int getBattery() {
        return battery;
    }
}

//繼承(直接接著上面Phone裡面的內容)
class SmartPhone extends Phone{

    // 然後透過 super() 傳給老爸(Phone)
    SmartPhone(String b, int bat){
        super(b, bat);
        //super代表"父類別"，這行意思是：把資料傳給老爸的建構子去處理
    }

    void internet(){
        System.out.println(brand + " 正在用 5G 上網看影片!!");
        setBattery(getBattery() - 20);
    }

    //覆寫:把前面的寫法蓋掉
    @Override
    void playGame(){
        System.out.println(brand + "正在玩超高清 3D 遊戲，手機發燙了！");
        //這裡我們要扣比較多電：30
        setBattery(getBattery() - 30);
    }
}

//這是程式真正開始「跑」的地方
public class oop {
    public static void main(String[] args) {

        SmartPhone sp = new SmartPhone("iPhone 17 Pro", 100);

        Phone[] myShop = new Phone[3];
        myShop[0] = new Phone("iPhone 16", 100);
        myShop[1] = new Phone("Samsung", 90);
        myShop[2] = new Phone("Pixel", 85);

        myShop[0].playGame();
        sp.playGame();
        sp.call(myShop[1]);
        sp.internet();
        sp.playGame();
        myShop[0].call(myShop[2]);
        myShop[1].call(myShop[0]);

        for (int i = 0; i < myShop.length; i++){
            myShop[i].showInfo();

            if (myShop[i].isDead()){
                System.out.println("手機死掉了ＱＱ");
            }else {
                System.out.println("還沒死!");
            }
        }

        for (int i = 0; i < myShop.length; i++){
            myShop[i].playGame();
            myShop[i].playGame();
            myShop[i].showInfo();
        }

        for (int i = 0; i < myShop.length; i++){
            myShop[i].setBattery(50);
            myShop[i].charge();
        }

        for (int i = 0; i < myShop.length; i++){
            myShop[i].showInfo();
            myShop[i].showOriginal();
            if (myShop[i].isDead()) {
                System.out.println("最後悲劇：手機沒電了！");
            } else {
                System.out.println("最後倖存：手機還有電！");
            }
        }
    }
}
